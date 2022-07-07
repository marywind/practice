package com.company.test.screen.deals;

import com.company.test.entity.Cars;
import com.company.test.entity.Clients;
import io.jmix.core.DataManager;
import io.jmix.core.querycondition.Condition;
import io.jmix.core.querycondition.LogicalCondition;
import io.jmix.core.querycondition.PropertyCondition;
import io.jmix.ui.component.ValidationErrors;
import com.company.test.entity.Deals;
import io.jmix.ui.screen.EditedEntityContainer;
import io.jmix.ui.screen.StandardEditor;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@UiController("Deals.edit")
@UiDescriptor("deals-edit.xml")
@EditedEntityContainer("dealsDc")
public class DealsEdit extends StandardEditor<Deals> {

    @Autowired
    private DataManager dataManager;
    @Override
    protected void validateAdditionalRules(ValidationErrors errors) {
        if (isExistCarInRelevantDeal(getEditedEntity())) {
            errors.add("Данное авто занято на это время другим клиентом");
        } else if (isLicenseExpired(getEditedEntity())) {
            errors.add("Истечение срока действия прав");
        }
        super.validateAdditionalRules(errors);
    }
    private boolean isExistCarInRelevantDeal(Deals deal) {
        Optional<Deals> existedDeal = dataManager.load(Deals.class)
                .condition(
                        LogicalCondition.or(
                                LogicalCondition.and(
                                        PropertyCondition.equal("car.id", deal.getCar().getId()),
                                        PropertyCondition.greaterOrEqual("deal_date", deal.getDeal_date()),
                                        PropertyCondition.lessOrEqual("deal_date", deal.getReturn_date_expected())
                                ),
                                LogicalCondition.and(
                                        PropertyCondition.equal("car.id", deal.getCar().getId()),
                                        PropertyCondition.lessOrEqual("deal_date", deal.getDeal_date()),
                                        PropertyCondition.greaterOrEqual("return_date_expected", deal.getDeal_date())
                                )
                        )
                )
                .optional();
        return existedDeal.isPresent();
    }
    private boolean isLicenseExpired(Deals deal) {
        Optional<Deals> existedDeal = dataManager.load(Deals.class)
                .condition(
                        LogicalCondition.or(
                                PropertyCondition.greater("return_date_expected", deal.getClient().getLicense_date_expiration()),
                                PropertyCondition.less("deal_date", deal.getClient().getLicense_date())
                        )
                )
                .optional();
        return existedDeal.isPresent();
    }
}
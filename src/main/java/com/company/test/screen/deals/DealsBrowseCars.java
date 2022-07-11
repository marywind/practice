package com.company.test.screen.deals;

import com.company.test.entity.Deals;
import io.jmix.core.DataManager;
import io.jmix.ui.component.GroupTable;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

@UiController("Deals.browse.cars")
@UiDescriptor("deals-browse-cars.xml")
@LookupComponent("dealsesTable")
public class DealsBrowseCars extends StandardLookup<Deals> {

    @Install(to = "dealsesTable", subject = "styleProvider")
    private String dealsesTableStyleProvider(Deals deals, String property) {
        if (property == null) {
            if (deals.getReturn_date_actual()==null) return "green-test";
        }
        return null;
    }
}
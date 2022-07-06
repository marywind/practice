package com.company.test.screen.deals;

import io.jmix.ui.screen.*;
import com.company.test.entity.Deals;

@UiController("Deals.edit")
@UiDescriptor("deals-edit.xml")
@EditedEntityContainer("dealsDc")
public class DealsEdit extends StandardEditor<Deals> {
}
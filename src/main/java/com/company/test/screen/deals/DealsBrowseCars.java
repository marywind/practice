package com.company.test.screen.deals;

import com.company.test.entity.Deals;
import io.jmix.ui.screen.LookupComponent;
import io.jmix.ui.screen.StandardLookup;
import io.jmix.ui.screen.UiController;
import io.jmix.ui.screen.UiDescriptor;

@UiController("Deals.browse.cars")
@UiDescriptor("deals-browse-cars.xml")
@LookupComponent("dealsesTable")
public class DealsBrowseCars extends StandardLookup<Deals> {
}
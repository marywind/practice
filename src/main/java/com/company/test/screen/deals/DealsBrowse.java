package com.company.test.screen.deals;

import io.jmix.ui.screen.*;
import com.company.test.entity.Deals;

@UiController("Deals.browse")
@UiDescriptor("deals-browse.xml")
@LookupComponent("dealsesTable")
public class DealsBrowse extends StandardLookup<Deals> {
}
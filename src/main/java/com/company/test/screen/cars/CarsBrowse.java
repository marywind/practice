package com.company.test.screen.cars;

import io.jmix.ui.screen.*;
import com.company.test.entity.Cars;

@UiController("Cars.browse")
@UiDescriptor("cars-browse.xml")
@LookupComponent("carsesTable")
public class CarsBrowse extends StandardLookup<Cars> {
}
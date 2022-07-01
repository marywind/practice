package com.company.test.screen.car;

import io.jmix.ui.screen.*;
import com.company.test.entity.Car;

@UiController("Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
public class CarBrowse extends StandardLookup<Car> {
}
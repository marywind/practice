package com.company.test.screen.car;

import io.jmix.ui.screen.*;
import com.company.test.entity.Car;

@UiController("Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
public class CarEdit extends StandardEditor<Car> {
}
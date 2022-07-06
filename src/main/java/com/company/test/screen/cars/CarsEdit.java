package com.company.test.screen.cars;

import io.jmix.ui.screen.*;
import com.company.test.entity.Cars;

@UiController("Cars.edit")
@UiDescriptor("cars-edit.xml")
@EditedEntityContainer("carsDc")
public class CarsEdit extends StandardEditor<Cars> {
}
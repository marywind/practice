package com.company.test.screen.clients;

import io.jmix.ui.screen.*;
import com.company.test.entity.Clients;

@UiController("Clients.edit")
@UiDescriptor("clients-edit.xml")
@EditedEntityContainer("clientsDc")
public class ClientsEdit extends StandardEditor<Clients> {
}
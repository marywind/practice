package com.company.test.screen.client;

import io.jmix.ui.screen.*;
import com.company.test.entity.Client;

@UiController("Client.edit")
@UiDescriptor("client-edit.xml")
@EditedEntityContainer("clientDc")
public class ClientEdit extends StandardEditor<Client> {
}
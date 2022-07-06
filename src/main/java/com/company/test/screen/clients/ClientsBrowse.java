package com.company.test.screen.clients;

import io.jmix.ui.screen.*;
import com.company.test.entity.Clients;

@UiController("Clients.browse")
@UiDescriptor("clients-browse.xml")
@LookupComponent("clientsesTable")
public class ClientsBrowse extends StandardLookup<Clients> {
}
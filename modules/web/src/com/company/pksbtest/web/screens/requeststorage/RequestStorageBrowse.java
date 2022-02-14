package com.company.pksbtest.web.screens.requeststorage;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorage;

@UiController("pksbtest_RequestStorage.browse")
@UiDescriptor("request-storage-browse.xml")
@LookupComponent("requestStoragesTable")
@LoadDataBeforeShow
public class RequestStorageBrowse extends StandardLookup<RequestStorage> {
}
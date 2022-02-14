package com.company.pksbtest.web.screens.requeststorage;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorage;

@UiController("pksbtest_RequestStorage.edit")
@UiDescriptor("request-storage-edit.xml")
@EditedEntityContainer("requestStorageDc")
@LoadDataBeforeShow
public class RequestStorageEdit extends StandardEditor<RequestStorage> {
}
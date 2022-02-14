package com.company.pksbtest.web.screens.requeststorageline;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorageLine;

@UiController("pksbtest_RequestStorageLine.edit")
@UiDescriptor("request-storage-line-edit.xml")
@EditedEntityContainer("requestStorageLineDc")
@LoadDataBeforeShow
public class RequestStorageLineEdit extends StandardEditor<RequestStorageLine> {
}
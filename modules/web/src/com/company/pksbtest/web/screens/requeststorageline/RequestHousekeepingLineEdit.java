package com.company.pksbtest.web.screens.requeststorageline;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorageLine;

@UiController("pksbtest_RequestHousekeepingLine.edit")
@UiDescriptor("request-housekeeping-line-edit.xml")
@EditedEntityContainer("requestStorageLineDc")
@LoadDataBeforeShow
public class RequestHousekeepingLineEdit extends StandardEditor<RequestStorageLine> {
}
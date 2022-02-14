package com.company.pksbtest.web.screens.requeststorageline;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorageLine;

@UiController("pksbtest_RequestLoadingCablingLine.edit")
@UiDescriptor("request-loading-cabling-line-edit.xml")
@EditedEntityContainer("requestStorageLineDc")
@LoadDataBeforeShow
public class RequestLoadingCablingLineEdit extends StandardEditor<RequestStorageLine> {
}
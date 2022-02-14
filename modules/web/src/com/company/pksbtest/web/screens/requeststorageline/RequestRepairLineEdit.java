package com.company.pksbtest.web.screens.requeststorageline;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorageLine;

@UiController("pksbtest_RequestRepairLine.edit")
@UiDescriptor("request-repair-line.xml")
@EditedEntityContainer("requestStorageLineDc")
@LoadDataBeforeShow
public class RequestRepairLineEdit extends StandardEditor<RequestStorageLine> {
}
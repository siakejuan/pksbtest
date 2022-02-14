package com.company.pksbtest.web.screens.requestrepair;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestRepair;

@UiController("pksbtest_RequestRepair.edit")
@UiDescriptor("request-repair-edit.xml")
@EditedEntityContainer("requestRepairDc")
@LoadDataBeforeShow
public class RequestRepairEdit extends StandardEditor<RequestRepair> {
}
package com.company.pksbtest.web.screens.requesthousekeepingcleaningstuffing;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestHousekeepingCleaningStuffing;

@UiController("pksbtest_RequestHousekeepingCleaningStuffing.edit")
@UiDescriptor("request-housekeeping-cleaning-stuffing-edit.xml")
@EditedEntityContainer("requestHousekeepingCleaningStuffingDc")
@LoadDataBeforeShow
public class RequestHousekeepingCleaningStuffingEdit extends StandardEditor<RequestHousekeepingCleaningStuffing> {
}
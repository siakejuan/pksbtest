package com.company.pksbtest.web.screens.requesthousekeepingcleaningstuffing;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestHousekeepingCleaningStuffing;

@UiController("pksbtest_RequestHousekeepingCleaningStuffing.browse")
@UiDescriptor("request-housekeeping-cleaning-stuffing-browse.xml")
@LookupComponent("requestHousekeepingCleaningStuffingsTable")
@LoadDataBeforeShow
public class RequestHousekeepingCleaningStuffingBrowse extends StandardLookup<RequestHousekeepingCleaningStuffing> {
}
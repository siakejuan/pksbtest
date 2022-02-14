package com.company.pksbtest.web.screens.requestrepair;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestRepair;

@UiController("pksbtest_RequestRepair.browse")
@UiDescriptor("request-repair-browse.xml")
@LookupComponent("requestRepairsTable")
@LoadDataBeforeShow
public class RequestRepairBrowse extends StandardLookup<RequestRepair> {
}
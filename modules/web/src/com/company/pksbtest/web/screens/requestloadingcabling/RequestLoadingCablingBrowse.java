package com.company.pksbtest.web.screens.requestloadingcabling;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestLoadingCabling;

@UiController("pksbtest_RequestLoadingCabling.browse")
@UiDescriptor("request-loading-cabling-browse.xml")
@LookupComponent("requestLoadingCablingsTable")
@LoadDataBeforeShow
public class RequestLoadingCablingBrowse extends StandardLookup<RequestLoadingCabling> {
}
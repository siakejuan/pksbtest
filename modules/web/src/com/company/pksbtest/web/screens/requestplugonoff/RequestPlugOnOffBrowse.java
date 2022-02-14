package com.company.pksbtest.web.screens.requestplugonoff;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestPlugOnOff;

@UiController("pksbtest_RequestPlugOnOff.browse")
@UiDescriptor("request-plug-on-off-browse.xml")
@LookupComponent("requestPlugOnOffsTable")
@LoadDataBeforeShow
public class RequestPlugOnOffBrowse extends StandardLookup<RequestPlugOnOff> {
}
package com.company.pksbtest.web.screens.requestplugonoff;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestPlugOnOff;

@UiController("pksbtest_RequestPlugOnOff.edit")
@UiDescriptor("request-plug-on-off-edit.xml")
@EditedEntityContainer("requestPlugOnOffDc")
@LoadDataBeforeShow
public class RequestPlugOnOffEdit extends StandardEditor<RequestPlugOnOff> {
}
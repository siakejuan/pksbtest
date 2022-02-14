package com.company.pksbtest.web.screens.requestloadingcabling;

import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestLoadingCabling;

@UiController("pksbtest_RequestLoadingCabling.edit")
@UiDescriptor("request-loading-cabling-edit.xml")
@EditedEntityContainer("requestLoadingCablingDc")
@LoadDataBeforeShow
public class RequestLoadingCablingEdit extends StandardEditor<RequestLoadingCabling> {
}
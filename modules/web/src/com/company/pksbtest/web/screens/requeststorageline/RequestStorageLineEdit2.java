package com.company.pksbtest.web.screens.requeststorageline;

import com.haulmont.cuba.gui.components.CheckBox;
import com.haulmont.cuba.gui.components.HasValue;
import com.haulmont.cuba.gui.components.OptionsGroup;
import com.haulmont.cuba.gui.screen.*;
import com.company.pksbtest.entity.RequestStorageLine;

import javax.inject.Inject;

@UiController("pksbtest_RequestStorageLine.edit2")
@UiDescriptor("request-storage-line-edit2.xml")
@EditedEntityContainer("requestStorageLineDc")
@LoadDataBeforeShow
public class RequestStorageLineEdit2 extends StandardEditor<RequestStorageLine> {
    @Inject
    private OptionsGroup containerType;
    @Inject
    private CheckBox plugOffField;
    @Inject
    private CheckBox plugOnField;

    @Subscribe
    public void onInit(InitEvent event) {
        if (plugOnField.getValue() == Boolean.TRUE) {
            containerType.setVisible(true);
        }
    }


    @Subscribe("plugOnField")
    public void plugOnFieldChanged(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() == Boolean.TRUE) {
            containerType.setVisible(true);
            plugOffField.setEnabled(false);
        } else {
            containerType.setVisible(false);
            plugOffField.setEnabled(true);
        }
    }

    @Subscribe("plugOffField")
    public void plugOffFieldChanged(HasValue.ValueChangeEvent<Boolean> event) {
        if (event.getValue() == Boolean.TRUE) {
            plugOnField.setEnabled(false);
        } else {
            plugOnField.setEnabled(true);
        }
    }
}
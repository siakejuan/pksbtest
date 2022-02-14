package com.company.pksbtest.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum ContainerType implements EnumClass<String> {

    DRY("DRY"),
    CHILLER("CHILLER"),
    FREEZER("FREEZER");

    private String id;

    ContainerType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static ContainerType fromId(String id) {
        for (ContainerType at : ContainerType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
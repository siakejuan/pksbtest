package com.company.pksbtest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "PKSBTEST_CONTAINER")
@Entity(name = "pksbtest_Container")
@NamePattern("%s|containerNumber")
public class Container extends StandardEntity {
    private static final long serialVersionUID = 3830015008452312261L;

    @Column(name = "CONTAINER_NUMBER")
    private String containerNumber;

    @Column(name = "CONTAINER_TYPE")
    private String containerType;

    @Column(name = "STATUS")
    private String status;

    public void setContainerType(ContainerType containerType) {
        this.containerType = containerType == null ? null : containerType.getId();
    }

    public ContainerType getContainerType() {
        return containerType == null ? null : ContainerType.fromId(containerType);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
}
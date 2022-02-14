package com.company.pksbtest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@javax.persistence.DiscriminatorValue("P")
@Table(name = "PKSBTEST_REQUEST_PLUG_ON_OFF")
@Entity(name = "pksbtest_RequestPlugOnOff")
public class RequestPlugOnOff extends Request {
    private static final long serialVersionUID = 996445116665306709L;
}
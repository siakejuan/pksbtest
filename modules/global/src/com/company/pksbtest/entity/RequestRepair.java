package com.company.pksbtest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@javax.persistence.DiscriminatorValue("R")
@Table(name = "PKSBTEST_REQUEST_REPAIR")
@Entity(name = "pksbtest_RequestRepair")
public class RequestRepair extends Request {
    private static final long serialVersionUID = -4656775432192497588L;
}
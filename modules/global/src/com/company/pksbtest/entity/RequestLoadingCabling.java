package com.company.pksbtest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@javax.persistence.DiscriminatorValue("L")
@Table(name = "PKSBTEST_REQUEST_LOADING_CABLING")
@Entity(name = "pksbtest_RequestLoadingCabling")
public class RequestLoadingCabling extends Request {
    private static final long serialVersionUID = -493753682365087653L;
}
package com.company.pksbtest.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@javax.persistence.DiscriminatorValue("H")
@Table(name = "PKSBTEST_REQUEST_HOUSEKEEPING_CLEANING_STUFFING")
@Entity(name = "pksbtest_RequestHousekeepingCleaningStuffing")
public class RequestHousekeepingCleaningStuffing extends Request {
    private static final long serialVersionUID = 6871747251882872613L;
}
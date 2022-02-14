package com.company.pksbtest.entity;

import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Table(name = "PKSBTEST_REQUEST_STORAGE")
@Entity(name = "pksbtest_RequestStorage")
public class RequestStorage extends Request {
    private static final long serialVersionUID = -279488018386191441L;
}
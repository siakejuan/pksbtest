package com.company.pksbtest.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "PKSBTEST_REQUEST_STORAGE_LINE")
@Entity(name = "pksbtest_RequestStorageLine")
@NamePattern("%s|lotNumber")
public class RequestStorageLine extends StandardEntity {
    private static final long serialVersionUID = -6951118028657164215L;

    @Column(name = "CONTAINER_NUMBER")
    private String containerNumber;

    @Column(name = "HOUSEKEEPING_REQUIRED")
    private Boolean housekeepingRequired;

    @Column(name = "CLEANING_REQUIRED")
    private Boolean cleaningRequired;

    @Column(name = "STUFFING_REQUIRED")
    private Boolean stuffingRequired;

    @Column(name = "REPAIR")
    private String repair;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTAINER_ID")
    private Container container;

    @Column(name = "TEMPERATURE")
    private Integer temperature;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "TEMPERATURE_START")
    private Integer temperatureStart;

    @Column(name = "CABLING_REQUIRED")
    private Boolean cablingRequired;

    @Column(name = "LOT_NUMBER")
    private Integer lotNumber;

    @Column(name = "REMARKS")
    private String remarks;

    @Column(name = "PLUG_ON")
    private Boolean plugOn;

    @Column(name = "PLUG_OFF")
    private Boolean plugOff;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "REQUEST_STORAGE_ID")
    private RequestStorage requestStorage;

    public void setCleaningRequired(Boolean cleaningRequired) {
        this.cleaningRequired = cleaningRequired;
    }

    public Boolean getCleaningRequired() {
        return cleaningRequired;
    }

    public Boolean getStuffingRequired() {
        return stuffingRequired;
    }

    public void setStuffingRequired(Boolean stuffingRequired) {
        this.stuffingRequired = stuffingRequired;
    }

    public Boolean getHousekeepingRequired() {
        return housekeepingRequired;
    }

    public void setHousekeepingRequired(Boolean housekeepingRequired) {
        this.housekeepingRequired = housekeepingRequired;
    }

    public Boolean getCablingRequired() {
        return cablingRequired;
    }

    public void setCablingRequired(Boolean cablingRequired) {
        this.cablingRequired = cablingRequired;
    }

    public Integer getTemperatureStart() {
        return temperatureStart;
    }

    public void setTemperatureStart(Integer temperatureStart) {
        this.temperatureStart = temperatureStart;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Container getContainer() {
        return container;
    }

    public void setContainer(Container container) {
        this.container = container;
    }

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    public Boolean getPlugOff() {
        return plugOff;
    }

    public void setPlugOff(Boolean plugOff) {
        this.plugOff = plugOff;
    }

    public Boolean getPlugOn() {
        return plugOn;
    }

    public void setPlugOn(Boolean plugOn) {
        this.plugOn = plugOn;
    }

    public RequestStorage getRequestStorage() {
        return requestStorage;
    }

    public void setRequestStorage(RequestStorage requestStorage) {
        this.requestStorage = requestStorage;
    }

    public void setLotNumber(Integer lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Integer getLotNumber() {
        return lotNumber;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getContainerNumber() {
        return containerNumber;
    }

    public void setContainerNumber(String containerNumber) {
        this.containerNumber = containerNumber;
    }
}
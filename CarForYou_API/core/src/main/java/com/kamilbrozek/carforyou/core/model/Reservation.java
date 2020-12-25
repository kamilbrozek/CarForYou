package com.kamilbrozek.carforyou.core.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "Reservations")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long reservation_id;

    @Column(name = "car")
    private Long car;

    @Column(name = "driver")
    private Long driver;

    @Column(name = "additionalDriver")
    private Long additionalDriver;

    @Column(name = "createdBy")
    private Long createdBy;

    @Column(name = "startDate")
    private Date startDate;
    
    @Column(name = "startLocation")
    private Long startLocation;
    
    @Column(name = "startOdometer")
    private int startOdometer;

    @Column(name = "endDate")
    private Date endDate;

    @Column(name = "endLocation")
    private Long endLocation;

    @Column(name = "endOdometer")
    private int endOdometer;

    @Column(name = "netPrice")
    private BigDecimal netPrice;

    @Column(name = "status")
    private char status;

    public Reservation() {
    }

    public Reservation(Long car, Long driver, Long additionalDriver, Long createdBy, Date startDate, Long startLocation, int startOdometer, Date endDate, Long endLocation, int endOdometer, BigDecimal netPrice, char status) {
        this.car = car;
        this.driver = driver;
        this.additionalDriver = additionalDriver;
        this.createdBy = createdBy;
        this.startDate = startDate;
        this.startLocation = startLocation;
        this.startOdometer = startOdometer;
        this.endDate = endDate;
        this.endLocation = endLocation;
        this.endOdometer = endOdometer;
        this.netPrice = netPrice;
        this.status = status;
    }

    public Long getCar() {
        return car;
    }

    public void setCar(Long car) {
        this.car = car;
    }

    public Long getDriver() {
        return driver;
    }

    public void setDriver(Long driver) {
        this.driver = driver;
    }

    public Long getAdditionalDriver() {
        return additionalDriver;
    }

    public void setAdditionalDriver(Long additionalDriver) {
        this.additionalDriver = additionalDriver;
    }

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(Long startLocation) {
        this.startLocation = startLocation;
    }

    public int getStartOdometer() {
        return startOdometer;
    }

    public void setStartOdometer(int startOdometer) {
        this.startOdometer = startOdometer;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(Long endLocation) {
        this.endLocation = endLocation;
    }

    public int getEndOdometer() {
        return endOdometer;
    }

    public void setEndOdometer(int endOdometer) {
        this.endOdometer = endOdometer;
    }

    public BigDecimal getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(BigDecimal netPrice) {
        this.netPrice = netPrice;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }
}

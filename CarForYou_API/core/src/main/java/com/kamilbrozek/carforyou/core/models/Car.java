package com.kamilbrozek.carforyou.core.models;


import javax.persistence.*;
import java.beans.ConstructorProperties;

@Entity
@Table(name = "Cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long car_id;

    @Column(name = "carMake")
    private String carMake;

    @Column(name = "model")
    private String model;

    @Column(name = "odometer")
    private int odometer;

    @Column(name = "productionYear")
    private int productionYear;

    @Column(name = "registration")
    private String registration;

    @Column(name = "engineCapacity")
    private float engineCapacity;

    @Column(name = "enginePower")
    private int enginePower;

    @Column(name = "powerWindows")
    private boolean powerWindows;

    @Column(name = "onBoardComputer")
    private boolean onBoardComputer;

    @Column(name = "electricDoorMirrors")
    private  boolean electricDoorMirrors;

    @Column(name = "heatedMirrors")
    private boolean heatedMirrors;

    @Column(name = "seats")
    private int seats;

    @Column(name = "doors")
    private int doors;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "airConditioned")
    private char airConditioned;

    @Column(name = "carStatus")
    private char carStatus;

    public Car() {
    }

    public Car(String carMake, String model, int odometer, int productionYear, String registration, float engineCapacity, int enginePower, boolean powerWindows, boolean onBoardComputer, boolean electricDoorMirrors, boolean heatedMirrors, int seats, int doors, String transmission, char airConditioned, char carStatus) {
        this.carMake = carMake;
        this.model = model;
        this.odometer = odometer;
        this.productionYear = productionYear;
        this.registration = registration;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.powerWindows = powerWindows;
        this.onBoardComputer = onBoardComputer;
        this.electricDoorMirrors = electricDoorMirrors;
        this.heatedMirrors = heatedMirrors;
        this.seats = seats;
        this.doors = doors;
        this.transmission = transmission;
        this.airConditioned = airConditioned;
        this.carStatus = carStatus;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isPowerWindows() {
        return powerWindows;
    }

    public void setPowerWindows(boolean powerWindows) {
        this.powerWindows = powerWindows;
    }

    public boolean isOnBoardComputer() {
        return onBoardComputer;
    }

    public void setOnBoardComputer(boolean onBoardComputer) {
        this.onBoardComputer = onBoardComputer;
    }

    public boolean isElectricDoorMirrors() {
        return electricDoorMirrors;
    }

    public void setElectricDoorMirrors(boolean electricDoorMirrors) {
        this.electricDoorMirrors = electricDoorMirrors;
    }

    public boolean isHeatedMirrors() {
        return heatedMirrors;
    }

    public void setHeatedMirrors(boolean heatedMirrors) {
        this.heatedMirrors = heatedMirrors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public char getAirConditioned() {
        return airConditioned;
    }

    public void setAirConditioned(char airConditioned) {
        this.airConditioned = airConditioned;
    }

    public char getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(char carStatus) {
        this.carStatus = carStatus;
    }
}

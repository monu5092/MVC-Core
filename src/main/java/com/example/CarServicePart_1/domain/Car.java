package com.example.CarServicePart_1.domain;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    String RegisterationNumber;
    String CarName;
    String CarDetails;
    String CarWork;
    Integer CarId;

    public void setRegisterationNumber(String registerationNumber){
        this.RegisterationNumber=registerationNumber;
    }
    public String getRegisterationNumber(){
        return RegisterationNumber;
    }

    public void setCarName(String carName){
        this.CarName=carName;
    }
    public String getCarName(){
        return CarName;
    }
    public void setCarDetails(String carDetails){
        this.CarDetails=carDetails;
    }
    public String getCarDetails(){
        return CarDetails;
    }
    public void setCarWork(String carWork){
        this.CarWork=carWork;
    }
    public String getCarWork(){
        return CarWork;
    }
    public void setCarId(Integer carId){
        this.CarId=carId;
    }
    public Integer getCarId(){
        return CarId;
    }
    @Override
    public Boolean saveVehicleDetails() {
        System.out.println("saved");
        return true;
    }

    @Override
    public void createVehicle(String RegistrationNumber, String CarName, String CarDetails, String CarWork) {
        this.setRegisterationNumber(RegistrationNumber);
        this.setCarName(CarName);
        this.setCarDetails(CarDetails);
        this.setCarWork(CarWork);
    }
}

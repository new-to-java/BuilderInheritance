package com.bc;

public class Car extends Vehicle {
    Car(Builder builder) {
        super(builder);
    }

//    private int yearOfManufacture;
//
//    Car(Builder builder){
//
//        super(builder);
//        this.yearOfManufacture = builder.yearOfMfg;
//
//    }
//
//
//    public interface SetYearOfManufacture{
//        FinishBuild setYearOfMfg(int yearOfMfg);
//    }
//
//    public static SetMake build(){
//        return new Builder();
//    }
//
//    public static class Builder extends Vehicle.Builder implements SetYearOfManufacture{
//
//        int yearOfMfg;
//
//        @Override
//        public FinishBuild setYearOfMfg(int yearOfMfg) {
//            this.yearOfMfg = yearOfMfg;
//            return this;
//        }
//
//        @Override
//        public SetModel setMake(String make){
//            return this;
//        }
//
//    }

}

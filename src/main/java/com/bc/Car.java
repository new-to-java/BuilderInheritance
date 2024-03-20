package com.bc;

//public class Car extends Vehicle {
//
//    int engineCapacity;
//    String fuel;
//
//    Car(Builder builder){
//        super(builder);
//        this.engineCapacity = builder.engineCapacity;
//        this.fuel = builder.fuel;
//    }
//
//    public interface SetEngineCapacity{
//        public SetFuel setEngineCapacity(int engineCapacity);
//
//    }
//
//    public interface SetFuel{
//        public FinishBuild setFuel(String fuel);
//
//    }
//
//    public interface FinishBuild{
//        public Car build();
//    }
//
//    public static class Builder extends Vehicle.Builder<Builder> implements SetEngineCapacity, SetFuel{
//
//        int engineCapacity;
//        String fuel;
//
//
//        @Override
//        public Car.Builder setEngineCapacity(int engineCapacity) {
//            this.engineCapacity = engineCapacity;
//            return this;
//        }
//
//        @Override
//        public Car.Builder setFuel(String fuel) {
//            this.fuel = fuel;
//            return this;
//        }
//
//        @Override
//        public Car build(){
//            return new Car(this);
//        }
//
//    }
//
//}

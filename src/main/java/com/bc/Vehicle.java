package com.bc;

public class Vehicle {

    private String make;
    private String model;

    Vehicle(Builder<?> builder){
        this.make = builder.make;
        this.model = builder.model;
    }

    @Override
    public String toString(){
        return this.getClass().getSimpleName() +
                "{" +
                "make: " + make + ", " +
                "model: " + model +
                "}";
    }

    public static SetMake builder(){
        return new Builder<>();
    }

    public interface SetMake{
        SetModel setMake(String make);
    }

    public interface SetModel{
        FinishBuild setModel(String model);
    }

    public interface FinishBuild{
        Vehicle build();
    }

    public static class Builder<T extends Builder<T>> implements SetMake, SetModel, FinishBuild {

        private String make;
        private String model;

//        Builder<T> self(){
//            return this;
//        }

        @Override
        public Builder<T> setMake(String make) {
            this.make = make;
            return this;
        }

        @Override
        public Builder<T> setModel(String model) {
            this.model = model;
            return this;
        }

        @Override
        public Vehicle build() {
            return new Vehicle( this);
        }
    }


}

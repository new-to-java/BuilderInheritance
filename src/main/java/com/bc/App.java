package com.bc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Vehicle vehicle = Vehicle.builder().setMake("Ford").setModel("F150").build();

        System.out.println(vehicle);

//        Car car = Car.builder().setMake("Chevrolet").setModel("Camaro").build();

    }
}

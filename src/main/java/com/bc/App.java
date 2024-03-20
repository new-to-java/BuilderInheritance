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

        Vehicle car = Vehicle.builder().setMake("AA").setModel("22").build();

        System.out.println(vehicle);
        System.out.println(car);

//        Car car = Car.builder().setMake("Chevrolet").setModel("Camaro").build();

    }
}

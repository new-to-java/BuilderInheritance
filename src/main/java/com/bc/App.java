package com.bc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Vehicle.Builder vehicleBuilder = new Vehicle.Builder();

        vehicleBuilder.setMake("asdasd")
                        .setModel("11111");

        Vehicle vehicle = vehicleBuilder.build();

        System.out.println( vehicle );
    }
}

package com.bc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Vehicle vehicle = Vehicle
                .builder()
                .setMake("Ford")
                .setModel("Mustang")
                .build();

        System.out.println( vehicle.toString() );
    }
}

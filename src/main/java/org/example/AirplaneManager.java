package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AirplaneManager
{
    ArrayList<Airplane> airplaneList;

    public AirplaneManager() {
        airplaneList = new ArrayList<>();
    }

    //Q3.

    // write add() method


    public void displayAllAirplanes(ArrayList<Airplane> airplaneList)
    {
        for (Airplane airplane : airplaneList)
        {
            System.out.println(airplaneList);
        }
    }

    public static void displayAllPassengerAirplanes(ArrayList<PassengerAirplane> passengerAirplanes)
    {
        for (PassengerAirplane passengerairplane : passengerAirplanes)
        {
            System.out.println(passengerAirplanes);
        }
    }

    //  write method getAllCargoAirplanes()
    public void getAllCargoAirplanes(ArrayList<CargoAirplane> cargoAirplanes)
    {
        for (CargoAirplane cargoairplane : cargoAirplanes)
        {
            System.out.println(cargoAirplanes);
        }
    }

    // write  addPassengerNameToAirplane( airplaneId, passengerName)


    // write containsAirplane( Airplane plane )


    // write findAirplaneByPassengerName( passengerName )

    // write displayAllAirplanesInOrderOfType( argument )

}

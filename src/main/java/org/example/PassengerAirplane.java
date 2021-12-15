package org.example;

import java.util.ArrayList;
import java.util.List;

public class PassengerAirplane extends Airplane
{
    // fields(Q2)
    private int maxNumPassengers;
    private ArrayList<String> passengerList;

    public ArrayList<String> getPassengerList()
    {
        return passengerList;
    }

    public void setFacilities(ArrayList<String> passengerList)
    {
        this.passengerList = passengerList;
    }

    public PassengerAirplane(String type, int maxNumPassengers)
    {
        super(type);
        this.maxNumPassengers = maxNumPassengers;
    }

    public int getMaxNumPassengers()
    {
        return maxNumPassengers;
    }

    @Override
    public String toString() {
        return "PassengerAirplane{" +
                "maxNumPassengers=" + maxNumPassengers +
                ", passengerList=" + passengerList +
                '}';
    }

    public void addPassenger(String name)
    {
        if(passengerList.add(name))
        {
            System.out.println("Name " + name + " added");
        }
    }
}

package org.example;

public class CargoAirplane extends Airplane
{
    // fields (ref. Q1)
    private int maxLoadKilos;
    private String currentLoad;

    // constructor

    public CargoAirplane(String type, int maxLoadKilos, String currentLoad)
    {
        super(type);
        this.maxLoadKilos = maxLoadKilos;
        this.currentLoad = currentLoad;
    }

    public int getMaxLoadKilos()
    {
        return maxLoadKilos;
    }

    public String getCurrentLoad()
    {
        return currentLoad;
    }

    // toString()
    @Override
    public String toString() {
        return "CargoAirplane{" +
                "maxLoadKilos=" + maxLoadKilos +
                ", currentLoad='" + currentLoad + '\'' +
                '}';
    }
}

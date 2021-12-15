package org.example;

public class CargoAirplane extends Airplane
{
    // fields (ref. Q1)
    private int maxLoadKilos;
    private int currentLoad;

    // constructor

    public CargoAirplane(String type, int maxLoadKilos, int currentLoad)
    {
        super(type);
        this.maxLoadKilos = maxLoadKilos;
        this.currentLoad = currentLoad;
    }

    public int getMaxLoadKilos()
    {
        return maxLoadKilos;
    }

    public int getCurrentLoad()
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

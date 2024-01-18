package com.csis3275.assignment1.model;

public class Truck_jsh_35 extends Automobile_jsh_35 {

	private double loadCapacity;
    private boolean hasTrailer;

    public Truck_jsh_35(String brand, String model, double loadCapacity, boolean hasTrailer) {
        super(brand, model);
        this.loadCapacity = loadCapacity;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    public double calculateEfficiencyBasedOnLoad() {
        // Efficiency calculation logic
        return hasTrailer ? loadCapacity * 0.5 : loadCapacity * 0.75;
    }

    public void haul() {
        System.out.println("Hauling with the truck...");
    }
	
	
	
}

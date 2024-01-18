package com.csis3275.assignment1.model;

public class Car_jsh_35 extends Automobile_jsh_35 {

	 private int seatingCapacity;
	    private double trunkSpace;

	    public Car_jsh_35(String brand, String model, int seatingCapacity, double trunkSpace) {
	        super(brand, model);
	        this.seatingCapacity = seatingCapacity;
	        this.trunkSpace = trunkSpace;
	    }

	    @Override
	    public String getVehicleType() {
	        return "Car";
	    }

	    public double calculateTaxBasedOnTrunkSpace() {
	        // Tax calculation logic
	        return trunkSpace * 0.1;
	    }

	    public void drive() {
	        System.out.println("Driving the car...");
	    }
	
	
	
}

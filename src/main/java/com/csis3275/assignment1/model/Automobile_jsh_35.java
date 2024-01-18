package com.csis3275.assignment1.model;

public abstract class Automobile_jsh_35 {

	private String brand;
    private String model;

    public Automobile_jsh_35(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract String getVehicleType();
	
	
	
}

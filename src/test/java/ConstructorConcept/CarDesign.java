package ConstructorConcept;

import java.util.ArrayList;

public class CarDesign {

	String name;
	int price;
    String colour;
    double milegae;
    boolean isElectric;
    char isAvailable;
	ArrayList<String> featureList;
	public CarDesign(String name, int price, String colour, double milegae, boolean isElectric, char isAvailable,
			ArrayList<String> featureList) {

		this.name = name;
		this.price = price;
		this.colour = colour;
		this.milegae = milegae;
		this.isElectric = isElectric;
		this.isAvailable = isAvailable;
		this.featureList = featureList;
	}
	public CarDesign(String name, int price, String colour) {
		this.name = name;
		this.price = price;
		this.colour = colour;
	}
	public CarDesign(String name, String colour) {
		super();
		this.name = name;
		this.colour = colour;
	}
	
	
	
		

	}



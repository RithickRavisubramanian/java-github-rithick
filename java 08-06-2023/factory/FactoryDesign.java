package com.dal.factory;

interface Vehicle {
    void manufacture();
}


class Car implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Car manufactured......");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void manufacture() {
        System.out.println("Motorcycle manufactured......");
    }
}


class VehicleFactory {

    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("motorcycle")) {
            return new Motorcycle();
        } else {
            throw new IllegalArgumentException("Not a valid vehicle type.");
        }
    }
}


public class FactoryDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 VehicleFactory factory = new VehicleFactory();


	        Vehicle car = factory.createVehicle("car");
	        car.manufacture(); 


	        Vehicle motorcycle = factory.createVehicle("motorcycle");
	        motorcycle.manufacture();  
	    }

	}


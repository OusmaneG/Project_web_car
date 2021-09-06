package com.saraya.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;




public class CarService {
	
	private static List<Car> cars = new ArrayList<Car>() ;
	private static int count = 5 ;
	
	static {
		cars.add(new Car(1, 2012, "BMW", "Serie vI", "https://images.unsplash.com/photo-1543796076-e9b02d7c37e8?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=666&q=80"));
		cars.add(new Car(2, 2012, "CHEVROLET", "Equinox", "https://images.unsplash.com/photo-1622987155264-bb4d4e767191?ixid=MnwxMjA3fDB8MHxzZWFyY2h8NDZ8fGNoZXZyb2xldCUyMGVxdWlub3h8ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"));
		cars.add(new Car(3, 2012, "FORD", "Fusion", "https://images.unsplash.com/photo-1523998172836-07d4ac80b873?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mzd8fGZvcmQlMjBmdXNpb258ZW58MHx8MHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"));
		cars.add(new Car(4, 2012, "RENAULT", "Megane", "https://images.unsplash.com/photo-1619804893447-c343a2b0cc34?ixid=MnwxMjA3fDB8MHxzZWFyY2h8N3x8cmVuYXVsdCUyMG1lZ2FuZXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"));
		cars.add(new Car(5, 2012, "OPEL", "Corsa", "https://images.unsplash.com/photo-1579631962852-306c90e1c91f?ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8b3BlbCUyMGNvcnNhfGVufDB8fDB8fA%3D%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=600&q=60"));
		
	}
	
	public List<Car> getAllCars() {
		return cars ;
	} 
	
	public void addCar(int id, int year, String mark, String model, String image ) {
		cars.add(new Car(count++, year, mark, model, image));
		
	}
	
	public void deleteCar(int id) {
		Iterator<Car> iterate = cars.iterator();
		while (iterate.hasNext()) ;
		Car round = iterate.next();
		if (round.getId() == id) {
			iterate.remove();
		}
		
	}

}

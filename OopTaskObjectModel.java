package project;

public class OopTaskObjectModel {

	public static void main(String[] args) {
		Vehicle1 bike=new Bike();
		Vehicle1 car=new car();
		System.out.println("Bike Name: "+bike.vehicleName()+"Bike Company : "+bike.vehicleCompany());
	    System.out.println("Car Name: "+car.vehicleName()+"Car Company : "+car.vehicleCompany());
	    bike=new Bike("Apache");
	    car=new car("Q5");
	    System.out.println("Bike Name: "+bike.vehicleName()+"Bike Company : "+bike.vehicleCompany());
	    System.out.println("Car Name: "+car.vehicleName()+"Car Company : "+car.vehicleCompany());
	    bike=new Bike("Apache","TVS");
	    car=new car("Q5","Audi");
	    System.out.println("Bike Name: "+bike.vehicleName()+"Bike Company : "+bike.vehicleCompany());
	    System.out.println("Car Name: "+car.vehicleName()+"Car Company : "+car.vehicleCompany());
	    //Collections display
	    java.util.ArrayList<Vehicle1> list=new java.util.ArrayList<Vehicle1>();
	    list.add(bike);
	    list.add(car);
	    for(Vehicle1 i:list)
        {
	    	System.out.println("Vehicle Name : "+i.vehicleName());
	    	System.out.println("Vehicle Name : "+i.vehicleCompany());
        }



		

	}

}

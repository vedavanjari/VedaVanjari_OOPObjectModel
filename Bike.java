package project;

class Bike extends Vehicle1
{
	String bikename,bikecompany;
	Bike()
	{
		bikename="Unspecified Value for Bike name";
		bikecompany="Unspecified Value for Bike Company";
	}
	Bike(String bikename)
	{
		this.bikename=bikename;
	}
	Bike(String bikename,String bikecompany)
	{
		this.bikename=bikename;
		this.bikecompany=bikecompany;
	}
	public String vehicleName()
	{
		return bikename;
	}
	public String vehicleCompany()
	{
		return bikecompany;
	}
}

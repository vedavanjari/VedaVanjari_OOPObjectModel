package project;

public class car extends Vehicle1
{
	String carname,carcompany;
	car()
	{
		carname="Unspecified Value for car name";
		carcompany="Unspecified Value for car company";
	}
	car(String carname)
	{
		this.carname=carname;
	}
	car(String carname,String carcompany)
	{
		this.carname=carname;
		this.carcompany=carcompany;
	}
	public String vehicleName()
	{
		return carname;
	}
	public String vehicleCompany()
	{
		return carcompany;
	}

}

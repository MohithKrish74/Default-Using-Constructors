package com.keyword;

class Bus
{
    String BusName;
    String FuelType;
    int PassengerCarryingCapacity;
    Boolean AC;
    int MaxSpeed;
    Bus(String BusName,String FuelType, int PassengerCarryingCapacity, Boolean AC, int MaxSpeed)       //Default Constructors
    {
        this.BusName = BusName;
        this.FuelType = FuelType;
        this.PassengerCarryingCapacity = PassengerCarryingCapacity;
        this.AC = AC;
        this.MaxSpeed = MaxSpeed;
        Display();
    }
    void Display()
    {
        System.out.println(BusName+" "+FuelType+" "+PassengerCarryingCapacity+" "+AC+" "+MaxSpeed);
    }
}

public class DefaultAsConstructors
{
    public static void main(String[] args)
    {
        System.out.println("Details of Bus: ");
        Bus volvo = new Bus("Volvo","Petrol",25,true,100);
        Bus doubleDecker = new Bus("Double Decker","Diesel",30,false,80);
    }
}

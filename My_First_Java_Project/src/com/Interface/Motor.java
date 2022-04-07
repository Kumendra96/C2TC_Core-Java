package com.Interface;

interface Vehicle
{
	void changeGear(int a);
	void speedUp(int a);
	void applyBrakes(int a);
}
class Bicycle implements Vehicle
{
	int speed;
	int gear;
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	@Override
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	public void printStates()
	{
		System.out.println("Speed: "+speed+" Gear: "+gear);
	}
}
class Bike implements Vehicle
{
	int speed;
	int gear;
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	public void printStates()
	{
		System.out.println("Speed: "+speed+" Gear: "+gear);
	}
}
class Car implements Vehicle
{
	int speed;
	int gear;
	int rev_gear;
	@Override
	public void changeGear(int newGear)
	{
		gear = newGear;
	}
	public void change_Gear(int newGear)
	{
		rev_gear=newGear;
	}
	public void speedUp(int increment)
	{
		speed = speed + increment;
	}
	public void applyBrakes(int decrement)
	{
		speed = speed - decrement;
	}
	public void printStates()
	{
		System.out.println("Speed: "+speed+" Gear: "+gear+" Reverse Gear: "+rev_gear);
	}
}
public class Motor
{
	public static void main(String args[])
	{
		Bicycle bi = new Bicycle();
		bi.changeGear(2);
		bi.speedUp(60);
		bi.applyBrakes(2);
		System.out.println("Bicycle present State:");
		bi.printStates();
		
		Bike bike = new Bike();
		bike.changeGear(4);
		bike.speedUp(100);
		bike.applyBrakes(2);
		System.out.println("Bike present State:");
		bike.printStates();
		
		Car cr ;
		cr = new Car();
		cr.change_Gear(1);
		cr.changeGear(5);
		cr.speedUp(200);
		cr.applyBrakes(2);
		System.out.println("Car present State:");
		cr.printStates();
	}
}
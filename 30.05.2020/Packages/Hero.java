package Automobile.TwoWheeler;
import Automobile.Vehicle;

public class Hero extends Vehicle {
	public int speed;
	private String Mname;
	private String Regno;
	private String Owner;
	public Hero(String mname,String regno,String owner,int speed){
		this.Mname=mname;
		this.Owner=owner;
		this.Regno=regno;
		this.speed=speed;
	}

	public void getMname(){
		System.out.println("Model:"+Mname);
	}
	public void getOwner(){
		System.out.println("Owner:"+Owner);
	}
	public void getRegno(){
		System.out.println("Register number:"+Regno);
	}

	public void getSpeed(){
		System.out.print("Speed:"+speed);
	}
}

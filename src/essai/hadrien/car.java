package essai.hadrien;

import java.awt.Color;

public class car {

	public String color;
	public Color colorCode;
	public String brand;
	public int power;
	private boolean engineStarted;
	public String id;
	private boolean EngineOk;
		
	public car () {
		this.power = 0;
		//this.color = "Red";
		//System.out.println(this.id);
		//if (this.color != null && this.color.equals("Red")) {
			//System.out.println("This is red");
		//}
	}
	
	public car (String _color, Color _colorCode, String _brand, int _power, String _id) {
		this.color = _color;
		this.colorCode = _colorCode;
		this.brand = _brand;
		this.power = _power;
		this.id = _id;
	}
	
	public boolean isEngineOk() {
		return EngineOk;
	}
	
	public int getPower() {
		return power;
	}
	
	public void startEngine() {
		engineStarted = true;
		System.out.println(id + " Engine started ");
	}
	
	public void stopEngine() {
		engineStarted = false;
		System.out.println(id + " Engine stopped");
	}
	
	public boolean isEngineStarted() {
		System.out.println("Is engine started? " + engineStarted);
		return engineStarted;
	}
	
}

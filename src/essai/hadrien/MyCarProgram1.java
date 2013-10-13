package essai.hadrien;

import java.awt.Color;

public class MyCarProgram1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car maVoiture = new car();
		//truck monCamion = new truck();
		car maSecondeVoiture = new car("Peugeot", Color.GREEN, "Gris", 110, "SecondeVoiture");
		
		maVoiture.brand = "BMW";
		maVoiture.color = "test";
		maVoiture.colorCode = Color.BLUE;
		maVoiture.power = 250;
		maVoiture.id = "PermièreVoiture";
		
		maVoiture.startEngine();
		
		maVoiture.isEngineStarted();
		
		maVoiture.stopEngine();
		
		maVoiture.isEngineStarted();
		
		maSecondeVoiture.startEngine();
		
		System.out.println(maVoiture.id + " is " + maVoiture.colorCode.toString());
		
		
		int zozo = maVoiture.power + maSecondeVoiture.power;
		
		System.out.println("Total power:" + zozo);
		
		//boolean 
	}

}

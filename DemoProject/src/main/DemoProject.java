package main;

import java.util.Random;

public class DemoProject {

	public static void main(String[] args) {

		
		Random random = new Random();
		
		String wort = "BICYCLE";
		
		int zufall;
		
		for(int i = 0; i < wort.length(); i++) {
			
			zufall = random.nextInt(wort.length());
				
			//int[] zufallSpeichern = {zufall}; 
				
				System.out.println(wort.charAt(zufall));	
			
		}
		
	}
}

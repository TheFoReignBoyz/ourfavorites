package sampleProject;

public class Maine {

	public Maine(){
		System.out.println("Maine or Main? Who Knows");
		System.out.println("this joke is trash!");
	}
	
	public void bruteForceJokeMethod(){
		for(int i = 0; i < 100; i++){
			int i0 = i-1;
			int i2 = i+1;
			int i3 = i+2;
			
			System.out.println("Why is " + i0 + " " + "afraid of " + i + "?");
			System.out.println("Because " + i + " " +  i2 + " " + i3);
			
		}
	}
}

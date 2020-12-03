package simulation;

import java.util.Random;

public class Simulation {
	 static final int totalstake=100;
	 static int updatedstake=100;
	
	 static final int dailybet=1;

	public static void main(String[] args) {
		System.out.println("Gambling Simulation\nTotal Available bet: "+totalstake);
		betting();
	

	}

	private static void betting() {
		
		Random random=new Random();
		int outcome=random.nextInt(2);
		if(outcome==1) {
			System.out.println("Won the bet!");
			updatedstake=updatedstake+dailybet;
		} else {
			System.out.println("Lost the bet!");
			updatedstake=updatedstake-dailybet;
		}
		System.out.println("Remaining stake: "+updatedstake);
		
	}

}

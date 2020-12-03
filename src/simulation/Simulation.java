package simulation;

import java.util.Random;

public class Simulation {
	 static final int TOTALSTAKE=100;
	 static int updatedstake=TOTALSTAKE;
	 static final int DAILYBET=1;

	public static void main(String[] args) {
		System.out.println("Gambling Simulation\nTotal Available bet: "+TOTALSTAKE);
		int betoutcome=betting();
		Bettinglimit();
	

	}

	private static void Bettinglimit() {
		while((updatedstake<(TOTALSTAKE*1.5)) && (updatedstake>(TOTALSTAKE*0.5))) {
			betting();	
		}
		
		
	} 

	private static int betting() {
		
		Random random=new Random();
		int outcome=random.nextInt(2);
		if(outcome==1) {
			System.out.println("Won the bet!");
			updatedstake+=DAILYBET;
		} else {
			System.out.println("Lost the bet!");
			updatedstake-=DAILYBET;
		}
		System.out.println("Remaining stake: "+updatedstake);
		return outcome;
	}

}

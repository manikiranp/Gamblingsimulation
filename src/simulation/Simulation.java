package simulation;

import java.util.Random;

public class Simulation {
	 static final int TOTALSTAKE=100;
	 static int updatedstake=TOTALSTAKE;
	 static final int DAILYBET=1;
	static  int dailyresult=0;

	public static void main(String[] args) {
		System.out.println("Gambling Simulation\nTotal Available bet: "+TOTALSTAKE);
		//int result=Bettinglimit();
		Betting20days();
		
	

	}

	private static void Betting20days() {
		int day=1;
		int totalwinlose=0;
		while(day<=20) {
			Bettinglimit();
			day++;
			totalwinlose+=dailyresult;
		} 
		
		System.out.println("Total stake won or lose: "+totalwinlose);
		
	}

	private static int Bettinglimit() {
		
		while((updatedstake<(TOTALSTAKE*1.5)) && (updatedstake>(TOTALSTAKE*0.5))) {
			betting();
			
		}
		
			if(updatedstake>0) {
				dailyresult=updatedstake-TOTALSTAKE;
			} else {
				dailyresult=updatedstake-TOTALSTAKE;
			}
		return dailyresult;
		
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

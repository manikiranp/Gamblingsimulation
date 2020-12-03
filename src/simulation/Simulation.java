package simulation;

import java.util.Random;

public class Simulation {
	 static final int TOTALSTAKE=100;
	 static int updatedstake=TOTALSTAKE;
	 static final int DAILYBET=1;
	 	static int totalwinlose=0;
	

	public static void main(String[] args) {
		System.out.println("Gambling Simulation\nTotal Available bet per day: "+TOTALSTAKE);
		Bettingdays();
	
	}

	private static void Bettingdays() {
		
		int day=1;
		while(day<=20) {
			updatedstake=100;
			System.out.println("Day---"+day);			
			int result=Bettinglimit();
			
			totalwinlose=totalwinlose+result;
			day++;
		}
		if(totalwinlose>0) { 
		System.out.println("Total stake Won: "+totalwinlose);
		}
		else if (totalwinlose<0) {
			System.out.println("Total stake Lost: "+totalwinlose*-1);
		} else {
			System.out.println("No win nor lost: "+totalwinlose);
		}
		
	}

	private static int Bettinglimit() {
		int dailyresult=0;
		while((updatedstake<(TOTALSTAKE*1.5)) && (updatedstake>(TOTALSTAKE*0.5))) {
			betting();
		}
			if (updatedstake>TOTALSTAKE) {
			dailyresult=updatedstake-TOTALSTAKE;
			System.out.println("Result: won "+dailyresult );
			}else {
				dailyresult=updatedstake-TOTALSTAKE;
				System.out.println("Result: lost "+dailyresult*-1);
			}
		
		return dailyresult;
		
	} 

	private static void betting() {
		
		Random random=new Random();
		int outcome=random.nextInt(2);
		if(outcome==1) {
			//System.out.println("Won the bet!");
			updatedstake+=DAILYBET;
		} else {
			//System.out.println("Lost the bet!");
			updatedstake=updatedstake-DAILYBET;
		}
		
		
	}

}

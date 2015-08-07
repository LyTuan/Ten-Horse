package TenHorse;

import java.util.Random;

public class HorseRun extends Thread{
	String nameHorse;
	int markHorse;
	long START =1;
	long END =100;
	HorseRun(String nameHorse, int markHorse){
		this.nameHorse = nameHorse;
		this.markHorse = markHorse;
	}
	HorseRun(){
		this("no name", 0);
	}
	public HorseRun(String string) {
		nameHorse=string;
	}
	public String getNameHorse() {
		return nameHorse;
	}
	public void setNameHorse(String nameHorse) {
		this.nameHorse = nameHorse;
	}
	public int getMarkHorse() {
		return markHorse;
	}
	public void setMarkHorse(int markHorse) {
		this.markHorse = markHorse;
	}
	public void run(){
		Random random = new Random();
		int rn = random.nextInt(100);
		while(this.markHorse!=100){
			this.markHorse +=rn;
			if(this.markHorse>100){
				this.markHorse = this.markHorse -100;
			}
			try{
				Thread.sleep(500);
			}catch(InterruptedException e){
				
			}
//			System.out.println("The "+this.nameHorse+" has Mark"+ this.markHorse);
		}
		System.out.println(nameHorse+ ": *************SUCCESSFUL*************");
		
		
	}
	
}

//(c) A+ Computer Science 
//www.apluscompsci.com

//Computer class 

public class Computer
{
	//instance / member variables
   private String choice;
   
	public Computer()
	{
			return;
	}
	
	public String getChoice()
	{
		return choice;
	}
	
	public void randomSetChoice()
	{
		int num = (int) (Math.random() * 3) + 0;
		if(num == 0){
			choice = "rock";
		}
		else if(num == 1){
			choice = "paper";
		}
		else if(num == 2){
			choice = "scissors"
		}
	}	
		
	/*
	 didIWin(Player p) will return the following values
	 	0 - both players have the same choice
	 	1 - the computer had the higher ranking choice
	 	-1 - the player had the higher ranking choice
	 */	
	public int didIWin(Player p)
	{
		if(getChoice().equals(p.getChoice())){
			return 0;
		}
		else if(getChoice().equals("paper") && p.getChoice().equals("rock")){
			return 1;
		}
		else if(getChoice().equals("scissors") && p.getChoice().equals("paper")){
			return 1;
		}
		else if(getChoice().equals("rock") && p.getChoice().equals("schissors")){
			return 1;
		}
		else{
			return -1;
		}	
	}
	
	public String toString()
	{
		return "Computer had " + choice;
	}		   
}
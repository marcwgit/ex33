
import java.io.*;
public class Ex33 {

	public static void main(String[] args)throws Exception{  
		  
		   InputStreamReader r=new InputStreamReader(System.in);  
		   BufferedReader br=new BufferedReader(r); 

		   int count = 0;
		   String playAgain="";
		   String inpNumofCards="";
		   int testnumber= 0;
		   int youTotal = 0;
		   int compTotal = 0;
		   int youWins = 0;
		   int compWins = 0;
		   int draws = 0;
		 
		   do {
		   
			   System.out.print("How many cards do you want?: ");
			   inpNumofCards=br.readLine();
			   System.out.println();
	
			   int numberRequestedCards = Integer.valueOf(inpNumofCards);
	
			   System.out.println(numberRequestedCards);
			   
			   System.out.print("You: ");
			   youTotal = 0;
			   
			   for(int i=1; i<=numberRequestedCards; i++){
		              
				   int randomNumber = (int) (Math.random() * 10 + 1);
				   System.out.print(randomNumber + " ");
				   youTotal = youTotal + randomNumber;
				   
			   }
			   System.out.println();
			   System.out.print("Computer: ");
			   compTotal = 0;
			   for(int i=1; i<=3; i++){
		              
				   int randomNumber = (int) (Math.random() * 10 + 1);
				   System.out.print(randomNumber + " ");
				   compTotal = compTotal + randomNumber;
			   }
			   System.out.println();
			   System.out.print("I have "+compTotal+" and you have "+youTotal+" ");
			   
			   if (youTotal<compTotal){
				   System.out.println("so I win");
				   compWins = compWins + 1;
			   }
			   
			   if (youTotal>compTotal){
				   System.out.println("so you win");
				   youWins = youWins + 1;
			   }
			   
			   if (youTotal==compTotal){
				   System.out.println("so we draw");
				   draws = draws + 1;
			   }
			   
			   System.out.print("Would you like to play again (Y/N)?");
			   playAgain =br.readLine();
			   System.out.println(playAgain);
			   System.out.println();
		   
		   } while (playAgain.equalsIgnoreCase("Y"));
		   
		   System.out.println("Computer wins = "+ compWins);
		   System.out.println("Your wins = "+ youWins);
		   System.out.println("Draws = "+ draws);
		   
		   
		   
		   
		   
		// TODO Auto-generated method stub
		   

	}

}

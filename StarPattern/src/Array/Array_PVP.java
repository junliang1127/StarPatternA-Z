package Array;

import java.util.Scanner;

public class Array_PVP 
{
	static void twoPlayer(char board[][], int opt) 
	{
		String a = "Player 1 ";
		String b = "Player 2 ";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player 1 name : ");
		String name = s.next();
		a = name;
	
		System.out.println("Enter Player 2 name : ");
		name = s.next();
		b = name;
		
		while(true) 
		{
			System.out.println(a +" - enter a Position to place X (1-9): ");
			int userPos = s.nextInt();
			
			//Checks
			while(Array_TicTac.allUserPos.contains(userPos) || Array_TicTac.allCpuPos.contains(userPos))
			{
				System.out.println("Position is Taken");
				System.out.println(a +" - enter a Position to place X (1-9): ");
				userPos = s.nextInt();
			}
			Array_game.insert(board, userPos, 'X');
			Array_game.display(board);
			Array_game.checkWinner(a, b);
			
			
			//Player 2(Insert)
			System.out.println(b + " - enter a Position to place O (1-9): ");
			int userPos2 = s.nextInt();
			
			//Checks
			while(Array_TicTac.allUserPos.contains(userPos2) || Array_TicTac.allCpuPos.contains(userPos2))
			{
				System.out.println("Position is Taken");
				System.out.println(b + " - enter a Position to place O (1-9): ");
				userPos2 = s.nextInt();
			}
			System.out.println(b + " - Position is " + userPos2);
			Array_game.insert(board, userPos2, 'O');
			Array_game.display(board);
			Array_game.checkWinner(a , b);
			
			
		}
	}
}

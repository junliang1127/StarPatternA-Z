package Array;

import java.util.Random;
import java.util.Scanner;

public class Array_UserCpu 
{
	static void onePlayer(char board[][]) 
	{
		String a = "Player 1 ";
		String b = "CPU ";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Player 1 name : ");
		String name = s.next();
		a = name;
	
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
			
			
			//CPU Position (Insert)
			Random r = new Random();
			int cpuPos = r.nextInt(9)+1;
			
			//Checks
			while(Array_TicTac.allUserPos.contains(cpuPos) || Array_TicTac.allCpuPos.contains(cpuPos))
			{
				cpuPos = r.nextInt(9)+1;
			}
			System.out.println("CPU Position is " + cpuPos);
			Array_game.insert(board, cpuPos, 'O');
			Array_game.display(board);
			Array_game.checkWinner(a, b);
			
			
		}
	}
}

package Array;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Array_TicTac 
{
	static ArrayList <Integer> allUserPos = new ArrayList<>();
	static ArrayList <Integer> allCpuPos = new ArrayList<>();
	public static void main(String[] args) 
	{
		//Display Board
		char board[][] = {
						 {' ','|',' ','|',' '},
						 {'-','+','-','+','-'},
						 {' ','|',' ','|',' '},
						 {'-','+','-','+','-'},
						 {' ','|',' ','|',' '},
						 };
		Array_game.display(board);
		
		// Request input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Players");
		int input1 = sc.nextInt();
		while(true) 
		{
			if(input1 == 1) 
			{
				Array_UserCpu.onePlayer(board);
			}
			else if(input1 == 2)
			{
				Array_PVP.twoPlayer(board, input1);
			}
			else
			{
				System.out.println("Invalid Input");
				System.out.println("Enter Number of Players");
				input1 = sc.nextInt();
			}
		}
		
	}
}

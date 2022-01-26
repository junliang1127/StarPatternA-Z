package Array;

import java.util.ArrayList;
import java.util.*;

public class Array_game 
{
	//Board
	static void display(char board[][]) 
	{
		for(char[] array1D: board) 
		{
			for (char item: array1D)
			{
				System.out.print(item);
			}
			System.out.println();
		}
		
	}
	
	// Insert Position
	static void insert(char board[][], int pos, char ch)
	{
		
		
		if(ch == 'X' )
		{
			Array_TicTac.allUserPos.add(pos);
		}
		else
		{
			Array_TicTac.allCpuPos.add(pos);
		}
		switch(pos) 
		{
			case 1: board[0][0] = ch;
					break;
			case 2: board[0][2] = ch;
					break;
			case 3: board[0][4] = ch;
					break;
			case 4: board[2][0] = ch;
					break;
			case 5: board[2][2] = ch;
					break;
			case 6: board[2][4] = ch;
					break;
			case 7: board[4][0] = ch;
					break;
			case 8: board[4][2] = ch;
					break;
			case 9: board[4][4] = ch;
					break;	
					
			default:System.out.println("Invalid Postion");
					
		}
		//Checks 1
//		if((Array_TicTac.allUserPos.size() + Array_TicTac.allCpuPos.size()) >5) 
//		{
//			int counterX = 0;
//			int counterO = 0;
//			//Check Row
//			for(int i = 0; i<board.length;i++)
//			{
//				for(int j = 0; j<board.length;j++)
//				{
//					if(board[i][j]== 'X') 
//					{
//						counterX++;
//					}
//					else if(board[i][j]== 'O')
//					{
//						counterO++;
//					}
//					j++;
//				}
//				
//				if(counterX == 3)
//				{
//					display(board);
//					System.out.println("Player Wins");
//					System.exit(1);
//				}
//				else if(counterO == 3)
//				{
//					display(board);
//					System.out.println("CPU Wins");
//					System.exit(1);
//				}
//				
//				counterX = 0;
//				counterO = 0;
//				i++;
//			}
//			
//			//Check Column
//			for(int i = 0; i<board.length;i++)
//			{
//				for(int j = 0; j<board.length;j++)
//				{
//					if(board[j][i]== 'X') 
//					{
//						counterX++;
//					}
//					else if(board[j][i]== 'O')
//					{
//						counterO++;
//					}
//					j++;
//				}
//				
//				if(counterX == 3)
//				{
//					display(board);
//					System.out.println("Player Wins");
//					System.exit(1);
//				}
//				else if(counterO == 3)
//				{
//					display(board);
//					System.out.println("CPU Wins");
//					System.exit(1);
//				}
//				
//				counterX = 0;
//				counterO = 0;
//				i++;
//			}
//			
//			//Check Left-Right Diagonal
//			for(int i = 0; i<board.length;i++)
//			{
//				if(i == 0) 
//				{
//					for(int j = 0; j<board.length;j++)
//					{
//						if(board[j][i]== 'X') 
//						{
//							counterX++;
//						}
//						else if(board[j][i]== 'O')
//						{
//							counterO++;
//						}
//						j = board.length;
//					}
//				}
//				else if(i == 4) 
//				{
//					for(int j = 4; j<board.length;j++)
//					{
//						if(board[j][i]== 'X') 
//						{
//							counterX++;
//						}
//						else if(board[j][i]== 'O')
//						{
//							counterO++;
//						}
//						j = board.length;
//					}
//				}
//				else 
//				{
//					for(int j = 2; j<board.length;j++)
//					{
//						if(board[j][i]== 'X') 
//						{
//							counterX++;
//						}
//						else if(board[j][i]== 'O')
//						{
//							counterO++;
//						}
//						j = board.length;
//					}
//				}
//					
//				
//				if(counterX == 3)
//				{
//					display(board);
//					System.out.println("Player Wins");
//					System.exit(1);
//				}
//				else if(counterO == 3)
//				{
//					display(board);
//					System.out.println("CPU Wins");
//					System.exit(1);
//				}
//				i++;
//			}
//			
//			//Check Right-Left Diagonal
//			counterX = 0;
//			counterO = 0;
//			for(int i = 0; i<board.length;i++)
//			{
//				if(i == 0) 
//				{
//					for(int j = 4; j<board.length;j++)
//					{
//						if(board[i][j]== 'X') 
//						{
//							counterX++;
//						}
//						else if(board[i][j]== 'O')
//						{
//							counterO++;
//						}
//						j = board.length;
//					}
//				}
//				else if(i == 2) 
//				{
//					for(int j = 2; j<board.length;j++)
//					{
//						if(board[i][j]== 'X') 
//						{
//							counterX++;
//						}
//						else if(board[i][j]== 'O')
//						{
//							counterO++;
//						}
//						j = board.length;
//					}
//				}
//				else 
//				{
//					for(int j = 0; j<board.length;j++)
//					{
//						if(board[i][j]== 'X') 
//						{
//							counterX++;
//						}
//						else if(board[i][j]== 'O')
//						{
//							counterO++;
//						}
//						j = board.length;
//					}
//				}
//					
//				
//				if(counterX == 3)
//				{
//					display(board);
//					System.out.println("Player Wins");
//					System.exit(1);
//				}
//				else if(counterO == 3)
//				{
//					display(board);
//					System.out.println("CPU Wins");
//					System.exit(1);
//				}
//				i++;
//			}
//			
//		}
		
		// Check Ver 2 User Check
//		if (Array_TicTac.allUserPos.size() >= 3) 
//		{
//			int [] check = new int[3];
//			for(int i = 0; i < Array_TicTac.allUserPos.size();i++)
//			{
//				for(int j = i+1; j < Array_TicTac.allUserPos.size(); j++)
//				{
//					for(int z = j+1; z < Array_TicTac.allUserPos.size(); z++)
//					{
//						Collections.sort(Array_TicTac.allUserPos);
//						check[0] = Array_TicTac.allUserPos.get(i);
//						check[1] = Array_TicTac.allUserPos.get(j);
//						check[2] = Array_TicTac.allUserPos.get(z);
//						
//						switch(Arrays.toString(check)) 
//						{
//							case "[1, 2, 3]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[4, 5, 6]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[7, 8, 9]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[1, 4, 7]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[2, 5, 8]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[3, 6, 9]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[1, 5, 9]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;
//							case "[3, 5, 7]": display(board);
//											System.out.println("Player Wins");
//											System.exit(1);
//											break;		
//						}
//					}
//				}
//			}
//		}
//		//CPU Check
//		if (Array_TicTac.allCpuPos.size() >= 3) 
//		{
//			//System.out.println("In CPU Check");
//			int [] check = new int[3];
//			for(int i = 0; i < Array_TicTac.allCpuPos.size();i++)
//			{
//				for(int j = i+1; j < Array_TicTac.allCpuPos.size(); j++)
//				{
//					for(int z = j+1; z < Array_TicTac.allCpuPos.size(); z++)
//					{
//						Collections.sort(Array_TicTac.allCpuPos);
//						check[0] = Array_TicTac.allCpuPos.get(i);
//						check[1] = Array_TicTac.allCpuPos.get(j);
//						check[2] = Array_TicTac.allCpuPos.get(z);
//						
//						switch(Arrays.toString(check)) 
//						{
//							case "[1, 2, 3]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[4, 5, 6]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[7, 8, 9]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[1, 4, 7]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[2, 5, 8]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[3, 6, 9]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[1, 5, 9]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;
//							case "[3, 5, 7]": display(board);
//											System.out.println("CPU Wins");
//											System.exit(1);
//											break;		
//						}
//					}
//				}
//			}
//		}
		
		//Draw Senario
//		if((Array_TicTac.allUserPos.size() + Array_TicTac.allCpuPos.size()) == 9) 
//		{
//			display(board);
//			System.out.println("The Game Is A Draw");
//			System.exit(1);	
//		}
		
	}
	
	//Check Ver Ahkil
	static void checkWinner(String a, String b)
	{
		List topRow = Arrays.asList(1, 2, 3);
		List midRow = Arrays.asList(4, 5, 6);
		List botRow = Arrays.asList(7, 8, 9);
		List leftCol = Arrays.asList(1, 4, 7);
		List midCol = Arrays.asList(2, 5, 8);
		List rightCol = Arrays.asList(3, 6, 9);
		List diag1 = Arrays.asList(1, 5, 9);
		List diag2 = Arrays.asList(3, 5, 7);
		
		List<List> winCon = new ArrayList<List>();
		winCon.add(topRow);
		winCon.add(midRow);
		winCon.add(botRow);
		winCon.add(leftCol);
		winCon.add(midCol);
		winCon.add(rightCol);
		winCon.add(diag1);
		winCon.add(diag2);
		
		for(List l : winCon)
		{
			if(Array_TicTac.allUserPos.containsAll(l))
			{
				System.out.println(a + " is the winner");
				System.exit(0);
			}
			else if(Array_TicTac.allCpuPos.containsAll(l))
			{
				System.out.println(b + " is the winner");
				System.exit(0);
			}
			
		}
		if((Array_TicTac.allUserPos.size() + Array_TicTac.allCpuPos.size()) == 9)
		{
			System.out.println("The game is a draw");
			System.exit(0);
		}
	}
	
	
}

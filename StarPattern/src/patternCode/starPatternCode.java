package patternCode;
// Try
import java.util.Scanner;
class Alpha
{
	void alpha(String s, int n) 
	{
		for(int k=0;k<=s.length()-1;k++)
		{
			char ch = s.charAt(k);
			
			switch(ch) 
			{
				//A
				case 'A' :
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( (c == 1 || c == n) && r > n/2 || r+c == (n/2) + 1 + n%2 || c-r == n/2 || r == n/2 + 1 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}							
						System.out.println();
						System.out.println();
						break;
			
						
					
				// B
				case 'B':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || r == 1 && c < 3*n/4 || c == 3*n/4 && r < n/2 + n%2 && r > 1 || (r == n/2 + n%2 || r == n) && c < n || c == n && r > n/2 + n%2 && r < n)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
			
					
				// C
				case 'C':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 && r > 1 && r < n || (r == 1 || r == n) && c > 1 && c <= n )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
				// D
				case 'D':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || (r == 1 || r == n) && c < n || r > 1 && r < n && c == n)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// E
				case 'E':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || (r == 1 || r == n || r == n/2 + n%2) && c <= n )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// F
				case 'F':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || (r == 1 || r == n/2 + n%2) && c <= n )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// G
				case 'G':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 && r > 1 && r < n || (r == 1 || r == n) && c > 1 && c < n || r >= n/2 + n%2 && r < n && c == n || r == n/2 + n%2 && c >= n/2 - n%2 )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// H
				case 'H':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || c == n || r == n/2 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
				
				// I
				case 'I':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( r == 1 || r == n || c == n/2 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// J
				case 'J':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( r == 1 || r == n && c <= 3*n/4 || c == 3*n/4  )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// K
				case 'K':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || c == r && r > n/2 + n%2 || c == n - r && r < n/2 + n%2 || r == n/2 + n%2 && c < n/2 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// L
				case 'L':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || r == n )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// M
				case 'M':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || c == r+1 && c <= n/2 + n%2 || c == n - r && r < n/2 + n%2 || c == n)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// N
				case 'N':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || c == r || c == n)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// O
				case 'O':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( (r == 1 || r == n) && (c >= 2 && c <= n-1) || (c == 1 || c == n) && (r >= 2 && r <= n-1))
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// P
				case 'P':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || (r == 1 || r == n/2 + n%2) && c <= n-2 || (r >= 2 && r < n/2 + n%2) && c == n - 1  )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// Q
				case 'Q':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( (r == 1 || r == n) && (c >= 2 && c < n-1) || (c == 1 || c == n) && (r >= 2 && r <= n-1) || c == r && r >= 3*n/4)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// R
				case 'R':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 || (r == 1 || r == n/2 + n%2) && c <= n-2 || (r >= 2 && r < n/2 + n%2) && c == n - 1 || c == r && r > n/2 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// S
				case 'S':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( c == 1 && r < n/2 + n%2 || c == n && r > n/2 + n%2 || (r == 1 || r == n || r == n/2 + n%2) && c <= n )
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// T
				case 'T':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( r == 1 || c == n/2 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// U
				case 'U':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( r == n && (c >= 2 && c <= n-1) || (c == 1 || c == n) && (r >= 2 && r <= n-1))
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// V
				case 'V':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if(c == 1 && (r < n/2 + n%2 || r <= n/2 + n%2 && n%2==0) || r == n && n%2 == 0 && (c == n/2 + n%2 && n%2 == 0 )
										|| r-n/2 + n%2 == c && (n%2==1 && r != n||n%2!=1)|| n - (r-n/2 + n%2) +1 == c && r>= n/2 + n%2 && (r != n && n%2 == 1 || n%2 ==0)
										|| c == n && (r < n/2 + n%2 || r <= n/2 + n%2 && n%2==0))
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// W
				case 'W':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if(c == 1 || c == r+1 && c > n/2 + n%2 || c == n - r && r > n/2 + n%2 || c == n)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// X
				case 'X':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if(c == r && c != n || c == n - r)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// Y
				case 'Y':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if(c == r && c != n && r < n/2 + n%2 || c == n - r && r < n/2 + n%2 || r >= n/2 + n%2 && c == n/2 + n%2)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
						
				// Z
				case 'Z':
					
						for(int r=1; r<=n; r++)
						{
							for(int c=1; c<=n; c++)
							{
								if( r ==1 && c < n-1 || c == n-r || r == n)
								{
									System.out.print('*');
								}
								else
								{
									System.out.print(' ');
								}
							}
							System.out.println();
						}
						System.out.println();
						System.out.println();
						break;
			}
		}
	}
}
public class starPatternCode {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String s = sc.nextLine();
		
		System.out.println("Enter the font size");
		int n = sc.nextInt();

		s = s.toUpperCase();
		
		Alpha a1 = new Alpha();
		a1.alpha(s, n);
		sc.close();
	}

}

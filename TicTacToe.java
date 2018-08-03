import java.util.Scanner;
public class TicTacToe 
{
	public static char[][] board=new char[3][3];
	public static int sumHor1 = 0;
	public static int sumHor2 = 0;
	public static int sumHor3 = 0;
	public static int sumVer1 = 0;
	public static int sumVer2 = 0;
	public static int sumVer3 = 0;
	public static int sumDia1 = 0;
	public static int sumDia2 = 0;
	public void sum()
	{
		sumHor1 = board[0][0]+board[0][1]+board[0][2];
		sumHor2 = board[1][0]+board[1][1]+board[1][2];
		sumHor3 = board[2][0]+board[2][1]+board[2][2];
		sumVer1 = board[0][0]+board[1][0]+board[2][0];
		sumVer2 = board[0][1]+board[1][1]+board[2][1];
		sumVer3 = board[0][2]+board[1][2]+board[2][2];
		sumDia1 = board[0][0]+board[1][1]+board[2][2];
		sumDia2 = board[0][2]+board[1][1]+board[2][0];
	}
	public boolean victory()
	{
		if(sumHor1==264||sumHor2==264||sumHor3==264
		|| sumHor1==237||sumHor2==237||sumHor3==237
		|| sumVer1==264||sumVer2==264||sumVer3==264
		|| sumVer1==237||sumVer2==237||sumVer3==237
		|| sumDia1==264 || sumDia1==237
		|| sumDia2==264 || sumDia2==237)
			return true;
		else
			return false;		
	}
	public static int plays = 0;
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		TicTacToe game = new TicTacToe();
		do
		{
		    //player x turn
		    System.out.print("Enter a row (0, 1, or 2) for player X: ");
		    int rowX = keyboard.nextInt();
		    System.out.print("Enter a column (0, 1, or 2) for player X: ");
		    int columnX = keyboard.nextInt();
		    board[rowX][columnX]='X';
		    plays++;
		    //display table
		    System.out.println("-------------------\n|  "+board[0][0]+"   |  "+board[0][1]+"   |  "+board[0][2]+"   |"
				+ "\n-------------------\n|  "+board[1][0]+"   |  "+board[1][1]+"   |  "+board[1][2]+"   "
						+ "|\n-------------------\n|  "+board[2][0]+"   |  "+board[2][1]+"   |  "+board[2][2]+"   |\n-------------------");
		    game.sum();
		    game.victory();
		    if(game.victory())
			    break;
		    //player O turn
		    System.out.print("Enter a row (0, 1, or 2) for player O: ");
		    int rowY = keyboard.nextInt();
		    System.out.print("Enter a column (0, 1, or 2) for player O: ");
		    int columnY = keyboard.nextInt();
		    board[rowY][columnY]='O';
		    plays++;
			game.sum();
			game.victory();	
			//Display board
			System.out.println("-------------------\n|  "+board[0][0]+"   |  "+board[0][1]+"   |  "+board[0][2]+"   |"
								+ "\n-------------------\n|  "+board[1][0]+"   |  "+board[1][1]+"   |  "+board[1][2]+"   "
										+ "|\n-------------------\n|  "+board[2][0]+"   |  "+board[2][1]+"   |  "+board[2][2]+"   |\n-------------------");
		}
		while(!game.victory()&&plays<8);
		if(sumHor1==264||sumHor2==264||sumHor3==264
		|| sumVer1==264||sumVer2==264||sumVer3==264
		|| sumDia1==264||sumDia2==264)
			System.out.println("Player X won the game!");
		if(sumHor1==237||sumHor2==237||sumHor3==237
				|| sumVer1==237||sumVer2==237||sumVer3==237
				|| sumDia1==237||sumDia2==237)
		    System.out.println("Player O won the game!");
		else if(plays==8)
			System.out.println("Tie!");	
    }
}
/**
 * The Die class simulates the rolling of an n-sided die
 */
import java.util.Random;

public class Die 
{
	private int sides;
	private int value;
	/**
	 * The constructor performs an initial roll of the die
	 * @param numSides # of sides
	 */
	public Die(int numSides)
	{
		sides=numSides;
		roll();
	}
	/**
	 * This method simulates the rolling of a die
	 */
	public void roll()
	{
		Random randNum = new Random();
		value =randNum.nextInt(sides)+1;
	}
	/**
	 * This method 
	 * @return the # of sides of the die
	 */
	public int getSides()
	{
		return sides;
	}
	/**
	 * This method 
	 * @return the value of the die
	 */
	public int getValue()
	{
		return value;
	}
}
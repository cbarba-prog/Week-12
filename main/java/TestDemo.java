import java.util.Random;

public class TestDemo {

//Throws exception if 0 or negative, returns sum if 2 integers are positive
	public int addPositive(int a, int b) {
		if(a <= 0 || b <= 0)
		{
			throw new IllegalArgumentException ("Both parameters must be positive!"); 
		}
			return a + b;
	}
//Returns squared integer of the random number between 1 and 10
	public int randomNumberSquared() {
		int num = getRandomInt();
	    return num * num;
	}
//Returns random integer between 1 and 10
	public int getRandomInt() {
		  Random random = new Random();
		  return random.nextInt(10) + 1;
		}

	
}

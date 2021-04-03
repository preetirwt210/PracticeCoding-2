package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	  int number=10000;

	  int minIntegerValue=Integer.MIN_VALUE;
	  int maxIntegerValue=Integer.MAX_VALUE;

	  System.out.println("Minimum Integer value= " + minIntegerValue);
	  System.out.println("Maximum Integer Value= " + maxIntegerValue);

	  System.out.println("Burst Minimum value is: " + (minIntegerValue -1));
	  System.out.println("Burst Maximum Value is: " + ( maxIntegerValue+1));

	  byte minByteValue=Byte.MIN_VALUE;
	  byte maxByteValue=Byte.MAX_VALUE;

	  System.out.println("Minimum Byte value is= " + minByteValue);
	  System.out.println("Maximum Byte Value is= " + maxByteValue);

		short minShortValue=Short.MIN_VALUE;
		short maxShortValue=Short.MAX_VALUE;

		System.out.println("Minimum Short value is= " + minShortValue);
		System.out.println("Maximum Short Value is= " + maxShortValue);


		long minLongValue=Long.MIN_VALUE;
		long maxLongValue=Long.MAX_VALUE;

		System.out.println("Minimum Long value is= " + minLongValue);
		System.out.println("Maximum Long Value is= " + maxLongValue);

		primitiveTypeChallenge prim=new primitiveTypeChallenge();
		prim.challenge();

    }
}

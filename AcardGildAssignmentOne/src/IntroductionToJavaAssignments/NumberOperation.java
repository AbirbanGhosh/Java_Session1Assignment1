package IntroductionToJavaAssignments;

public class NumberOperation { 
	
	public static boolean isNumber(String str){
		return str.matches("-?\\d+(\\.\\d+)?");
	}
	
	public static boolean isIntiger(String str){
		return str.matches("-?\\d+");
	}
	
	public static double add(double a, double b)
	{
		return a - (-b);
	}
	
	public static int add(int a, int b)
	{
		return a - (~b) - 1;
	}
	
}

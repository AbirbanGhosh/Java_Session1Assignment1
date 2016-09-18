package IntroductionToJavaAssignments;

public class TestClass {
	public static void main(String[] args) {
		
		
		if(2 == args.length &&
		   true == NumberOperation.isNumber(args[0]) &&
		   true == NumberOperation.isNumber(args[1]))
		{
			if( false == NumberOperation.isIntiger(args[0]) ||
				false == NumberOperation.isIntiger(args[1])){
				System.out.println("Adding two numbers  (" +
						args[0] + "- (-" + args[1] + ")) = " +
						NumberOperation.add(Double.parseDouble(args[0]), 
								Double.parseDouble(args[1])));
			}
			else
			{
				System.out.println("Adding two numbers (" +
						args[0] + "- (~" + args[1] + ") - 1) = " +
						NumberOperation.add(Integer.parseInt(args[0]), 
								Integer.parseInt(args[1])));
			}
		}
		else
		{
			System.out.println("ERROR: Invalid arguments: Please insert two numbers as command line argument");
		}
	}
	
}

package arrayAssigments;

public class MethodForAverageNumber {
	
	
	
	public static void main (String []args) {
		
		MethodForAverageNumber m = new MethodForAverageNumber();
		
		double result = m.AverageOfNumbers();
		System.out.println("The average for the five radom numbers is : " + result);
		
	}
	
		public double AverageOfNumbers (){
			int [] array = {23, 34, 54, 4, 5};
			double sum = 0;
			
			int length = array.length;
			for (int i=0; i<length; i++) {
				 sum += array [i];
			}
			
			return (sum / 5);
		}
}

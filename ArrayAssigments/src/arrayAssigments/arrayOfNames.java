package arrayAssigments;

public class arrayOfNames {
	
	public static void main (String []args) {
		
		 
		String [] arrayOfNames = new String [3];
		
		 arrayOfNames [0] = "Davis";
		 arrayOfNames [1] = "Glen";
		 arrayOfNames [2] = "Elijah";
		 
			
			int length = arrayOfNames.length;
			
			for (int i=0; i< length; i++) {
				System.out.println(" Name in Array : "  + "index "+ i + " is " + arrayOfNames[i]);
			}
		}
}

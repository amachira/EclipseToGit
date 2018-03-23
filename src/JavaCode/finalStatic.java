package JavaCode;

public class finalStatic {
  int age = 45;	                    // non-static variable
  static double salary = 8877.66;   // static variable
  final static String name = "Anageshwar";
  
  public static void display()	    // static method
  {
    System.out.println("Hello World");
    
  }
 
  public static void main(String args[])
  {
	 // salary = 4545.44;
	  // System.out.println(age);     // raises error, it is non-static and requires object
    System.out.println(salary);     // works fine as salary is static, object not required
    display();		            // works fine as display() is static, object not required
    System.out.println(name);
    
  //****FINAL Example***//

    {
        int rupees = 500;		    // non-final can be reassigned
        System.out.println("rupees before reassigned: " + rupees);
        rupees = 600;		    // non-final
        System.out.println("rupees after reassigned: " + rupees);
     
        final double $rate = 61.5;	    // final cannot be reassigned
        System.out.println("$ Rate is Rs." + $rate);
        // $rate = 62.8;		    // raises error
        
        
        
      }
    	
    new finalStatic();
  }

 finalStatic() {
	// TODO Auto-generated method stub
	System.out.println("This is a no argument constructor");
}

  
  
  

}

package JavaCode;

import JavaCode.dynamicParentBinding;

class dynamicChildBinding extends dynamicParentBinding {
	
		 void eat(){System.out.println("dog is eating...");}  
		
		 private  void sleep()
		  {
			  System.out.println("dog is sleeping...");
		  }
		 public static void main(String args[]){  
			 
			
		
	dynamicParentBinding a=new dynamicChildBinding();	 	 
	 a.eat();  //dynamic binding //When type of the object is determined at run-time,known as dynamic binding.(Late binding)
		
	 dynamicParentBinding p=new dynamicParentBinding();
	 p.eat(); //dynamic binding //When type of the object is determined at run-time,known as dynamic binding.
	
	 
	 dynamicChildBinding c = new dynamicChildBinding();
		  c.eat();
		  c.sleep(); //static binding
		/*  When type of the object is determined at compiled time(by the compiler), it is known as static binding.

		  If there is any private, final or static method in a class, there is static binding.*/
		 }  
}

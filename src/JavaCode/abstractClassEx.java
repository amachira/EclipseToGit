package JavaCode;

abstract class abstractClassEx {
	//example of abstract class that have method body  
	   
	abstractClassEx(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	  
	 class Honda extends abstractClassEx{  
	 void run(){System.out.println("running safely..");}  
	 }  
	 
	 
	 class TestAbstraction2{  
	 public static void main(String args[]){  
		 abstractClassEx obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  


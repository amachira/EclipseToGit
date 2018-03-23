package JavaCode;

public class constructorEx {
	      private int var;
	      //default constructor
	      public constructorEx()
	      {
	             this.var = 10;
	      }
	      //parameterized constructor
	      public constructorEx(int num)
	      {
	             this.var = num;
	      }
	      public int getValue()
	      {
	              return var;
	      }
	      public static void main(String args[])
	      {
	    	  constructorEx obj = new constructorEx();
	    	  constructorEx obj2 = new constructorEx(100);
	              System.out.println("var is: "+obj.getValue());
	              System.out.println("var is: "+obj2.getValue());
	      }
	}

package JavaCode;

public class thisKeyword {
		int a;
		 int b;

		 public void setData(int a ,int b){
		  this.a = a;
		  this.b = b;
		 }
		 public void showData(){
		   System.out.println("Value of A ="+a);
		   System.out.println("Value of B ="+b);
		 }
		 public static void main(String args[]){
	       thisKeyword obj = new thisKeyword();
		   obj.setData(2,3);
		   obj.showData();
		   
		   thisKeyword obj2 = new thisKeyword();
		   obj2.setData(3,5);
		   obj2.showData();
		 }
		}

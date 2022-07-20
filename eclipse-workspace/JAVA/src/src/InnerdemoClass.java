package src;
import java.lang.*;


class Outer{
	int a;
	public void set(int a) {
		this.a=a;
	}
	public static void show() {
	System.out.println("I am in Outer Class");
	}
	class Inner{
		
		public void display(int a) {
		System.out.println("I am in Inner Class and accessing outer variable "+a);;
		}
	}
}

 class InnerdemoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj = new Outer();
		Outer.Inner obj1 = obj.new Inner();
		obj.show();
		obj.set(10);
		obj1.display(10);

	}

}

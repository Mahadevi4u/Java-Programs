class superClass{
	public void display() {
		System.out.println("I am in super class.");
	}
	public void show() {
		System.out.println("Show method");
	}
}
class subClass extends superClass{
	public void display() {
		super.display();
		System.out.println("I am in Sub class");
	}
	public void config() {
		System.out.println("Method in sub class");
	}
}
public class DynamicMethodDisplatch {

	public static void main(String[] args) {
		superClass obj = new subClass();
		obj.display();
		obj.show();

	}

}

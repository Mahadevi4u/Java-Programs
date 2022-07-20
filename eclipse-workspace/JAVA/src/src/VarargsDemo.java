package src;
class Add{
	public void sum(int ... j) { //Get in the form of an array
		int sum=0;
		for(int k:j) {
			sum+=k;
		}
		System.out.println(sum);
	}
}

public class VarargsDemo {
	public static void main(String []args) {
		Add obj = new Add();
		obj.sum(1,2,3,4,4,5,5,5,5,5,5,5);
	}

}

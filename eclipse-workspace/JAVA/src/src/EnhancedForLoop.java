package src;

public class EnhancedForLoop {

	public static void main(String[] args) {
		int a[][] = {{1,2,3,4},{5,6,7},{8,9,10,11}};
		System.out.println("Normal for loop : ");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(" "+a[i][j]);
			}
			System.out.println();
		}

		System.out.println("Enhanced for  Loop");
		for(int[] k : a) {
			for(int m:k) {
				System.out.print(" " +m);
			}
			System.out.println();
		}
	}

}

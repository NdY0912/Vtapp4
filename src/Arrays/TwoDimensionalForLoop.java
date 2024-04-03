package Arrays;

public class TwoDimensionalForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] a = {{5,2,9},{4,6,8}};
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<a[i].length;j++) {
				
				System.out.print(a[i][j]+" ");
				
			}
			
			System.out.println();
			
		}
	}

}

package Cau2;

public class Cau2 {
	public static double giaiThua(int n) {
		double result=1;
		for (int i = 1; i <= n; i++) {
			result*=i;
		}
		return result;
	}
	public static double toHop(int n, int k) {
		double result;
		result = (giaiThua(n))/((giaiThua(k)*(giaiThua(n-k))));
		return result;
	}
	public static void passcal(int n,int k) {
		int [][] result = new int [n][];
		for (int i = 0; i < n; i++) {
			result[i] = new int[i+1];
			for (int j = 0; j < result[i].length; j++) {
				result[i][j]= (int)toHop(i,j);
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}
	public static void main(String[] args) {
		//System.out.println(giaiThua(6));
		//System.out.println(toHop(3,1));
		passcal(5,5);
	}
}

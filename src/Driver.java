
public class Driver {

	public static void main(String[] args) {
		
		int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
		int[][] m2 = {{1, 2}, {3, 4}, {5, 6}};
		
		if(m1[0].length != m2.length) {
			System.out.println("Multiplication Undefined");
		}
		else {
			int[][] answer = multiply(m1, m2);
			
			for(int row = 0; row < answer.length; row++) {
				for(int column = 0; column < answer[0].length; column++) {
					System.out.print(answer[row][column] + " ");
				}
				System.out.println();
			}
		}

	}
	
	public static int[][] multiply(int[][] mat1, int[][] mat2) {
		int[][] result = new int[mat1.length][mat2[0].length];
		
		for(int row = 0; row < mat1.length; row++) {
			for(int column = 0; column < mat2[0].length; column++) {
				for(int i = 0; i < mat1[0].length; i++) {
					result[row][column] += mat1[row][i] * mat2[i][column];
				}
			}
		}
		return result;
	}

}

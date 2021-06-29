import java.util.Arrays;

public class RotOranges {

	public static int[][] findrotOranages(int[][] arr) {
		int C = arr[0].length;
		int R = (arr.length);
		Boolean possible = true;
		Boolean rotten= false;
		int count=0;
		for (int i = 0; i < R; i++) {

			for (int j = 0; j < C; j++) {
			count =count +1;
			System.out.println("count: "+ count);
			possible= rotPossible(i,j, arr, C,R);

				if (possible && arr[i][j] == 2) {
					
					if (i == 0) {
						if (j == (C - 1)) {
							// arr[i-1][j]=2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
							// arr[i][j+1]=2;
						}
						if (j == 0) {
							// arr[i-1][j]=2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							// arr[i][j-1]=2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						} else if (j != 0 && j != (C - 1)) {
							// arr[i-1][j]=2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						}

					}

					else if (i == (R - 1)) {
						if (j == (C - 1)) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							// arr[i+1][j]=2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
							// arr[i][j+1]=2;
						}
						if (j == 0) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							// arr[i+1][j]=2;
							// arr[i][j-1]=2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						} else if (j != 0 && j != (C - 1)) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							// arr[i+1][j]=2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						}
					}

					else if (j == 0) {
						if (i == 0) {
							// arr[i-1][j]=2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							// arr[i][j-1]=2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						}
						if (i == (R - 1)) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							// arr[i+1][j]=2;
							// arr[i][j-1]=2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						} else if (i != 0 && i != (R - 1)) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							// arr[i][j-1]=2;
							if (arr[i][j + 1] != 0)
								arr[i][j + 1] = 2;
						}
					}

					else if (j == (C - 1)) {
						if (i == 0) {
							// arr[i-1][j]=2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
							// arr[i][j+1]=2;
						}
						if (i == (R - 1)) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							// arr[i+1][j]=2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
							// arr[i][j+1]=2;

						} else if (i != 0 && i != (R - 1)) {
							if (arr[i - 1][j] != 0)
								arr[i - 1][j] = 2;
							if (arr[i + 1][j] != 0)
								arr[i + 1][j] = 2;
							if (arr[i][j - 1] != 0)
								arr[i][j - 1] = 2;
//						arr[i][j+1]=2;
						}
					} else {

						
						if (arr[i - 1][j] != 0)
							arr[i - 1][j] = 2;
						if (arr[i + 1][j] != 0)
							arr[i + 1][j] = 2;
						if (arr[i][j - 1] != 0)
							arr[i][j - 1] = 2;
						if (arr[i][j + 1] != 0)
							arr[i][j + 1] = 2;

						

					}

				}

				if(rottenOrNot(arr,R,C)){
					//return count;
					break;
				}
			}
		}
		return arr;
	}

	static boolean rottenOrNot(int [][] arr,int R, int C) {
		boolean rotten=true;
		for (int i=0; i<R; i++) {
			for(int k=0;k<C; k++) {
				if(arr[i][k]==1) {
					rotten=false;
				}
			}
		}
		return rotten;
	}
	static boolean rotPossible(int i, int j, int[][] arr, int C, int R) {

		if (i == 0 && j == 0 && arr[i][j + 1] == 0 && arr[i + 1][j] == 0 && arr[i + 1][j + 1] == 0) {
			System.out.println("1st row 1st column not rottable false");
			return false;

		}
		if (i == 0 && j == C - 1 && arr[i][j - 1] == 0 && arr[i + 1][j] == 0 && arr[i + 1][j - 1] == 0) {
			System.out.println("i row , last column not rottable :-false");
			return false;

		}
		if (i == R - 1 && j == 0 && arr[i - 1][j] == 0 && arr[i][j + 1] == 0 && arr[i - 1][j + 1] == 0) {

			System.out.println("last row 1st column not rottable  :false");
			return false;

		}
		if (i == R - 1 && j == C - 1 && arr[i - 1][j] == 0 && arr[i][j - 1] == 0 && arr[i - 1][j - 1] == 0) {
			System.out.println("last row last column not rottable false");
			return false;
		}
		if (i != 0 && j != 0 && i != R - 1 && j != C - 1 && arr[i - 1][j] == 0 && arr[i + 1][j] == 0
				&& arr[i][j - 1] == 0 && arr[i][j + 1] == 0) {
			System.out.println(i + " row last " + j + " column not rottable : false");
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[][] = { { 2, 1, 0, 2, 1 },
                { 1, 0, 1, 2, 1 },
                { 1, 0, 0, 2, 1 } };

		//int v[][] = { { 2, 1, 0, 2, 1 }, { 0, 0, 1, 2, 1 }, { 1, 0, 0, 2, 1 } };
		// System.out.println(findrotOranages(v));
		System.out.println(Arrays.deepToString(findrotOranages(v)));
	}

}

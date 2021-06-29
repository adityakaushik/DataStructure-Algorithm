
public class CalculateHourJob {

	public static int sumofHourGlass(int[][] arr, int minrow, int maxrow, int mincol, int maxcol) {
		int sum = 0;
		for (int i = minrow; i <= maxrow; i++) {

			for (int j = mincol; j <= maxcol; j++) {
				if (i == minrow || i == maxrow ||j==(mincol+maxcol)/2) {
					
					sum = sum + arr[i][j];
					
				}
			}
		}
		return sum;

	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		int maxsum = 0;
		int[][] arr = { 
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
						};
		for (int i = 0; i < 6; i++) {

			for (int j = 0; j <6; j++) {
				int sum=0;
				if(i<4&&j<4) {
				
				 sum= sumofHourGlass(arr, i, i + 2, j, j + 2);
				}
				if (sum > maxsum) {
					maxsum = sum;
				}
			}
		}
		System.out.println(maxsum);

	}
}
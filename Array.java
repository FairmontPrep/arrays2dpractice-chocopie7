public class Array
{

	// Array should be of format
	// 1 2 3
	// 4 5 6
	// 7 8 9
	public int[][] getRowMajorSquare(int x)
	{
	int count =1;
	int[][] a = new int[x][x];
	for (int i=0; i<x; i++){
		for (int j=0; j<x; j++){
			a[i][j]=count;
			count++;
		}
	}

	return a;
	}
	// Array should be of format
	// 1 4 7
	// 2 5 8
	// 3 6 9
	public int[][] getColumnMajorSquare(int x)
	{
	int count =1;
	int[][] a = new int[x][x];
	for (int i=0; i<x; i++){
		for (int j=0; j<x; j++){
			a[j][i]=count;
			count++;
		}
	}
	return a;
	}

	// Array should be of format
	// 1  2  3  4
	// 5 6 7 8
	// 9 10 11 12
	public int[][] getRowMajorRectangle(int row, int column)
	{
	int count =1;
	int[][] a = new int[row][column];
	for (int i=0; i<row; i++){
		for (int j=0; j<column; j++){
			a[i][j]=count;
			count++;
		}
	}
	return a;
	}

	// Array should be of format
	// 1 4 7 10
	// 2 5 8 11
	// 3 6 9 12
	public int[][] getColumnMajorRectangle(int column, int row){
	int count =1;
	int[][] a = new int[row][column];
	for (int i=0; i<row; i++){
		for (int j=0; j<column; j++){
			a[i][j]=count;
			count++;
		}
	}
	return a;
	}

	// Please note that each digit occupies two spaces and there is a space between
	// them.
	// You are not required to deal with three digit numbers.
	public void printDouble(int[][] a)
    {
		for (int i =0; i<a.length;i++){
			for (int j=0; j<a[0].length;j++){
				System.out.print(a[i][j]);
				if (Integer.toString(a[i][j]).length()==2){
					System.out.print(" ");
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}
}
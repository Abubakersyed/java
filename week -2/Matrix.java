class Matrix 
{
	public static void main(String[] args) 
	{
		int[][] a={
			{1,2},{3,4}
		};
		System.out.println("matrix is: ");
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

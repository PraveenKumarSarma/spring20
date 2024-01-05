public class Test2 {
	public static void main(String[] args) {
		int[][] a = {{1,0,0},{0,1,0},{0,0,1}};
		boolean option = Test2.isIdentity(a);
		if(option)
		{
			System.out.println("Identity matrix");
			
		}
		else
		{
			System.out.println("not identity matrix");
		}
		
		
	}
	public static boolean isIdentity(int[][] a)
	{
		boolean option = true;
		for(int i=0;i<a.length;i++)
		{
		
			for(int j=0;j<a[i].length;j++)
			{
				if(i == j && a[i][j] == 1)
				{
					continue;
				}
				
				else if(i != j && a[i][j] == 0)
				{
					continue;
				}
				else
				{
					option = false;
					break;
				}
			}
			
		}
		return option;
	}
}

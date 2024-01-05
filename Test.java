
public class Test {
	public static void main(String[] args) {
		int[][] a = {{1,1,0},{0,1,0},{0,0,1}};
		boolean flag = Test.isIdentity(a);
		if(flag)
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
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				if(i == j && a[i][j] != 1)
				{
					return false;
				}
				if(i != j && a[i][j] != 0)
				{
					return false;
				}
			}
		}
		return true;
	}
}

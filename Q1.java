
public class Q1 
{

	public static void main(String[] args) 
	{
		/* 1.Write a program(WAP) to print INEURON using pattern programming logic */
		
		int n =5;
		for(int i=0;i<n;i++)
		{
			/*Logic for character 'I'*/
			for(int j=0;j<n;j++)
			{
				if(i==0 || i==n-1 || j==(n-1)/2)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			/*Logic for character 'N'*/
			for(int k=0;k<n;k++)
			{
				if(k==0 || k==n-1 || k==i)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			/*Logic for character 'E'*/
			for(int l=0;l<n;l++)
			{
				if(i==0 || i==n-1 || i==(n-1)/2 || l==0)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			/*Logic for character 'U'*/
			for(int m=0;m<n;m++)
			{
				if((m==0 && i<n-1) || (m==n-1 && i<n-1) || (i==(n-1) && m!=(n-1)&& m!=0))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			/*Logic for character 'R'*/
			for(int p=0;p<n;p++)
			{
				if(p==0 || (i==0 && p<(n-1)) || (i==(n-1)/2 && p!=(n-1)) || (p==(n-1) && i<(n-1)/2 && i!=0) || (i==p && p>(n-1)/2))
				{ 
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			/*Logic for character 'O'*/
			for(int q=0;q<n;q++)
			{
				if((i==0 && q!=0 && q<(n-1)) || (i==(n-1) && q!=0 && q<(n-1))|| (q==0 && i!=0 && i<(n-1)) || (q==(n-1) && i<(n-1) && i!=0))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			/*Logic for character 'N'*/
			for(int r=0;r<n;r++)
			{
				if(r==0 || r==(n-1) || (i==r))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}
	}

}

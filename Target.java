import java.util.Scanner;

public class Target {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.nextLine();
		int t=sc.nextInt();
		int sum=0;boolean flag=false;
		String[] arr=st.split(",");
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			if(flag==false)
			{
			for(int j=i;j<arr.length;j++)
			{
				sum=sum+(Integer.parseInt(arr[j]));
				if(sum==t)
				{
					flag=true;
					for(int k=i;k<j+1;k++)
					{
						System.out.print(arr[k]);
						if(k!=j)
							System.out.print(",");
					}
				}
				
			}
			}
		}

	}

}

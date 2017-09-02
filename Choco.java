import java.util.Scanner;

public class Choco {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("No of Textcases");
		int n=sc.nextInt();
		sc.nextLine();
		int re=1;
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		for(int j=0;j<n;j++)
		{
			String[] pro=arr[j].split(" ");
			for(int k=0;k<pro.length;k++)
				re=re*(Integer.valueOf(pro[k]));
			System.out.println(re-1);
			re=1;
		}
	}

}

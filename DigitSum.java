import java.util.Scanner;

public class DigitSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		int sum=0;
		String[] arr=st.split("");
		for(int i=arr.length;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				sum=sum+(Integer.parseInt(arr[j]));		
			}
		}
		System.out.println(sum);
	}

}

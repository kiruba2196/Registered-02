import java.util.Scanner;

public class DigitPower {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int l=String.valueOf(n).length();
		while(n>0)
		{
			int rem=n%10;
			sum=(int) (sum+(Math.pow(rem,l)));
			n=n/10;
		}
		System.out.println(sum);
	}

}

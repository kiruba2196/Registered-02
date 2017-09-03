
import java.util.Scanner;
class prg25 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=(int) Math.pow(2,n);
		for(int i=0;i<m;i++)
		{
			String s=Integer.toBinaryString(i);
			if(s.length()!=n)
			{
				for(int j=0;j<(n-s.length());j++)
				System.out.print("0");
			}
			System.out.print(s);
			System.out.println();
		}

	}

}

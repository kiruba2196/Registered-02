import java.util.Scanner;

public class prg41 {	
		public static void main(String[] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Dag");
			int sum=0;
			String str=s.nextLine();
			char d=(char)(92);
			str=str.replace(d, ',');
			String[] b=str.split(','+"");
			for(int i=0;i<b.length;i++){
			int max=0;
			String[] a=b[i].split(" ");
			for(int j=0;j<a.length;j++)
			{	
				if(!(a[j].equals("/")||a[j].equals("")))
					{
					int v=Integer.parseInt(a[j]);
					if(v>max)
						max=v;
					}
			}
			sum+=max;
			}
			System.out.println(sum);
		}

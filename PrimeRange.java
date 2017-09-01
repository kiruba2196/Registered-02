import java.util.Scanner;
    public class PrimeRange
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	int count=0,count2=0;;
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	for(int j=n;j<=m;j++)
        	{
        		count=0;
        	for(int i=1;i<19;i++)
        	{
        		if(j%i==0)
        			count++;
        	}
        	if(count<=2)
        		count2++;
        	}
        		System.out.println(count2);
        		
        }
    }

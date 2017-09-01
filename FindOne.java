import java.util.*;
public class FindOne 
{
	public static void main(String arg[])
    {
        int count;
		Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String[] arr=st.split(" ");
        for(int i=0;i<arr.length;i++)
        {
        	count=0;
        	for(int j=0;j<arr.length;j++)
        	{
        	if(arr[i].equals(arr[j]) && i!=j)
        	{
        		count++;
        	}
        	}
        	if(count==0)
        		System.out.println(arr[i]);
}}}

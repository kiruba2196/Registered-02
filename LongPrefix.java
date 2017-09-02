import java.util.Scanner;

public class LongPrefix {

	public static void main(String[] args) 
	{
			int i,j;String a;
			Scanner sc=new Scanner(System.in);
			String st=sc.nextLine();
			String[] inp=st.split(" ");
		    String pre = " ";
		    if(inp.length>0){
		        pre = inp[0];
		    }
		    for(i=1; i<inp.length; i++)
		    {
		        a = inp[i];
		        for(j=0;j< Math.min(pre.length(),inp[i].length()); j++)
		        {
		            if(pre.charAt(j) != a.charAt(j))
		            {
		            	break;
		            }
		        }
		        pre = inp[i].substring(0, j);
		    }  
		    System.out.println(pre);
		}
	}


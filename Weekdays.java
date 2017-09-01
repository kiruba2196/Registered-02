import java.util.Scanner;
    public class Weekdays
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	String st=sc.next();
       		if(st.equalsIgnoreCase("Sunday"))
        		System.out.println("False");
       		else if(st.equalsIgnoreCase("Monday") || st.equalsIgnoreCase("Tuesday") || st.equalsIgnoreCase("Wednesday") || st.equalsIgnoreCase("Thursday") || st.equalsIgnoreCase("Friday") || st.equalsIgnoreCase("Saturday"))
       			System.out.println("True");
        }
    }

import java.util.Scanner;
    public class ReverseRemove
    {
        public static void main(String args[])
        {
        	Scanner sc=new Scanner(System.in);
        	String st=sc.next().replace("a","").replace("e","").replace("i","").replace("o","").replace("u","").replace("A","").replace("E","").replace("O","").replace("U","").replace("I","");
       		StringBuffer sb=new StringBuffer(st);
       		System.out.println(sb.reverse());
        }
    }

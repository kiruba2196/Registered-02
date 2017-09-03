import java.util.Scanner;
public class prg53 {
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
String input=sc.nextLine();
int flag=0;
if(input.length()<26)
{
	System.out.println("Not pangram");
}
else
{
	for(char ch='A';ch<'Z';ch++)
 {
	if(input.toUpperCase().contains(String.valueOf(ch)))
	{
		flag=1;
	}
}
if(flag==1)
{
	System.out.println("Pangram");
}
else
{
	System.out.println("Not pangram");
}
}
}
}

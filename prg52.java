import java.io.*;
import java.util.*;
class prg52
{
	public static void main(String args[])
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int x3;
		int y3;
		int x4;
		int y4;
		Scanner scr=new Scanner(System.in);
		x1=scr.nextInt();
		y1=scr.nextInt();
		x2=scr.nextInt();
		y2=scr.nextInt();
		x3=scr.nextInt();
		y3=scr.nextInt();
		x4=scr.nextInt();
		y4=scr.nextInt();
		if((x1==x2)&&(y2==y3)&&(x3==x4)&&(y4==y1))
		{
			System.out.println("Square");
		}
		else
		{
			System.out.println("Not a square");
		}
	}
}

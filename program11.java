import java.util.Scanner;
public class program11 {
public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int ch=s.nextInt();
			int uni=1;
			for(int i=0;i<2*ch;i++)
			{
				int pa=2*ch-i;
				if(ch!=pa)
				{
					System.out.println(uni++);
				}
				}
			}
	}


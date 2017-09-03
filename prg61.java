import java.util.*;
class prg61
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next(),s="";
        for(int i=0;i<s1.length();i++)
            System.out.print((Character.isLowerCase(s1.charAt(i)))?(((int)(s1.charAt(i)))+10>122)?(char)(((((int)(s1.charAt(i)))+10)-122)+96):(char)(((int)(s1.charAt(i)))+10):(((int)(s1.charAt(i)))+10>90)?(char)(((((int)(s1.charAt(i)))+10)-90)+64):(char)(((int)(s1.charAt(i)))+10));
        System.out.print(" ");
        String sb=s2.substring(1,s2.length()-1);
        for(int i=0;i<sb.length();i++)
        {
            int n=((int)(sb.charAt(i)));
            s=s+Character.valueOf((Character.isLowerCase(sb.charAt(i)))?(((int)(sb.charAt(i)))+10>122)?(char)(((((int)(sb.charAt(i)))+10)-122)+96):(char)(((int)(sb.charAt(i)))+10):(((int)(sb.charAt(i)))+10>90)?(char)(((((int)(sb.charAt(i)))+10)-90)+64):(char)(((int)(sb.charAt(i)))+10));
        }
        System.out.print(s2.charAt(0)+s+s2.charAt(s2.length()-1));
    }
}

import java.util.*;
public class check
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String a1=s.nextLine();
String a2="good";
String a3="not";
String a4="poor";
int d,f;
d=(a1.indexOf(a3));
f=(a1.indexOf(a4));
if(d<f)
{
if((d!=-1)&&(f!=-1))
{
	a1=a1.replace(a1.substring(d,f+4),a2);
	System.out.println(a1+"");
}
else
{
	System.out.println("invalid");
}
}
else
{
	System.out.println("invalid");
}
}
}
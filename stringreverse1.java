import java.io.*;
import java.util.*;
class stringreverse1
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
StringBuffer str=new StringBuffer(s);
StringBuffer st=str.reverse();
System.out.println(st);
}
}

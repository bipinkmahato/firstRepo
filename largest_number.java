
import java.util.*;
import java.lang.*;
import java.io.*;


class LargestNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
int n1= sc.nextInt();
int n2= sc.nextInt();
int n3= sc.nextInt();
int temp=0;
if(n1>n2){
temp=n1;
} else {
temp=n2;
}
if(temp>n3){
System.out.println(temp);
}else {
System.out.println(n3);
}
	}
}

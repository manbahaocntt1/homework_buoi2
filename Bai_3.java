package myfirstjavaproject;
import java.util.Scanner;

public class Bai_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.print(" Nhap vao so n: ");
		int n;
		n=sc.nextInt();
		int tong=0;
		for(int i=1; i<=n; i++)
		{
		if(n%i==0)
		{
			tong+=i;
		}
		}
		System.out.println(" Tong cac uoc cua "+n+" la "+tong);
	}

}

package myfirstjavaproject;
import java.util.Scanner;

public class bai_2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
			float a,b,c;
			System.out.println(" Nhap 3 canh bat ky: ");
			a=sc.nextFloat();
			b=sc.nextFloat();
			c=sc.nextFloat();
			if(a+b<=c||a+c<=b||b+c<=a)
			{
				System.out.println(" Khong ph la tam giac ");
				
			}
			else if(a==b&&a==c)
			{
				System.out.println(" day la tam giac deu ");
			}
			else if(a==b||a==c||b==c)
			{
				if(b*b==a*a+c*c||a*a==b*b+c*c||c*c==a*a+b*b)
				System.out.println(" day la tam giac vuong can ");
				else
				System.out.println(" day la tam giac can ");
			}
			else if(b*b==a*a+c*c||a*a==b*b+c*c||c*c==a*a+b*b)
			{
				System.out.println(" day la tam giac vuong ");
			}
			else
			{
				System.out.println(" day la tam giac thuong ");
			}
			

	}

}

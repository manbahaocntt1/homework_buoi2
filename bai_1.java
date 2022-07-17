package myfirstjavaproject;

import java.util.Scanner;

public class bai_1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println(" Nhap vao ngay sinh: ");
		int d,m,y;
		d=sc.nextInt();
		System.out.println(" Nhap vao thang sinh: ");
		m=sc.nextInt();
		System.out.println(" Nhap vao nam sinh: ");
		y=sc.nextInt();
		
		switch(m)
		{
		case 1:
			if(d>0&&d<20)
			{
				System.out.println(" Cung ma ket ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung bao binh ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 3:
			if(d>0&&d<21)
			{
				System.out.println(" Cung song ngu ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung bach duong ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 4:
			if(d>0&&d<21)
			{
				System.out.println(" Cung bach duong ");
			}
			else if(d<=30)
			{
				System.out.println(" Cung kim nguu ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 5:
			if(d>0&&d<21)
			{
				System.out.println(" Cung kim nguu ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung song tu ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 6:
			if(d>0&&d<22)
			{
				System.out.println(" Cung song tu ");
			}
			else if(d<=30)
			{
				System.out.println(" Cung cu giai ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 7:
			if(d>0&&d<23)
			{
				System.out.println(" Cung cu giai ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung su tu ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 8:
			if(d>0&&d<23)
			{
				System.out.println(" Cung su tu ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung xu nu ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		
		case 9:
			if(d>0&&d<23)
			{
				System.out.println(" Cung xu nu ");
			}
			else if(d<=30)
			{
				System.out.println(" Cung thien binh ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 10:
			if(d>0&&d<24)
			{
				System.out.println(" Cung thien binh ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung bo cap ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 11:
			if(d>0&&d<23)
			{
				System.out.println(" Cung bo cap ");
			}
			else if(d<=30)
			{
				System.out.println(" Cung nhan ma ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		case 12:
			if(d>0&&d<22)
			{
				System.out.println(" Cung nhan ma ");
			}
			else if(d<=31)
			{
				System.out.println(" Cung ma ket ");
			}
			else System.out.println(" Ngay sinh khong hop le ");
			break;
		
		case 2:
			
			if(d>0&&d<19)
			{
				System.out.println(" Cung bao binh ");
			}
			else if(y%4==0&&y%100!=0||y%400==0)
			{
				if(d<=29)
				System.out.println(" Cung song ngu ");
				else System.out.println(" Ngay sinh khong hop le ");
				
			}
			else 
				{
				if(d<=28)
				System.out.println(" Cung song ngu ");
				else
				System.out.println(" Ngay sinh khong hop le ");
				}
			break;
		default:
			
			 System.out.println(" Ngay sinh khong hop le ");
		
		
		
		}
		
		

	}

}

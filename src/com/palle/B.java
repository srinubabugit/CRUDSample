package com.palle;

import java.util.Scanner;

public class B {

	public static void main(String[] args)
	{
		A a = new A ();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("press 1 for creating table");
		System.out.println("press 2 for inserting values");
		System.out.println("press 3 for updating values");
		System.out.println("press 4 for deleting values from table");
		System.out.println("press 5 for exit");
		
		int n =sc.nextInt();
		
		switch(n)
		{
		case 1:
		{
			a.creating();
			break;
		}
		
		case 2:
		{
		
			System.out.println("enter values of inserting into table");
			
			System.out.println("enter eno");
			int no = sc.nextInt();
			
			System.out.println("enter name");
			String name = sc.next();
			
			System.out.println("enter salary");
			int sal = sc.nextInt();
			
			a.inserting(no, name, sal);
			break;
			
		}
		
		case 3:
		{
			System.out.println("enter values for updating");
			
			System.out.println("enter name");
			String name = sc.next();
			
			System.out.println("e salary");
			int sal= sc.nextInt();
			
			a.updating(n, name, sal);
			
			break;
		
		}
		
		case 4:
		{
			System.out.println("enter eno for deleting opereation");
			
			int no = sc.nextInt();
			
			a.deleting(no);
			break;
			
		}
		
		case 5:
		{
		a.exit();
		break;
		  
			
			
		}
		
		default:
			throw new IllegalArgumentException("Unexcepted value: "+n);
		
		}
			
		

	}

}

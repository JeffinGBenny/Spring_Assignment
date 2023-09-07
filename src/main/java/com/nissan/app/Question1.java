package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.Vehicle;

public class Question1 {

	public static void main(String[] args) {
		char choice;
		int op;
		Scanner sc=new Scanner(System.in);
		ClassPathXmlApplicationContext iocContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		do {
			System.out.println("Enter 1.Honda 2.Tata");
			op=sc.nextInt();
			if(op==1) {
				Vehicle h=iocContext.getBean("honda",Vehicle.class);
				System.out.println(h.getVehicleName());
				System.out.println(h.getBrandName());
			}
			else {
				Vehicle t=iocContext.getBean("tata",Vehicle.class);
				System.out.println(t.getVehicleName());
				System.out.println(t.getBrandName());
			}
			System.out.println("Do you want to continue?");
			choice=sc.next().charAt(0);
		}while(choice=='y'||choice=='Y');

	}

}

package com.nissan.app;

import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.model.Book;
import com.nissan.model.Library;
import com.nissan.service.Vehicle;

public class Question2 {
	public static void main(String[] args) {
		char choice;
		int ch;
		int op;
		ArrayList<Library> al=new ArrayList<Library>();
		Scanner sc=new Scanner(System.in);
		ClassPathXmlApplicationContext iocContext = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		
		do{
			System.out.println("Library App");
			System.out.println("Enter your choice");
			System.out.println("1. Add book");
			System.out.println("2. Get book details");
			System.out.println("3. List book details");
			
			
			ch=sc.nextInt();
			switch(ch){
			case 1:Book b=iocContext.getBean("library",Book.class);
			       Library lib = iocContext.getBean("lib", Library.class);
				b.addBook(al,lib);
				break;
			case 2:Book c=iocContext.getBean("library",Book.class);
				c.getDetails(al);
			break;
			case 3:Book d=iocContext.getBean("library",Book.class);
				d.listBooks(al);
			break;
			
			default:System.out.println("Wrong option");
			}
			System.out.println("Do you want to continue ?");
			choice=sc.next().charAt(0);
			}while(choice=='y'||choice=='Y');

	}
}

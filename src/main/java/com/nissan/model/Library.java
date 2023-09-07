package com.nissan.model;

import java.util.ArrayList;

import java.util.Scanner;

import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.nissan.service.Vehicle;

@Component("lib")
@Scope("prototype")
public class Library implements Book {
	
	String title;
	String author;
	String ISBN;
	Scanner sc=new Scanner(System.in);
	public void addBook(ArrayList<Library> al,Library lib) {
		
		
		//ClassPathXmlApplicationContext iocContext = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		
		
		
		System.out.println("Enter book title");
		lib.title=sc.next();
		System.out.println("Enter author name");
		lib.author=sc.next();
		System.out.println("Enter ISBN number");
		lib.ISBN=sc.next();
		
	    
		
		al.add(lib);
		System.out.println("book added successfully");

	}

	public void getDetails(ArrayList<Library> al) {
		System.out.println("Enter book title");
		
		String title=sc.next();
		for(int i=0;i<al.size();i++){
		Library l=al.get(i);
		
		if(l.title.equals(title)){
			System.out.println("Book title: "+l.title);
			System.out.println("Book author: "+l.author);
			System.out.println("Book ISBN: "+l.ISBN);
			
		}
		}

	}

	public void listBooks(ArrayList<Library> al) {
		for(int i=0;i<al.size();i++){
			 Library l=al.get(i);
		
			System.out.println("Book title: "+l.title);
			System.out.println("Book author: "+l.author);
			System.out.println("Book ISBN: "+l.ISBN);
			
			
			
		}
	}

}

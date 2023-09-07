package com.nissan.model;

import java.util.ArrayList;

public interface Book {
	
	void addBook(ArrayList<Library> al,Library lib);
	void getDetails(ArrayList<Library> al);
	void listBooks(ArrayList<Library> al);
}

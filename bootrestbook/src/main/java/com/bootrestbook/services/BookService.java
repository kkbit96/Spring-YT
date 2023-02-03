package com.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.bootrestbook.entities.Book;
@Component
public class BookService {
	private static List<Book> list=new ArrayList<>();
	static {
		list.add(new Book(12, "Java", "Kishan"));
		list.add(new Book(23, "Python","Kishan"));
		list.add(new Book(34, "Go", "Kishan"));
	}
	//get all books
	public List<Book> getAllBooks(){
		return list;
	}
	//Get single book by id
	public Book getBookById(int id) {
		Book book=null;
		book=list.stream().filter(e->e.getId()==id).findFirst().get();
		return book;
	}
	//Adding the book
	public Book addBook(Book b) {
		list.add(b);
		return b;
	}
	//Delete book
	public void deleteBook(int bid) {
		list=list.stream().filter(book->{
			if(book.getId()!=bid) {
				return true;
			}else {
				return false;
			}
		}).collect(Collectors.toList());
	}
	//Update Book
	public void updateBook(Book book, int bookId) {
		list.stream().map(b->{
			if(b.getId()==bookId) {
				b.setTitle(book.getTitle());
				b.setAuthor(book.getAuthor());
			}
			return b;
		}).collect(Collectors.toList());
	}
}

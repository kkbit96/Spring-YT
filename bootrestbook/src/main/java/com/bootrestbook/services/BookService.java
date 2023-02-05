package com.bootrestbook.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.bootrestbook.dao.BookRepository;
import com.bootrestbook.entities.Book;
@Component
public class BookService {
	private BookRepository bookRepository;
	/*
	 * private static List<Book> list=new ArrayList<>(); 
	 * static { list.add(new Book(12, "Java", "Kishan")); 
	 * list.add(new Book(23, "Python","Kishan"));
	 * list.add(new Book(34, "Go", "Kishan")); }
	 */
	//get all books
	public List<Book> getAllBooks(){
		List<Book> list=(List<Book>)this.bookRepository.findAll();
		return list;
	}
	//Get single book by id
	public Book getBookById(int id) {
		Book book=null;
		try {
			book=this.bookRepository.findById(id);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return book;
	}
	//Adding the book
	public Book addBook(Book b) {
		Book result=this.bookRepository.save(b);
		return result;
	}
	//Delete book
	public void deleteBook(int bid) {
		bookRepository.deleteById(bid);
		/*
		 * list=list.stream().filter(book->{ 
		 * if(book.getId()!=bid) { 
		 * return true; 
		 * }else{ 
		 * return false; 
		 * } }).collect(Collectors.toList());
		 */
	}
	//Update Book
	public void updateBook(Book book, int bookId) {
		book.setId(bookId);
		bookRepository.save(book);
//		list.stream().map(b->{
//			if(b.getId()==bookId) {
//				b.setTitle(book.getTitle());
//				b.setAuthor(book.getAuthor());
//			}
//			return b;
//		}).collect(Collectors.toList());
	}
}

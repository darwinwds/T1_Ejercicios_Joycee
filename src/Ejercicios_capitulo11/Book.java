/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios_capitulo11;


/**
 *
 * @author Darwin W. Diaz Simon
 */
public abstract class Book {
    
    private String bookName;
	private Double bookPrice;
	
	public Book( String name ) {
		bookName = name;
	}
	
	
	public String getBookName() {
		return bookName;
	}
	public Double getBookPrice() {
		return bookPrice;
	}
	
	
	
	
	public abstract Double setPrice();
	
}

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
public class NonFiction extends Book{
    public NonFiction(String name) {
		super(name);
		
	}
	
	@Override
	public String toString() {
		
		return " \n Nombre del Libro : \t " + getBookName() + " \n " +
		"Costo del Libro : \t $ " + setPrice() ;
	}
	
	
	public Double setPrice() {
		
		return 37.99;
	}
	
	
	
	
}

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
public class Triangle extends GeometricFigure{
    	public Triangle(Double alto, Double ancho, Figure t ) {
		super(alto, ancho, t);
	}

	
	
	public Double calculateArea() {
		
		return ( ( getWeight() * getHeight() ) / 2 );
		
	}
}

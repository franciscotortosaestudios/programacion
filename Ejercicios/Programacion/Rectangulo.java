/*
 * Rectangulo.java
 * 
 * Copyright 2014 mañana <mañana@USUARIO-PC>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Rectangulo {
	
	//atributo
	private int alto=3;
	
	private int ancho=4;
	
	//metodo
	public int getAlto(){
	return this.alto;
}
	public int getAncho(){
	return this.ancho;
}
	public int getArea(){
	return this.alto*this.ancho;
}
	public void setAlto(int Alt){ 
	this.alto=Alt;
}
	public void setAncho(int Anch){
		this.ancho=Anch; 
	
	
}
}
class TestRectangulo{
public static void main (String[] arg) {
		Rectangulo r1= new Rectangulo ();
		System.out.println ("Valor ancho: "+r1.getAncho()+"Valor alto:"+r1.getAlto());
	}
}

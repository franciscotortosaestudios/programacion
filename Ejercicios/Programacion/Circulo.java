public class Circulo {
	
	//atributos
	/*cualquier Circulo que creemos tendrá
	 * siempre un valor INICIAL de 5 */
	
	//atributos
	private int radio=5;
	
	//metodos
	public int getradio(){
		//this es opcional ponerlo
		return this.radio;
	}
	//metodo que cambia el valor del radio
	public void setRadio(int r){
		this.radio=r;
	}
}
class TestCirculo{
	public static void main(String[] arg){
		//Crea un objeto de tipo circulo
		int i=2;
		//creamos un objeto de tipo circulo
		Circulo c1 = new Circulo();//crea un circulo de radio 5
		System.out.println("Radio del circulo2: "+ c1.getradio());
		Circulo c2 = new Circulo();//crea un circulo de radio 5
		//cambio el radio del Circulo c2 a un valor de 15
		c2.setRadio(15);
		System.out.println("Radio del circulo2: "+ c2.getradio());
}
}

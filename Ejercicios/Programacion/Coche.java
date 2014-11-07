

public class Coche {
	
	//atributos
		private double combustible=50;
		private double consumo=100;
		
	//getter
	
	public double getCombustible (){
		return this.combustible;
	}
	public double getConsumo (){
		return this.consumo;
	}
	//get para el Consumo a los 100
	public double getCuenta (){
		return this.combustible*100/this.consumo;
	}
	
	//setter
	
	public void setCombustible (double combustible){
		this.combustible=combustible;
	}
	public void setConsumo (double consumo){
		this.consumo=consumo;
	}
}	
class TestCoche	{
	public static void main (String args[]) {
		Coche c1=new Coche();
		Coche c2=new Coche();
		System.out.println (c1.getCombustible()+""); //Saber el combustible en el deposito
		c2.setCombustible(7);
		System.out.println (c2.getCuenta());     //actualizar el combustible
	}
}


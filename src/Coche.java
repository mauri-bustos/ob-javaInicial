
public class Coche {
	
	public Coche(String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	String marca;
	String modelo;
	int anio;
	String color;
	
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", modelo=" + modelo + ", anio=" + anio + ", color=" + color + "]";
	}
	
	
	
	

}

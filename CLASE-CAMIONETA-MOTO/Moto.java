
public class Moto {
	
	private String marca;
	private int modelo;
	private int pesoMax;
	
	//Constructor
	public Moto(String marca, int modelo, int pesoMax) {
		this.marca = marca;
		this.modelo = modelo;
		this.pesoMax = pesoMax;
	}
	
	
	//Marca
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Modelo
	public int getModelo() {
		return modelo;
	}
	
	public void setModelo(int modelo) {
		this.modelo = modelo;
	}
	
	//PesoMax
	public int getPesoMax() {
		return pesoMax;
	}
	
	public void setMarca(int pesoMax) {
		this.pesoMax = pesoMax;
	}
	
	//Salida
	public void MotoCarac() {
		System.out.println("Moto, es el modelo: " + modelo + ", de la marca: " + marca + ", con una capacidad maxima de: " + pesoMax + "kg.");
	}
	
	
}

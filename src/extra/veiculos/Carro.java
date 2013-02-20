package extra.veiculos;

import java.util.ArrayList;

public class Carro {
	
	private String modelo;
	private String cor;
	
	public Carro(){
		
	}
	
	public Carro(String nome, String cor){
		this.modelo = nome;
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro("fusca","verde");
		Carro carro2 = new Carro("chevette","dourado");
		Carro carro3 = new Carro("camaro","amarelo");
		
		ArrayList<Carro> carros = new ArrayList<Carro>();
		carros.add(carro1);
		carros.add(carro2);
		carros.add(carro3);
		
		Carro carroN = new Carro();
		//carroN = (Carro) carros.get(1);
		carroN = (Carro) carros.get(1);
		System.out.println(carroN.getModelo());
	}
}

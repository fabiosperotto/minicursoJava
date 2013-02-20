package commom.radio;

import java.util.ArrayList;

public class RadioAMFM implements Radio {
	
	private int ligado;
	
	public int volumeAtual = 50; //0 a 100
	private double frequenciaAtual = 99.0;
	
	//arrays/matrizes:
	//public double[] faixasFrequencia = new double[3];
	//ou
	public double faixasFrequencia[] = {98.2,99.0,100.1,101.5};
	
	//ArrayList
	//ArrayList faixasFrequencia = new ArrayList();
	
	public RadioAMFM(){

	}
	
	public double getFrequencia(){
		return this.frequenciaAtual;
	}
	
	/**
	 * Introdução ao método
	 * @param ligar
	 */
	public RadioAMFM(int ligar){
		this.ligado(ligar);		
		
	}
	
	/**
	 * Método para verificar se rádio está ligado.
	 * @param valorLigado valor para definir estado de ligado/desligado
	 */
	public void ligado(int valorLigado){
		this.ligado = valorLigado;
		System.out.println("Estou ligado");
	}
	
	/**
	 * Método para desligar o rádio.
	 */
	public void desligado(){
		this.ligado = 0;
		System.out.println("Desligado");
		
	}
	
	public void aumentarVolume(){
		if(this.volumeAtual <= 90){
			this.volumeAtual += 10;
		}else{
			this.volumeAtual = 100;
		}
		System.out.println("Volume em "+this.volumeAtual);	
		
	}
	
	public void aumentarVolume(int vol){
		if(this.volumeAtual <= 90){
			this.volumeAtual += vol;
		}else{
			this.volumeAtual = 100;
		}
		System.out.println("Volume em "+this.volumeAtual);
	}
	
	public void diminuirVolume(){
		
		if(this.volumeAtual >= 10){
			this.volumeAtual -= 10;
		}else{
			this.volumeAtual = 0;
			System.out.println("Mudo!");
			
		}
	}
	
	public void alterarFrequencia(){		
		
	}
	
}
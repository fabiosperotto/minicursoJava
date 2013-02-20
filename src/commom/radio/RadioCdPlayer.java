package commom.radio;

import java.util.ArrayList;
import java.util.List;

public class RadioCdPlayer extends RadioAMFM implements CDPlayer {
	
	private int cdInserido = 0;
	public int faixasCD[] = { 1,2,3,4,5 };
	public int faixaAtual = 1;
	
	public RadioCdPlayer(){
		super();
	}
	
	public RadioCdPlayer(int ligar){
		super(ligar);
	}
	
	
	public void inserirCD(){
		this.cdInserido = 1;
		//double quantFaixas = Math.random();
		System.out.println("Cd Player Ligado");
	}
	
	public void desligarCD(){
		this.cdInserido = 0;
		System.out.println("Sem CD");
		
	}
	public int faixaAtual(){
		//System.out.println("Faixa "+this.faixaAtual);
		return this.faixaAtual;
		
		
	}
	public void alterarFaixa(){
		
		//cd jah foi inserido?	
		/*
		for(int i = 0; i <= faixasCD.length; i++){
			
			if(this.faixasCD[i] == this.faixaAtual){
				
				if(this.faixaAtual == this.faixasCD[i]){
					this.faixaAtual = 1;
					System.out.println("Indo para... "+this.faixaAtual);
					break;
				}else{
					this.faixaAtual = this.faixasCD[i+1];
					System.out.println("Indo para... "+this.faixaAtual);
					break;
				}												
			}
		}
		*/
		try{
			
			for(int i = 0; i <= faixasCD.length; i++){
				
				if(this.faixaAtual == this.faixasCD[i]){
					this.faixaAtual = this.faixasCD[i+1];
					System.out.println("Indo para... "+this.faixaAtual);
					break;
				}				
			}
		}catch(Exception erro){
			erro.printStackTrace();
			//System.out.println("Não é possivel avançar mais");
			
		}
	}

}

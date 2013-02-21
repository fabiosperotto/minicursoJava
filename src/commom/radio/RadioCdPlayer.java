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
		System.out.println("Cd Player Ligado");
	}
	
	public void desligarCD(){
		this.cdInserido = 0;
		this.faixaAtual = 0;
		System.out.println("Sem CD");
		
		
	}
	public int faixaAtual(){
		//System.out.println("Faixa "+this.faixaAtual);
		return this.faixaAtual;
		
		
	}
	
	public String nomeMusica(){
		String musica;
		musica = "Musica - "+this.faixaAtual;
		return musica;
	}
	
	public void alterarFaixa(){
		
		//cd jah foi inserido?
		if(this.cdInserido != 0){
			try{
				
				for(int i=0; i<= this.faixasCD.length; i++){
					
					if(this.faixaAtual == this.faixasCD[i]){
						this.faixaAtual = this.faixasCD[i+1];
						break;
					}
					
				}
				
			}catch(Exception erro){
				//erro.printStackTrace();
				this.faixaAtual = this.faixasCD[0];
				
			}

		}else{
			System.out.println("Insira CD");
		}
	}
}

package commom.radio;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		RadioAMFM radio1 = new RadioAMFM();
		radio1.ligado(1);
		radio1.alterarFrequencia();
		radio1.alterarFrequencia();
		radio1.alterarFrequencia();
		System.out.println("Freq: "+radio1.getFrequencia());
		
		
		
		
		System.out.println("CD PLAYER:");
		RadioCdPlayer cd = new RadioCdPlayer();
		cd.ligado(1);
		cd.inserirCD();
		cd.aumentarVolume();
		cd.alterarFaixa();
		cd.diminuirVolume();
		//cd.display(cd.nomeMusica());
		
		cd.desligarCD();
		cd.alterarFaixa();
		System.out.println("Faixa - "+cd.faixaAtual());
		
		System.out.println("WALKIE-TALK");
		WalkieTalk wk = new WalkieTalk();
		wk.ligado(1);
		wk.push();
		wk.push();
		
		

	}
}
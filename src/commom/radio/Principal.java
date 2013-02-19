package commom.radio;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/* 
		RadioAMFM radio1 = new RadioAMFM();
		radio1.ligado(1);
		radio1.desligado();
		*/
		
		RadioCdPlayer cd = new RadioCdPlayer();
		cd.ligado(1);
		cd.aumentarVolume();
		cd.alterarFaixa();
		cd.diminuirVolume();
		

	}
}
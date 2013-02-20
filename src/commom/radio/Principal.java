package commom.radio;

public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 
		RadioAMFM radio1 = new RadioAMFM();
		radio1.ligado(1);
		
		RadioCdPlayer cd = new RadioCdPlayer();
		cd.ligado(1);
		cd.aumentarVolume();
		cd.alterarFaixa();
		cd.diminuirVolume();

		System.out.println("Freq.: "+radio1.getFrequencia());
		radio1.alterarFrequencia(); //100.1
		radio1.alterarFrequencia(); //101.5
		radio1.alterarFrequencia(); //error
		System.out.println("Freq.: "+radio1.getFrequencia());
		

		

	}
}
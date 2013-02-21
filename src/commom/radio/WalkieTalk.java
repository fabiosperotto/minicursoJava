package commom.radio;

public class WalkieTalk extends RadioAMFM{
	
	private boolean canalLivre = true;
	
	public WalkieTalk(){
		super();
	}

	public boolean isCanalLivre() {
		return canalLivre;
	}

	public void setCanalLivre(boolean canalLivre) {
		this.canalLivre = canalLivre;
	}
	
	
	public void push(){
		
		if(this.canalLivre == true){
			this.canalLivre = false;
			System.out.println("Canal em comunicação");
		}else{
			this.canalLivre = true;
			System.out.println("Ouvindo...");
		}
		
	}
	
	

}

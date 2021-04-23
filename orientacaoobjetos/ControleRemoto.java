package orientacaoobjetos;

public class ControleRemoto implements Controlador {
	private int volume;
	private boolean ligado;
	private boolean tocando;
		public ControleRemoto () {
			this.volume = 50;
			this.ligado = false;
			this.tocando = false;
		}
		public int getVolume () {
			return this.volume;
		}
		public void setVolume (int v) {
			this.volume = v;
		}
		public boolean getLigado () {
			return this.ligado;
		}
		public void setLigado (boolean l) {
			this.ligado = l;
		}
		public boolean getTocando () {
			return this.tocando;
		}
		public void setTocando (boolean t ) {
			this.tocando = t;
		}
	
		public void ligar() {
			this.setLigado (true);
			
		}
	
		public void desligar() {
			this.setLigado (false);
			
		}
		
		public void abrirMenu() {
			System.out.println("Est� ligado ? " + this.getLigado ());
			System.out.println("Est� tocando ? " + this.getTocando ());
			System.out.print("Volume: " + this.getVolume ());
			for (int i = 0; i <= this.getVolume (); i += 10) {
				System.out.print ("|");
			}
		}
		
		public void fecharMenu() {
			System.out.println("Fechando menu ... ");
			
		}
		
		public void maisVolume() {
			if (this.getLigado ()) {
				this.setVolume (getVolume () + 1); 
			}
			
		}
		
		public void menosVolume() {
			if (this.getLigado ()) {
				this.setVolume (getVolume () - 1);
			}
			
		}
		
		public void ligarMudo() {
			if (this.getLigado() && this.getVolume() > 0) {
				this.setVolume(0);
			}
			
		}
		
		public void desligarMudo() {
			if (this.getLigado() && this.getVolume() == 0) {
				this.setVolume(50);
			}
			
		}
		
		public void play() {
			if (this.getLigado() && !(this.getTocando())) {
				this.setTocando(true);
			
		}
		
		public void pause() {
			if (this.getLigado() && this.getTocando()) {
				this.setTocando(false);
			}
			
		}
}

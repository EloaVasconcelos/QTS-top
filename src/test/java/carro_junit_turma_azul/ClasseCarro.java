package carro_junit_turma_azul;

public class ClasseCarro {
	 

    public class Carro {
	public String marca;
	public String modelo;
	public int veloatual;
	public double velomax;
	public boolean ligado;
	public boolean desligado;

	public void ligar() {
		this.ligado = true;
	}

	public void desligar() {
		this.desligado = false;
	}



	public boolean acelerar (int aceleracao) {
		if (ligado == true) {
			if ((veloatual + aceleracao) <= velomax) { 
				this.veloatual += aceleracao; 
				return true;

			} else {
				return false; 
			}
					
		}
		
	
		
		return false;
		
	}

	 public boolean frear(int frear) {
		    if ((veloatual - frear) > 0 ) {
		        this.veloatual -= frear; 
		            return true;
			    
		        } 
		    else {
		            this.veloatual = 0;    
		            return false;
		        }
		    }
}







}

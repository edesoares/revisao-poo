package exercicio4;

public class Televisao {

	private Integer volume;
	private Boolean ligado;
    private Integer canalAtual;

    public Televisao(){
        this.ligado = false;
        this.canalAtual = 1;
        this.volume = 15;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public Integer getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(Integer canalAtual) {
        this.canalAtual = canalAtual;
    }

    public void ligaDesliga() {
		if (getLigado() == false) {
			System.out.println("\nLigou a TV");
			setLigado(true);
		} else {
			System.out.println("\nDesligou a TV");
			setLigado(false);
		}
	}
	
	public void aumentarVolume () {
		int maximo = 30;
		if (getVolume() < maximo) {
			setVolume(getVolume() + 1);
			System.out.println("\nVolume: "+getVolume());
		}
	}
	public void diminuirVolume () {
		int minimo = 0;
		if (getVolume() > minimo) {
			setVolume(getVolume() - 1);
			System.out.println("\nVolume: "+ getVolume());
		}
	}

    public void mudarCanal (Integer canal) {
		int maximo = 200;
		if (canal <= 0 && canal > maximo) {
			System.out.println("\nCanal inválido");
		} else {
            setCanalAtual(canal);
            System.out.println("\nCanal: " + getCanalAtual());
        }
	}

    public void aumentarCanal() {
		int maximo = 200;
		if (getCanalAtual() == maximo) {
			setCanalAtual(1);
		} else {
            setCanalAtual(getCanalAtual() + 1);
        }
        System.out.println("\nCanal: "+ getCanalAtual());
	}

	public void diminuirCanal () {
		if (getCanalAtual() == 1) {
			setCanalAtual(200);
		} else {
            setCanalAtual(getCanalAtual() - 1);
        }
        System.out.println("\nCanal: "+ getCanalAtual());
	}

    public void status(){
        String estado = getLigado() ? "Ligada" : "Desligada";
        String status = String.format("\nStatus:\nEstado: %s\nCanal: %d\nVolume: %d", estado, getCanalAtual(), getVolume());
        System.out.println(status);
    }
}

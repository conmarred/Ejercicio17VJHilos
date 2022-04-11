package entidades;

public class Guerrero extends Personaje {

	public Integer fuerza;

	public Integer getFuerza() {
		return fuerza;
	}

	public void setFuerza(Integer fuerza) {
		this.fuerza = fuerza;
	}

	public Guerrero(String nombre, Arma arma, Integer puntosVida, Integer fuerza) {
		super(nombre, arma, puntosVida);
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Arma arma, Personaje personaje) {
		if (this.arma instanceof Espada || this.arma instanceof Arco) {
			personaje.setPuntosVida(personaje.getPuntosVida()-10);;
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

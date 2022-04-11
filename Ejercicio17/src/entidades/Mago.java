package entidades;

public class Mago extends Personaje{
	
	Integer inteligencia;


	public Mago(String nombre, Arma arma, Integer puntosVida, Integer inteligencia) {
		super(nombre, arma, puntosVida);
		this.inteligencia = inteligencia;
	}


	@Override
	public void atacar(Arma arma, Personaje personaje) {
		if (this.arma instanceof Hechizo) {
			personaje.setPuntosVida(personaje.getPuntosVida()-10);;
		}
	}
	
	
}

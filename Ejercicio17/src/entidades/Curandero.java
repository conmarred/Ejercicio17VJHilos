package entidades;

public class Curandero extends Personaje{

	public Integer sabiduria;

	public Integer getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(Integer sabiduria) {
		this.sabiduria = sabiduria;
	}

	public Curandero(String nombre, Arma arma, Integer puntosVida, Integer sabiduria) {
		super(nombre, arma, puntosVida);
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Arma arma, Personaje personaje) {
		if (this.arma instanceof Rezo) {
			personaje.setPuntosVida(personaje.getPuntosVida()-10);;
		}
		
	}
	
	
}

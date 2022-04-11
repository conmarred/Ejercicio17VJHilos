package entidades;

public class Jefe extends Personaje{
	Integer fuerzaMax;
	
	

	public Integer getFuerzaMax() {
		return fuerzaMax;
	}



	public void setFuerzaMax(Integer fuerzaMax) {
		this.fuerzaMax = fuerzaMax;
	}
	
	


	public Jefe(String nombre, Arma arma, Integer puntosVida, Integer fuerzaMax) {
		super(nombre, arma, puntosVida);
		this.fuerzaMax = fuerzaMax;
	}



	@Override
	public void atacar(Arma arma, Personaje personaje) {
		if (this.arma instanceof Espada || this.arma instanceof Arco) {
			personaje.setPuntosVida(personaje.getPuntosVida()-10);;
		}
		
	}

}

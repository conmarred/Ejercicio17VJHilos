package entidades;

public class Fortaleza {
	
	private Jefe jefe;
	
	
	public Fortaleza(Jefe jefe) {
		super();
		this.jefe = jefe;
	}
	

	public Jefe getJefe() {
		return jefe;
	}


	public void setJefe(Jefe jefe) {
		this.jefe = jefe;
	}


	public synchronized void empezarCombateJefe(Personaje personaje) {
		if(jefe.getPuntosVida()>0) {
			Combate c = new Combate();
			c.empezarCombate(personaje, jefe);
			if(jefe.getPuntosVida()<0) {
				System.out.println(personaje.getNombre() + " derrotó a el Jefe");
			}else {
				System.out.println("El Jefe ha ganado el combate");
			}
		}else {
			System.out.println("El Jefe ya fue derrotado");
			
		}
		
	}
}

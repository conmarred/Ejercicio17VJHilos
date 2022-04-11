package entidades;

public class Espada extends Arma{

	@Override
	public void usar() {
		
		System.out.println("Usando arma Espada");
		setHerir(3);
		
	}

}

package entidades;

public abstract class Arma {
	
	Integer herir;
	
	public Integer getHerir() {
		return herir;
	}

	public void setHerir(Integer herir) {
		this.herir = herir;
	}

	public abstract void usar();
	
}

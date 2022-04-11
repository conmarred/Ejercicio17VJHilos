package entidades;

public class Combate {
	
	public static void empezarCombate (Personaje p1, Personaje p2) {
		int cont = 1;
		while(p1.getPuntosVida()>0 && p2.getPuntosVida()>0) {
			
			System.out.println("Ronda número: " + cont);
			
			System.out.println(p1.getNombre()+ " ataca a " +p2.getNombre());
			
			p1.atacar(p1.getArma(), p2);
			p2.setPuntosVida(p2.getPuntosVida()-p1.getArma().getHerir());
			
			System.out.println("Puntos de vida de " + p2.getNombre() + " son: " + p2.getPuntosVida());
			
			System.out.println(p2.getNombre()+ " ataca a " +p1.getNombre());
			
			p2.atacar(p1.getArma(), p1);
			p1.setPuntosVida(p1.getPuntosVida()-p2.getArma().getHerir());

			System.out.println("Puntos de vide de  " + p1.getNombre() + " son: " + p1.getPuntosVida());
			
			cont++;
			}
		if(p1.getPuntosVida()<=0) {
			System.out.println("¡¡¡¡¡¡¡¡FIN DE LA PARTIDA!!!!!!!!");
			System.out.println("---->El ganador es: " + p2.getNombre()+"<----");
		}
		if(p2.getPuntosVida()<=0) {
			System.out.println("¡¡¡¡¡¡¡¡FIN DE LA PARTIDA!!!!!!!!");
			System.out.println("---->El ganador es: " + p1.getNombre()+"<----");
		}
		
	}
	
	public static void main(String[] args) {
		
		Espada e1 = new Espada();
		e1.setHerir(3);
		Guerrero p1 = new Guerrero("Guerrero1", e1, 100, 5);
		Guerrero p2 = new Guerrero("Guerrero2", e1, 50, 4);
		
		System.out.println("Combate entre " + p1.getNombre() + " y " + p2.getNombre());
		empezarCombate(p1, p2);
		
		System.out.println("==========================================================");
		Hechizo h1 = new Hechizo();
		h1.setHerir(8);
		Mago m1 = new Mago("Mago1", h1, 170, 15);
		Curandero c3 = new Curandero("Curandero", h1, 100, 6);
		System.out.println("Combate entre " + c3.getNombre() + " y " + m1.getNombre());
		empezarCombate(c3, m1);
		
		
	}

}

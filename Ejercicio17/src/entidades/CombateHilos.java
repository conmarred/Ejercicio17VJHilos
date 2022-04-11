package entidades;

import java.util.ArrayList;
import java.util.List;

public class CombateHilos {

	public static void main(String[] args) {
		Espada e1 = new Espada();
		e1.setHerir(3);
		Guerrero p1 = new Guerrero("Guerrero1", e1, 100, 5);
		Guerrero p2 = new Guerrero("Guerrero2", e1, 50, 4);
		Hechizo h1 = new Hechizo();
		h1.setHerir(8);
		Mago m1 = new Mago("Mago1", h1, 170, 15);
		Curandero c3 = new Curandero("Curandero", h1, 100, 6);
		
		List<Personaje> lsPersonajes = new ArrayList<>();
		lsPersonajes.add(p1);
		lsPersonajes.add(p2);
		lsPersonajes.add(m1);
		lsPersonajes.add(c3);
		
		Jefe jefe = new Jefe("Jefe", e1, 300, 40);
		
		Fortaleza fortaleza1 = new Fortaleza(jefe);
		
		for (Personaje p: lsPersonajes) {
			p.setFortaleza(fortaleza1);
			p.start();
		}

	}

}

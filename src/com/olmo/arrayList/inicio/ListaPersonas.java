package com.olmo.arrayList.inicio;

import java.util.ArrayList;

public class ListaPersonas {
	
	static ArrayList<Persona> pers = new ArrayList<Persona>();
	
	public static ArrayList<Persona> getPers() {
		return pers;
	}

	int longitud=pers.size();
	
	

	public static void addPersona(Persona p) {
		pers.add(p);
	}
	
	
	public int getLongitud() {
		return longitud;
	}
	
	public Persona getPersona(int i) {
		return pers.get(i);
	}
	
	
	
}

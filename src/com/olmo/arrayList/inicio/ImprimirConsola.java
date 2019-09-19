package com.olmo.arrayList.inicio;

public class ImprimirConsola {

	static ListaPersonas a = new ListaPersonas();
	
	public static  void Imprimir() {
		for(int i=0;i<a.getLongitud();i++) {
			System.out.println(ListaPersonas.getPers().get(i).getNombre());
			System.out.println(ListaPersonas.pers.get(i).getApellido());
			System.out.println(ListaPersonas.pers.get(i).getTlf());
			System.out.println(ListaPersonas.pers.get(i).getCiudad());
			}
	}
}

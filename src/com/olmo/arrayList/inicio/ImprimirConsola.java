package com.olmo.arrayList.inicio;

public class ImprimirConsola {

	static ListaPersonas a = new ListaPersonas();
	
	public static  void Imprimir() {
		for(int i=0;i<a.getLongitud();i++) {
			//comprobar edad de a y si edad de a menor que la edad del mas pequeño hasta el momento, colocar a en el prmer lugar y parar la edad minima a la edad de a
			
			System.out.println(ListaPersonas.getPers().get(i).getNombre());
			System.out.println(ListaPersonas.pers.get(i).getApellido());
			System.out.println(ListaPersonas.pers.get(i).getTlf());
			System.out.println(ListaPersonas.pers.get(i).getCiudad());
			}
	}
}

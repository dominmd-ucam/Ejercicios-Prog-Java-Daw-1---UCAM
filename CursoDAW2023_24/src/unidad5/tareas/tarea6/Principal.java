package unidad5.tareas.tarea6;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	public static void MENU() {
		
		System.out.println("--- PROGRAMA MUSICAL ---");
		System.out.println("1) Ver todos los grupos musicales.\n2) Crear Grupo Musical.\n3) Anadir un Musico a un Grupo.\n4) Salir del programa.");
		
	}

	public static void main(String[] args) {
		Scanner scInt= new Scanner (System.in);
		Scanner scString= new Scanner (System.in);
		
		//CREACION DE GRUPOS Y MUSICOS PARA EL PROGRAMA
		ArrayList<Musico> artistas = new ArrayList<>();
		Musico A1 = new Musico ("Pedro David", 23, "Bajo");
		Musico A2 = new Musico ("Natalia", 29, "Cantante");
		Musico A3 = new Musico ("Elias", 19, "Bateria");
		Musico A4 = new Musico ("Antonio", 30, "Cantante");
		Musico A5 = new Musico ("Roberto", 22, "Bajo");
		
		ArrayList<Musico> ArtistasG1 = new ArrayList<Musico>();
		ArtistasG1.add(A1);
		ArtistasG1.add(A2);
		ArrayList<Musico> ArtistasG2 = new ArrayList<Musico>();
		ArtistasG2.add(A3);
		ArtistasG2.add(A4);
		ArtistasG2.add(A5);
		
		ArrayList<GrupoMusical> gruposMusicales = new ArrayList<>();
		
		GrupoMusical g1 = new GrupoMusical ("Arde Bogota", ArtistasG1, "ardebogota.es", 2020);
		gruposMusicales.add(g1);
		GrupoMusical g2 = new GrupoMusical ("Viva Suecia", ArtistasG2, "vivasuecia.es", 2018 );
		gruposMusicales.add(g2);
		
		int opcion = 0;
		do {
		MENU();
		
		System.out.print("Seleccione una opcion: ");
		opcion = scInt.nextInt();
		
		switch (opcion) {
		case 1:
			
			for (GrupoMusical grupoMusical : gruposMusicales) {
				System.out.println(grupoMusical.toString());
			}
			
			break;
		case 2:
			System.out.println("Has seleccionado añadir un nuevo Grupo. Añada los siguientes datos:");
			System.out.println("Nombre del nuevo Grupo: ");
			String nombreNuevoGrupo = scString.nextLine().trim();
			
			System.out.println("Escribe su web: ");
			String webNuevoGrupo = scString.nextLine().trim();
			
			System.out.println("Cual fue el año de su creacion ? : ");
			int anyoCreacionNuevoGrupo = scInt.nextInt();
			
			GrupoMusical nuevoGrupo = new GrupoMusical (nombreNuevoGrupo, null, webNuevoGrupo, anyoCreacionNuevoGrupo);
			gruposMusicales.add(nuevoGrupo);
			break;
		case 3:
			System.out.println("Has seleccionado añadir un nuevo Musico: ");
			System.out.println("Nombre del Musico: ");
			String nombreNuevoMusico = scString.nextLine().trim();
			
			System.out.println("Edad del Musico: ");
			int edadNuevoMusico = scInt.nextInt();
			
			System.out.println("Que rol tiene (Bajo/Cantante/Bateria): ");
			String rolNuevoMusico = scString.nextLine().trim();
			
			System.out.println("A que grupo pertenece? : ");
			String nombreGrupoNuevoMusico = scString.nextLine().trim();
			
			Musico nuevoMusico = new Musico (nombreNuevoMusico, edadNuevoMusico, rolNuevoMusico );
			
			for (GrupoMusical grupoMusical : gruposMusicales) {
				if (grupoMusical.getNombreGrupo().equalsIgnoreCase(nombreGrupoNuevoMusico)) {
					
					grupoMusical.getComponentes().add(nuevoMusico);
					
					
				}
			}
			
			break;
		case 4:
			System.out.println("Fin del programa.");
			break;
		default:
			System.out.println("Seleccione una de las opciones validas.");
			break;
		}
		}while(opcion !=4);
		
		
		

	}


}

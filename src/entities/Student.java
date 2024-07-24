package entities;

import java.util.Random;

public class Student {
	// ATTRIBUTI (caratteristiche di tutti gli studenti)
	public int id;
	public String name;
	public String surname;
	public boolean isFullStack;

	// COSTRUTTORI (metodi speciali che mi servono a creare un nuovo Studente)
	// I COSTRUTTORE
	public Student() {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = "Nome di default";
		this.surname = "Cognome di default";
		this.isFullStack = true;
	}

	// II COSTRUTTORE
	public Student(String name) {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = name;
		this.surname = "Cognome di default";
		this.isFullStack = true;
	}

	// III COSTRUTTORE
	public Student(String name, String surname, boolean isFullStack) {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = name;
		this.surname = surname;
		this.isFullStack = isFullStack;
		// Quando creiamo dei costruttori è fondamentale stabilire quali attributi debbano venir valorizzati con valori
		// provenienti dall'esterno (PARAMETRI DEL COSTRUTTORE) e quali no. Ad esempio l'id non lo sceglierà l'utente
		// ma gli verrà assegnato uno generato in maniera casuale
	}


	// METODI (ovvero le azioni che un oggetto Studente potrà eseguire)
	public void sayHello() {
		System.out.println("Ciao io sono " + this.name + ", " + this.surname + ", il mio id è: " + this.id);
	}
}

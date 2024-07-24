package entities;

import enums.TipoStudente;

import java.util.Objects;
import java.util.Random;

public class Student {
	// ATTRIBUTI STATICI (attributi di classe, cioè non serve un oggetto per accedervi)
	public static int numStudentiCreati = 0;
	// ATTRIBUTI (caratteristiche di tutti gli studenti)
	public int id;
	public String name;
	public String surname;
	public boolean isFullStack;
	public TipoStudente tipoStudente;

	// COSTRUTTORI (metodi speciali che mi servono a creare un nuovo Studente)
	// I COSTRUTTORE
	public Student() {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = "Nome di default";
		this.surname = "Cognome di default";
		this.isFullStack = true;
		this.tipoStudente = TipoStudente.FULLSTACK;
		numStudentiCreati++;
	}

	// II COSTRUTTORE
	public Student(String name) {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = name;
		this.surname = "Cognome di default";
		this.isFullStack = true;
		this.tipoStudente = TipoStudente.FULLSTACK;
		numStudentiCreati++;
	}

	// III COSTRUTTORE
	public Student(String name, String surname, boolean isFullStack, TipoStudente tipoStudente) {
		Random random = new Random();
		this.id = random.nextInt(1, 1000); // numero intero casuale tra 1 e 1000
		this.name = name;
		this.surname = surname;
		this.isFullStack = isFullStack;
		this.tipoStudente = tipoStudente;
		// Quando creiamo dei costruttori è fondamentale stabilire quali attributi debbano venir valorizzati con valori
		// provenienti dall'esterno (PARAMETRI DEL COSTRUTTORE) e quali no. Ad esempio l'id non lo sceglierà l'utente
		// ma gli verrà assegnato uno generato in maniera casuale
		numStudentiCreati++;
	}

	// METODI STATICI (metodi di classe, ovvero non serve un oggetto per poterli usare)
	public static int getNumStudentiCreati() {
		return numStudentiCreati;
	}

	// METODI (ovvero le azioni che un oggetto Studente potrà eseguire)
	public void sayHello() {
		System.out.println("Ciao io sono " + this.name + ", " + this.surname + ", il mio id è: " + this.id);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return id == student.id && isFullStack == student.isFullStack && Objects.equals(name, student.name) && Objects.equals(surname, student.surname) && tipoStudente == student.tipoStudente;
	}


	@Override
	public String toString() {
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", isFullStack=" + isFullStack +
				", tipoStudente=" + tipoStudente +
				'}';
	}
}

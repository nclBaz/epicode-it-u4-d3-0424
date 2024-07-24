import entities.Student;
import enums.TipoStudente;

public class Main {
	public static void main(String[] args) {

/*		Circle circle1 = new Circle("20"); // COSTRUTTORE II
		Circle circle2 = new Circle(10); // COSTRUTTORE I

		System.out.println("Il perimetro del primo cerchio di raggio " + circle1.radius + " è: " + circle1.getPerimeter());
		System.out.println("Il perimetro del secondo cerchio è: " + circle2.getPerimeter());
		System.out.println("L'area del primo cerchio è: " + circle1.getArea());
		System.out.println("L'area del secondo cerchio è: " + circle2.getArea());

		Student aldo = new Student(); // I COSTRUTTORE
		aldo.sayHello();

		Student giovanni = new Student("Giovanni"); // II COSTRUTTORE
		giovanni.sayHello();

		Student giacomo = new Student("Giacomo", "Poretti", false);
		giacomo.sayHello();


		Math.sqrt(2);

		System.out.println("Quanti studenti abbiamo creato fino adesso?");
		System.out.println(Student.getNumStudentiCreati());*/

		// --------------------------------- COMPARAZIONE TRA 2 OGGETTI ----------------------------------

		Student giacomo = new Student("Giacomo", "Poretti", false, TipoStudente.FRONTEND);
		giacomo.id = 1;
		Student giacomo2 = new Student("Giacomo", "Poretti", false, TipoStudente.FRONTEND);
		giacomo2.id = 1;
		Student giacomo3 = giacomo;

		// Se utilizzo il doppio uguale mi verranno confrontate le celle di memoria, quindi 2 oggetti saranno uguali solo se nella stessa cella
		if (giacomo == giacomo3) System.out.println("I due oggetti sono identici");

		// Se non mi va bene il comportamento del doppio uguale posso usare .equals, però devo SOVRASCRIVERE il comportamento di default
		// di esso, perché di default .equals utilizza comunque la doppia uguaglianza
		if (giacomo.equals(giacomo2)) System.out.println("I due oggetti sono identici");
		else System.out.println("Sono diversi");

		// --------------------------------- STAMPA IN CONSOLE DI OGGETTI ----------------------------------
		// Il comportamento di default è quello di stampare l'oggetto rappresentandolo con una stringa tipo nomeclasse@1231321
		// Se non ci piace questo comportamento posso SOVRASCRIVERE il metodo .toString()
		System.out.println(giacomo);
		System.out.println(giacomo2);

	}


}
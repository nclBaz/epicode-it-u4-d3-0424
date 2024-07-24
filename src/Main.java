import entities.Circle;
import entities.Student;

public class Main {
	public static void main(String[] args) {

		Circle circle1 = new Circle("20"); // COSTRUTTORE II
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

	}
}
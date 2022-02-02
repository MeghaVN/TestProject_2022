package methodChaining;

public class demo {
	public static void main(String[] args) {

		class1 obj1 = new class1();
		obj1.given();

		Class2 obj2 = new Class2();
		obj2.get();
		obj2.when();

		class1 obj3 = new class1();
		obj3.given();
		obj3.given().when().get();

	}
}

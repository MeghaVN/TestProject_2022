package lambda_concepts;

// ->

public class Lamda_declaration {

	public static void main(String[] args) {
		
		//Interface object is not getting created, creating interface body and override
		WebPage w1 = (value, age) -> {
				System.out.println("Heeeeeelllliii" +value + "age" +age);	
		};
			w1.header("lambda",20);	

	}

}

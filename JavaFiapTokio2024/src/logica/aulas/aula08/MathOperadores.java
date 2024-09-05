package logica.aulas.aula08;

public class MathOperadores {

	public static void main(String[] args) {
		
		System.out.println("Math:");
		double PI = Math.PI;
		System.out.println(PI);
		
		System.out.println(Math.sqrt(225));
		System.out.println(Math.abs(-25));
		
		double num = 3.5;
		
		System.out.println(Math.ceil(num));
		System.out.println(Math.floor(num));
		System.out.println(Math.round(num));
		
		System.out.println();
		System.out.println("Random:");
		double random = Math.random();
		System.out.println(random);
		
		double multiplica = 3 + random * 5;
		System.out.println(multiplica);
		
		double arredonda = Math.round(multiplica);
		System.out.println(arredonda);
;	}

}

package pacote1;

public class java12 {

	public static void main(String arg[]) {

		int alturam = 10;
		int comprimentom = 30;
		int area_1;
		
		area_1 = alturam * comprimentom;
		
		int larguram = 2;		
		int area_2;
		
		area_2 = (alturam - larguram * 2) * (comprimentom - larguram * 2);
		
		int area_3;
		
		area_3 = area_1 - area_2;
		
		System.out.println("A área da moldura é de "+ area_3);
	}
}

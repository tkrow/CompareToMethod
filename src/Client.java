
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// a is "less than" b; returns -1
		System.out.println("a".compareToIgnoreCase("b"));
		
		// a is the same as a; returns 0
		System.out.println("a".compareToIgnoreCase("a"));
		
		// b is greater than a; returns 1
		System.out.println("b".compareToIgnoreCase("a"));
		
		// If the first characters are the same, the comparison is
		// made on each subsequent character
		System.out.println("aardsma".compareToIgnoreCase("aaron"));
	}

}

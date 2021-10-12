package arrayExamples;

public class ExamplePPT {

	//Example fromppt slide 36
	public static void main(String[] args) {
		
		//niza od tip account so dolzina od 2 objekti
		Account accounts[] = new Account[2];
		
		
		
		
		Account prv = new Account(1, 2);
		Account vtor = new Account(3, 4);
		
		accounts[0] = prv;
		accounts[1] = vtor;
		
		System.out.println(accounts[0].toString());
		System.out.println(accounts[1].toString());
		
		//vtora niza
		Account niza[] = new Account[2];
		niza[0] = new Account();
		niza[1] = new Account();
		
		
		niza[0].showData();
		niza[1].showData();
		
		
		System.out.println();
				
		
		
		
	}
}

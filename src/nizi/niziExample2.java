package nizi;

public class niziExample2 {
	
	public static void main(String[] args) {
		
		Integer array[] = new Integer[7];
		
		//array = [0,1,2,3,4,5,6]
		
		for (int i = 0; i < array.length; i++) { //0 e starting point na ciklusot, 
		                                         //se dodeka i e pomalo od dolzinata na nizata
			                                    
			array[i] = i+1;                      //faktor na progresija na ciklusot - inkrementiranje
			System.out.println("i=" +  i );
			System.out.println("array[" + i + "]=" + array[i]);
		
		}
		
		array[0] = array[0] + 10;
		array[1] = array[1] + 10;
		
		
		for(int i=0; i < array.length; i++ ) {
			
			System.out.println("i=" + i);
			System.out.println("array[" + i + "]=" + array[i]);
			
		}
				
	
	
	
	
	}
	


}

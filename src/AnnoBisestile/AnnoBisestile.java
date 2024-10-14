package AnnoBisestile;

public class AnnoBisestile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int anno = Integer.parseInt(args[0]);
		System.out.println(anno);
		
		boolean bbisestile;
		
		bbisestile = anno % 4 == 0;
		System.out.println(bbisestile);
		
		bbisestile = (bbisestile && (anno % 100 != 0));
		System.out.println(bbisestile);
		
		bbisestile = (bbisestile || (anno % 400 == 0));
		System.out.println(bbisestile);
		
		if(bbisestile) {
			System.out.println("anno " + anno + " E' un anno bisestile");
		}
		else {
			System.out.println("anno " + anno + " Non è un anno bisestile");
		}
		
	
		
	}
	

}

public class Collaboratore extends Dipendente {

	protected String pianoLav;
	
	Collaboratore(String nom,String cog, String ind,String matr, float stip, String piano){
		super(nom,cog,ind,matr,stip);
		pianoLav=piano;
	}

	public String toString() {
		String s=super.toString();
		s+="Piano di Lavoro: "+pianoLav+"\n";
		return s;
	}
	
	
	public static void main(String[] args) {
		Collaboratore c=new Collaboratore("Piero","Marra","Via Taranto","A6676",1140.5F,"2^ Piano");
		System.out.println(c);
	}
	
	
	
}

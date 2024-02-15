/**
 * versione 5 online
 */

public class Dipendente {
	
	protected String matricola;
	protected String indirizzo;
	protected String cognome;
	protected String nome;
	protected float stipendio;
	
	public Dipendente(String nom,String cog, String ind,String matr, float stip) {
		nome=nom;
		cognome=cog;
		indirizzo=ind;
		matricola=matr;
		stipendio=stip;
	}
	
	public String getMatricola() {
		return matricola;
	
	}

	public String getIndirizzo() {
		
		
		
		
		
		return indirizzo;
	}

	public String getCognome() {
		return cognome;
	}

	public String getNome() {
		return nome;
	}

	public float getStipendio() {
		return stipendio;
	}
	
	
	public String toString() {
		String s="Nome: "+nome+"\n";
		s+="Cognome: "+cognome+"\n";
		s+="Indirizzo: "+indirizzo+"\n";
		s+="Matricola: "+matricola+"\n";
		s+="Stipendio: "+stipendio+"\n";
		return s;
	}
	
	
	//test
	
	public static void main(String[] args) {
		Dipendente d=new Dipendente("Carlo","Alino","Via Roma 23","A13",1200);
		System.out.println(d);
	}
	

}

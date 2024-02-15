/**
 * marco
 */
public class Scuola {

	private String nomeS;
	private String sede;
	private int nDip;
	private Dipendente[] dipendenti;
	
	Scuola(String nS, String sed, int maxDip){
		nomeS=nS;
		sede=sed;
		nDip=0;
		dipendenti=new Dipendente[maxDip];
		
	}
	
	public boolean addDip(Dipendente d) {
		if(nDip<dipendenti.length) {
			dipendenti[nDip++]=d;
			return true;
		}
		else 
			return false;
	}
	
	public boolean removDip(String matr) {
		int i=0;
		for(;i<nDip;i++)
			if(matr.equalsIgnoreCase(dipendenti[i].getMatricola())) {
				break;
			}
		if(i==nDip)
			return false;
		else {			
		for (i=i+1; i < nDip; i++)
			dipendenti[i - 1] = dipendenti[i];
		
		nDip--;
		
		return true;
		}
				
	}
	
	
	public Dipendente searchDip(String matr) {
		for(Dipendente d: dipendenti) {
			if(d.getMatricola().equalsIgnoreCase(matr))
				return d;
		}
		return null;
	}
	
	
	public Dipendente[] searchDipCog(String cogn) {
		Dipendente[] dipCop=new Dipendente[nDip];
		int a=0;
		for(int i=0;i<nDip;i++) {
			if(cogn.equalsIgnoreCase(dipendenti[i].getCognome())) {
				dipCop[a]=dipendenti[i];
				a++;
			}
		}
		return dipCop;
	}
	
	public String visDocenti() {
		String s="Docenti:  \n";
		for(int i=0;i<nDip;i++)
			if(dipendenti[i].getClass()==Docente.class)
				s+=dipendenti[i];
		return s;
	}
	
	public float totStip() {
		float tot=0;
		for(int i=0;i<nDip;i++)
			tot+=dipendenti[i].getStipendio();
		return tot;
	}
	
	public String toString() {
		String s="Scuola: "+nomeS+"\n";
		s+="Sede: "+sede+"\n";
		s+="Dipendenti elenco: "+"\n";
		for(int i=0;i<nDip;i++) {
			s+=dipendenti[i]+"\n";
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scuola s=new Scuola("MEUCCI","CASARANO",20);
		Collaboratore c=new Collaboratore("Piero","Marra","Via Taranto","A6676",1140.5F,"2^ Piano");
		Docente d=new Docente("gianni","finizio","via lucano","S4134",1340,"Telecomunicazioni");
		Docente d1=new Docente("giandni","finizio","via lucano","S41344",13440,"Infor");
		System.out.println(s.addDip(c));
		System.out.println(s.addDip(d));
		System.out.println(s);
		System.out.println(s.removDip("A6676"));
		System.out.println(s);
		System.out.println(s.addDip(c));
		System.out.println(s.addDip(d1));
		System.out.println(s.visDocenti());
		System.out.println(s.totStip());
		Dipendente[] dss=s.searchDipCog("finizio");
		for(Dipendente dip: dss) {
			if(dip!=null)
			System.out.println(dip.toString());
		}
		
	}
	
	
	
	
	
}

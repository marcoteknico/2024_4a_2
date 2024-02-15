/**
 * marco3
 */
public class Docente extends Dipendente {

	protected String materia;
	
	Docente(String nom,String cog, String ind,String matr, float stip,String mat){
		super(nom, cog, ind, matr, stip);
		materia=mat;
	}

	
	public String toString() {
		String s=super.toString();
		s+="Materia: "+materia+"\n";
		return s;
	}
	
	
	public static void main(String[] args) {
		Docente d=new Docente("gianni","finizio","via lucano","S4134",1340,"Telecomunicazioni");
		System.out.println(d);
	}
	
	
	
}

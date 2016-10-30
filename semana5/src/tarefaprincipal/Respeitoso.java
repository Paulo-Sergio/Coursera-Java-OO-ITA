package tarefaprincipal;

public class Respeitoso implements FormatadorNome{

	private boolean isM;
	
	public Respeitoso(boolean isM) {
		this.isM = isM;
	}
	
	@Override
	public String formatarNome(String nome, String sobreNome) {
		if(this.isM){
			return "Sr. " + sobreNome;
		}else{
			return "Sra. " + sobreNome;
		}
	}

}

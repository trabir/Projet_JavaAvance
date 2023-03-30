package gestionBureauVote;

public class Bureau {
	private int numero ;//numero de bureau
	private String adresse ;//adresse de bureau
	private String region  ;//region de bureau
	
	
	public Bureau(int numero ,String adresse ,String region) {
		numero=0 ;
		adresse="";
		region="" ;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}



}

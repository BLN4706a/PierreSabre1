package personnages;


public class Humain {
	private String nom;
	private String boissonFavorite;
	private int argent;
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}
	private void parler (String texte) {
		System.out.println(nom+":"+texte);
	}
	public void direBonjour() {
		parler("bonjour ! je m appelle "+ nom +"et j aime oire du "+boissonFavorite+ ".");
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+ boissonFavorite+"!GLAUPS!");
	}
	public void acheter(String bien ,int prix) {
		
		
	}

}

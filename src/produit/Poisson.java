package produit;

public class Poisson extends Produit {
	private String datePeche;
	private String nom = "poisson";

	public Poisson(String datePeche) {
		super("poisson", null);
		this.datePeche = datePeche;
	}

	public String description() {
		return (nom + " pêchés " + datePeche);
	}
}

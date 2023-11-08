package produit;

import personnages.Gaulois;

public class Sanglier extends Produit {
	private int poids;
	private Gaulois chasseur;
	private String nom = "sanglier";

	public Sanglier(Unite unite, int poids, Gaulois chasseur) {
		super("sanglier", unite);
		this.poids = poids;
		this.chasseur = chasseur;
	}

	public String description() {
		return (nom + " de " + poids + " " + super.unite.getAffichage() + " chassé par " + chasseur.getNom());
	}
}

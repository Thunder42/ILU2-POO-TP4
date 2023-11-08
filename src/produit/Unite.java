package produit;

public enum Unite {
	LITRE("l"), CENTILITRE("cl"), MILLILITRE("ml"), GRAMME("g"), KILOGRAMME("kg"), PAR_PIECE("par pièce");

	private String affichage;

	Unite(String affichage) {
		this.affichage = affichage;
	}

	public String getAffichage() {
		return affichage;
	}
}

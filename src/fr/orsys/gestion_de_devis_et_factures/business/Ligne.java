package fr.orsys.gestion_de_devis_et_factures.business;

public class Ligne {

	// On associe la ligne à un et un seul document
	private Document document;
	private Article article;
	private float quantite;
	private Float remise;
	
	public Ligne(Document document, Article article, float quantite) {
		super();
		this.document = document;
		this.article = article;
		this.quantite = quantite;
		// On ajoute l'objet Ligne en cours de création (this)
		// à la liste des lignes du document donné en paramètre
		document.getLignes().add(this);
	}

	public Ligne(Document document, Article article, float quantite, Float remise) {
		this(document, article, quantite);
		this.remise = remise;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public float getQuantite() {
		return quantite;
	}

	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}

	public Float getRemise() {
		return remise;
	}

	public void setRemise(Float remise) {
		this.remise = remise;
	}

	@Override
	public String toString() {
		return "Ligne [article=" + article + ", quantite=" + quantite + ", remise=" + remise
				+ "]";
	}
	
}

package fr.orsys.gestion_de_devis_et_factures.business;

public class Article {

	private Long id;
	private String nom;
	private float prix;
	private static Long compteur = 0L;
	
	public Article() {
		// TODO Auto-generated constructor stub
	}
	
	public Article(String nom, float prix) {
		this();
		this.nom = nom;
		this.prix = prix;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", nom=" + nom + ", prix=" + prix + "]";
	}
	
}

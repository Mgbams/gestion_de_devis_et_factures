package fr.orsys.gestion_de_devis_et_factures;

import java.util.ArrayList;
import java.util.Date;

import fr.orsys.gestion_de_devis_et_factures.business.Article;
import fr.orsys.gestion_de_devis_et_factures.business.Client;
import fr.orsys.gestion_de_devis_et_factures.business.Devis;
import fr.orsys.gestion_de_devis_et_factures.business.Document;
import fr.orsys.gestion_de_devis_et_factures.business.Facture;
import fr.orsys.gestion_de_devis_et_factures.business.Ligne;

public class App {

	private static ArrayList<Article> articles = new ArrayList<>();
	private static ArrayList<Document> documents = new ArrayList<>();
	private static ArrayList<Client> clients = new ArrayList<>();
	
	public static void main(String[] args) {
		ajouterClients();
		ajouterArticles();
		ajouterDocuments();
		
		afficherDocuments();
	}

	private static void ajouterDocuments() {
		Document facture1 = new Facture(new Date(), clients.get(0));
		// La facture porte sur 8 gommes et 2 crayons
		new Ligne(facture1, articles.get(0), 8);
		new Ligne(facture1, articles.get(1), 2);
		// On ajoute la facture à la liste des documents
		documents.add(facture1);
		
		Document facture2 = new Facture(new Date(), clients.get(1));
		new Ligne(facture1, articles.get(0), 1);
		new Ligne(facture2, articles.get(1), 5);
		new Ligne(facture2, articles.get(2), 10);		
		documents.add(facture2);
		
		Document devis1 = new Devis(new Date(), clients.get(0));
		new Ligne(devis1, articles.get(2), 10);	
		documents.add(devis1);
	}

	private static void afficherDocuments() {
		for (Document document : documents) {
			// Par polymophisme, Java appelle la méthode toString de la classe Document si 
			// la méthode toString n'existe pas dans la classe fille
			System.out.println(document);
			// Pour chaque document on affiche chacune de ses lignes
			for (Ligne ligne : document.getLignes()) {
				System.out.println("\t" + ligne);
			}
		}
	}

	private static void ajouterArticles() {
		articles.add(new Article("Gomme", 0.35f));
		articles.add(new Article("Crayon HB", 7.8f));
		articles.add(new Article("Ramette A4 Clairefontaine", 5.27f));
	}

	private static void ajouterClients() {
		clients.add(new Client("MARTIN"));
		clients.add(new Client("ROSSI"));
		clients.add(new Client("DOS SANTOS"));
	}

}
package services;

import javax.ejb.Local;

import entities.Commande;
import entities.LigneCommande;
import entities.Livraison;
import entities.Produit;

@Local
public interface CommandeManagementLocal {
	
	public boolean addProduitCmd(Produit pr,Commande co, LigneCommande lc);
	//public boolean deleteProduitCmd(Commande co, LigneCommande lc);
	public boolean addCommandeLivraison(Commande co, Livraison li);
	public boolean changerStatutLivraisonValide(Livraison li);
	

}

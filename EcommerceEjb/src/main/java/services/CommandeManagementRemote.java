package services;

import javax.ejb.Remote;

import entities.Commande;
import entities.LigneCommande;
import entities.Livraison;
import entities.Produit;

@Remote
public interface CommandeManagementRemote {
	
	public boolean addProduitCmd(Produit pr,Commande co, LigneCommande lc);
	//public boolean deleteProduitCmd(Commande co, LigneCommande lc);
	public boolean addCommandeLivraison(Commande co, Livraison li);
	public boolean changerStatutLivraisonValide(Livraison li);

}

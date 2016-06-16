package services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Commande;
import entities.LigneCommande;
import entities.Livraison;
import entities.Produit;

/**
 * Session Bean implementation class CommandeManagement
 */
@Stateless
@LocalBean
public class CommandeManagement implements CommandeManagementRemote, CommandeManagementLocal {

	@PersistenceContext
	EntityManager entityManager;
    /**
     * Default constructor. 
     */
    public CommandeManagement() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public boolean addProduitCmd(Produit pr,Commande co, LigneCommande lc) {

		try{
			lc.setCommande(co);
			lc.setProduit(pr);
			entityManager.persist(lc);
			
			return true;
		}catch(Exception e){
			System.err.println("Problem adding produit in commande ...");
		}
		return false;
	}

//	@Override
//	public boolean deleteProduitCmd(Commande co, LigneCommande lc) {
//		try{
//			co.getLignesCommandes().remove(lc);
//			
//			return true;
//		}catch(Exception e){
//			System.err.println("Problem deleting produit in commande ...");
//		}
//		return false;
//	}

	@Override
	public boolean addCommandeLivraison(Commande co, Livraison li) {
		try{
			li.setCommande(co);
			entityManager.persist(li);
			
			return true;
		}catch(Exception e){
			System.err.println("Problem adding produit in commande ...");
		}
		return false;
	}

	@Override
	public boolean changerStatutLivraisonValide(Livraison li) {
		li.setStatutcmd("Livrée");
		try {
			entityManager.merge(li);
			return true;
		} catch (Exception e) {
			System.err.println("Problem updating ...");
		}
		return false;
		
	}

	

}

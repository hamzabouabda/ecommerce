package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Panier implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Map<Integer,LigneCommande> items=new HashMap<Integer,LigneCommande>();
	
	public void addArticle(Produit pr , int quantite )
	{
		if(items.get(pr.getId())==null)
		{
			LigneCommande lc=new LigneCommande();
			lc.setProduit(pr);
			lc.setQuantite(quantite);
			lc.setPrix(pr.getPrix());
			items.put(pr.getId(), lc);
		}else
		{
			LigneCommande lc=items.get(pr.getId());
			lc.setQuantite(pr.getQuantite()+quantite);
		}
	}
	
	public Collection<LigneCommande> getItems()
	{
	  return items.values();	
	}
	
	public double getTotal()
	{
		double total=0;
		for(LigneCommande lc:items.values())
		{
		  total+=lc.getPrix()*lc.getQuantite();	
		}
		return total;
	}
	
	public int getSize()
	{
		return items.size();
	}
	
	public void deleteItem(Long idProduit)
	{
		items.remove(idProduit);
	}
}

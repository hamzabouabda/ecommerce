package delegate;

import java.util.List;

import entities.Boutique;
import entities.Client;
import locator.ServiceLocator;
import services.BoutiqueManagementRemote;
import services.ClientManagementRemote;



public class ProduitManagementDelegate {

	public static final String jndiName = "/EcommerceEjb/ProduitManagement!services.ProduitManagementRemote";
	
	public static ProduitManagementRemote getProxy(){
		return (ProduitManagementRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}
	
	public static List<Produit> doSearchProduits(){
		return getProxy().
	}
	
	
	
	
	
	
}

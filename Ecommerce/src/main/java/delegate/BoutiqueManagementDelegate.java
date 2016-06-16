package delegate;

import java.util.List;

import entities.Boutique;
import entities.Client;
import locator.ServiceLocator;
import services.BoutiqueManagementRemote;
import services.ClientManagementRemote;



public class BoutiqueManagementDelegate {

	public static final String jndiName = "/EcommerceEjb/BoutiqueManagement!services.BoutiqueManagementRemote";
	
	public static BoutiqueManagementRemote getProxy(){
		return (BoutiqueManagementRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}
	
	public static List<Boutique> doSearchBoutiques(){
		return getProxy().getAllBoutique();
	}
	
	
	
	
	
	
}

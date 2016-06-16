package delegate;

import java.util.List;

import entities.Client;
import locator.ServiceLocator;
import services.ClientManagementRemote;



public class ClientManagementDelegate {

	public static final String jndiName = "/EcommerceEjb/ClientManagement!services.ClientManagementRemote";
	
	public static ClientManagementRemote getProxy(){
		return (ClientManagementRemote) ServiceLocator.getInstance().getProxy(jndiName);
	}
	
	public static Client doSearchClientById(int id){
		return getProxy().searchClientByid(id);
	}
	public static boolean doaddClient(Client c){
		return getProxy().addClient(c);
	}
	
	
	
	
	
	
}

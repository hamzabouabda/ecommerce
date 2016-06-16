package test;

import javax.naming.Context;
import javax.naming.InitialContext;

import org.junit.Before;
import org.junit.Test;

import services.ClientManagementRemote;
import delegate.ClientManagementDelegate;
import entities.Client;
import junit.framework.TestCase;

public class ClientTest extends TestCase {

	ClientManagementDelegate clientManagementDelegate;
	
	@Before
	protected void setUp() throws Exception {
		clientManagementDelegate = new ClientManagementDelegate();
	}
	
	@Test
	public void testdoFindClientById() {
		
		Client client=clientManagementDelegate.doSearchClientById(1);
	}
	
	@Test
	public void testdoaddClient() {
		
		Client c =new Client();
		c.setNom("aaa");
		c.setPrenom("aaaaaaaaa");
		c.setSexe("M");
		clientManagementDelegate.doaddClient(c);
	}

}

package main;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import services.ClientManagementRemote;

public class TestMain {

	public static void main(String[] args) {
		
		Context context;
		try {
			context = new InitialContext();
			ClientManagementRemote proxy = (ClientManagementRemote) context
					.lookup("EcommerceEjb/ClientManagement!services.ClientManagementRemote");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

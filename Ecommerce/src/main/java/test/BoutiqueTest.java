package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import delegate.BoutiqueManagementDelegate;
import entities.Boutique;

public class BoutiqueTest {

    public BoutiqueManagementDelegate boutiqueManagementDelegate;
	
	@Before
	public void setUp() throws Exception {
		boutiqueManagementDelegate = new BoutiqueManagementDelegate();
	}
	

	@Test
	public void testdoFindAllBoutiques() {
		List<Boutique> boutiques=new ArrayList<Boutique>();
		boutiques=boutiqueManagementDelegate.doSearchBoutiques();
		
		for(int i=0;i< boutiques.size();i++)
		{
			System.out.println(boutiques.get(i).getNomBoutique());
		}
	}

}

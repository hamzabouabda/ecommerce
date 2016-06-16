package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Boutique;
import entities.Categorie;
import entities.Client;
import entities.Commande;
import entities.LigneCommande;
import entities.Marque;
import entities.Produit;


@Singleton
@LocalBean
@Startup
public class PopulateDB {
	@PersistenceContext
	private EntityManager entityManager;

	public PopulateDB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("deprecation")
	@PostConstruct
	public void initDB() {
		
		Client c=new Client();
		c.setNom("bouabda");
		c.setPrenom("Hamza");
		c.setEmail("bouabda.hamza@yahoo.fr");
		c.setSexe("M");
		entityManager.persist(c);
		Client c1=new Client();
		c1.setNom("boulabiar");
		c1.setPrenom("borhene");
		c1.setEmail("boulabiar.borhene@yahoo.fr");
		c1.setSexe("M");
		entityManager.persist(c1);
		Client c2=new Client();
		c2.setNom("oueslati");
		c2.setPrenom("souhaib");
		c2.setEmail("oueslati.souhaib@yahoo.fr");
		c2.setSexe("M");
		entityManager.persist(c2);
		Client c3=new Client();
		c3.setNom("boukchim");
		c3.setPrenom("amine");
		c3.setEmail("boukchim.amine@yahoo.fr");
		c3.setSexe("M");
		entityManager.persist(c3);
		Boutique b =new Boutique();
		b.setNomBoutique("EXIST");
		b.setTel(71977373);
		b.setEmail("exist.yahoo.fr");
		entityManager.persist(b);
		Boutique b1 =new Boutique();
		b1.setNomBoutique("PULL & BEAR");
		b1.setTel(71977373);
		b1.setEmail("pullandbear.yahoo.fr");
		entityManager.persist(b1);
		Boutique b2 =new Boutique();
		b2.setNomBoutique("ZARA");
		b2.setTel(71977373);
		b2.setEmail("zara.yahoo.fr");
		entityManager.persist(b2);
		Boutique b3 =new Boutique();
		b3.setNomBoutique("ZEN");
		b3.setTel(71977373);
		b3.setEmail("zen.yahoo.fr");
		entityManager.persist(b3);
        Categorie ca =new Categorie();
        ca.setNomCateg("Vetements pour Homme");
        entityManager.persist(ca);
        Categorie ca1 =new Categorie();
        ca1.setNomCateg("Vetements pour Femme");
        entityManager.persist(ca1);
        Categorie ca2 =new Categorie();
        ca2.setNomCateg("Chaussures pour Homme");
        entityManager.persist(ca2);
        Categorie ca3 =new Categorie();
        ca3.setNomCateg("Chaussures pour Femme");
        entityManager.persist(ca3);
        Marque m=new Marque();
        m.setNom("Nike");
        entityManager.persist(m);
        Marque m1=new Marque();
        m1.setNom("Adidas");
        entityManager.persist(m1);
        Marque m2= new Marque();
        m2.setNom("Zen");
        entityManager.persist(m2);
        Marque m3= new Marque();
        m3.setNom("ZARA");
        entityManager.persist(m3);
        Marque m4= new Marque();
        m4.setNom("PULL & BEAR");
        entityManager.persist(m4);
        Marque m5= new Marque();
        m5.setNom("EXIST");
        entityManager.persist(m5);
        Produit p =new Produit();
        p.setBoutique(b);
        p.setMarque(m5);
        p.setCategorie(ca);
        p.setPrix(45000);
        p.setQuantite(36);
        entityManager.persist(p);
        Produit p1 =new Produit();
        p1.setBoutique(b1);
        p1.setMarque(m4);
        p1.setCategorie(ca);
        p1.setPrix(46000);
        p1.setQuantite(20);
        entityManager.persist(p1);
//        Commande co=new Commande();
//        co.setClient(c);
//        co.setDateCmd(new Date("01.01.2015"));
//        entityManager.persist(co);
//        LigneCommande lc=new LigneCommande();
//        lc.setProduit(p);
//        lc.setQuantite(2);
//        lc.setCommande(co);
//        lc.setPrix(45000);
//        entityManager.persist(lc);
	}

}

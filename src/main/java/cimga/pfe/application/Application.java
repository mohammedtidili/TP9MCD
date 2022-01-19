package cimga.pfe.application;

import cigma.pfe.controller.ClientController;
import cigma.pfe.model.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Application {
    public static void main (String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("McdBase.xml");
        ClientController clientController = (ClientController) applicationContext.getBean("controllerClient");
        Date dateNaissance = new Date("1991/07/27");
        Date dateNaissanceSalah = new Date("1998/07/27");
        Date dateFactureOne = new Date("2021/07/27");
        Date dateFactureTwo = new Date("2022/07/27");
        List<Produit> listProduit = Arrays.asList(new Produit("Savon", 4.5F, 20, null), new Produit("Shompoin", 4.5F, 20, null));
        List<Facture> listFacture = Arrays.asList(new Facture(dateFactureOne, null, listProduit), new Facture(dateFactureTwo, null, listProduit));
        List<Promotion> listPromotion = Arrays.asList(new Promotion("Solde 40%", null), new Promotion("Remise 10%", null));
        CarteFidelio carteFidelio = new CarteFidelio("10I", null);
        CarteFidelio carteFidelioSalah = new CarteFidelio("10I", null);
        Client nouveauClientOne = new Client("TIDILI", "Kawtar", dateNaissance, "0624164055", "Home", "Casablanca Sbata Salmia 2 Rue N° 32", listFacture, listPromotion, carteFidelio);
        Client nouveauClientTwo = new Client(1L, "TIDILI", "Mounir", dateNaissanceSalah, "0624164055", "Home", "Casablanca Sbata Salmia 2 Rue N° 32", listFacture, listPromotion, carteFidelioSalah);
        Client nouveauClientTree = new Client(2L, "TIDILI", "Mounir", dateNaissanceSalah, "0624164055", "Home", "Casablanca Sbata Salmia 2 Rue N° 32", listFacture, listPromotion, carteFidelioSalah);

        clientController.ajouterClient(nouveauClientOne);
        clientController.trouverClient(nouveauClientOne.getNum());
        /*L'utilisation de nouveau client two pour effectuer la modification sur l'objet nouveau client one*/
        clientController.modifierClient(nouveauClientTwo);
        clientController.supprimerClient(nouveauClientOne);

        /*Operation sur Client nouveau tree */
        clientController.trouverClient(nouveauClientTree.getNum());
        clientController.modifierClient(nouveauClientTree);
        clientController.supprimerClient(nouveauClientTree);


    }
}

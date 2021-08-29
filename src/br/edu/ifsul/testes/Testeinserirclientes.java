/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblcidade;
import br.edu.ifsul.classes.Tblcliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testeinserirclientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Tblcliente cli = new Tblcliente();
        Tblcidade c = em.find(Tblcidade.class, 1);
        cli.setCpf("09078980876");
        cli.setNome("André Fernando Rolwagen");
        cli.setRg("9089706986");
        cli.setDataNasc(new java.sql.Date(1990, 9, 8));
        cli.setSexo("Mas");
        cli.setNumTel("999456789");
        cli.setEmail("andredomate@gmail.com");
        cli.setEndereço("rua da tristeza");
        cli.setCep("90780123");
        cli.setNúmero("568");
        cli.setComplemento("perto do centro");
        cli.setCidCodigo(c);
        em.getTransaction().begin();
        em.persist(cli);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

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
public class Testealterarclientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Tblcliente cli = em.find(Tblcliente.class, 3);//altera cidade de codigo 3
        cli.setNome("André F. Rol.");
        em.getTransaction().begin();
        em.persist(cli);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}

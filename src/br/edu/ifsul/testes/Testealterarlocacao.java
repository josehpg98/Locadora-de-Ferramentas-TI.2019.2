/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblcidade;
import br.edu.ifsul.classes.Tblcliente;
import br.edu.ifsul.classes.Tbllocacao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testealterarlocacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Tbllocacao loc = em.find(Tbllocacao.class, 3);//altera cidade de codigo 3
        Tblcliente cl = em.find(Tblcliente.class, 3);
        loc.setCliCodigo(cl);
        em.getTransaction().begin();
        em.persist(loc);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

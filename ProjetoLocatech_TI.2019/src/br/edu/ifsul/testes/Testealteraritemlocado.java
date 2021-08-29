/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Itemlocado;
import br.edu.ifsul.classes.Tblcidade;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testealteraritemlocado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Itemlocado itl = em.find(Itemlocado.class, 3);//altera cidade de codigo 3
        itl.setQtdeEquipamento(0);
        em.getTransaction().begin();
        em.persist(itl);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}

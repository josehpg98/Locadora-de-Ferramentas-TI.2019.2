/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblcidade;
import br.edu.ifsul.classes.Tblequipamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testealterarequipamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Tblequipamento eqp = em.find(Tblequipamento.class, 1);//altera o equipamento de codigo 1
        eqp.setNome("Bitorneira");
        em.getTransaction().begin();
        em.persist(eqp);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

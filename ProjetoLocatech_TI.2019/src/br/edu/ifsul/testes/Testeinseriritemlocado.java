/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Itemlocado;
import br.edu.ifsul.classes.Tblequipamento;
import br.edu.ifsul.classes.Tbllocacao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testeinseriritemlocado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Itemlocado itloc = new Itemlocado();
        Tblequipamento eq = em.find(Tblequipamento.class, 3);
        Tbllocacao lc = em.find(Tbllocacao.class, 3);
        itloc.setEquCodigo(eq);
        itloc.setLocCodigo(lc);
        itloc.setQtdeEquipamento(20);
        em.getTransaction().begin();
        em.persist(itloc);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }

}

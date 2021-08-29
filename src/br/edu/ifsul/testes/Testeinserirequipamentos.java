/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblequipamento;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testeinserirequipamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Tblequipamento eqp = new Tblequipamento();//cria um novo objeto do tipo equipamento
        eqp.setNome("Britador");
        eqp.setMarca("Becker");
        eqp.setValor(190.00);
        eqp.setEstoque(10);
        em.getTransaction().begin();
        em.persist(eqp);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}

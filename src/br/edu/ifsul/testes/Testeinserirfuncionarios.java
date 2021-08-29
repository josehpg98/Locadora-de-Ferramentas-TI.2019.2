/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblcidade;
import br.edu.ifsul.classes.Tblfuncionario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testeinserirfuncionarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        Tblfuncionario f = new Tblfuncionario();
        Tblcidade c = em.find(Tblcidade.class, 1);
        f.setCidCodigo(c);
        f.setNome("José das Quebrada");
        f.setCpf("03066406042");
        f.setCargoFunc("Distribuidor");
        f.setNumTel("997654398");
        f.setSenha("teste123");
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        em.close();
    }
    
}

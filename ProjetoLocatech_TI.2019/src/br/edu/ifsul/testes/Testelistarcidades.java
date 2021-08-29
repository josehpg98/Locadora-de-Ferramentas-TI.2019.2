/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblcidade;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testelistarcidades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        String jpql = "select c from Tblcidade c";
        List<Tblcidade> listac = em.createQuery(jpql).getResultList();
        for(Tblcidade c : listac){
            System.out.println("Codigo: "+ c.getCidCodigo()+" Nome: "+c.getNome()+" UF: "+c.getUf());
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblequipamento;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testelistarequipamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        String jpql = "select e from Tblequipamento e";
        List<Tblequipamento> listaeqp = em.createQuery(jpql).getResultList();
        for (Tblequipamento e : listaeqp) {
            System.out.println(" Codigo: " + e.getEquCodigo() + " Nome: " + e.getNome() + " Marca: " + e.getMarca() + " Valor: " + e.getValor()+" Estoque: "+e.getEstoque());
        }
    }

}

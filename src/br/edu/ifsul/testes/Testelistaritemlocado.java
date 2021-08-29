/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Itemlocado;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testelistaritemlocado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        String jpql = "select it from Itemlocado it";
        List<Itemlocado> listit = em.createQuery(jpql).getResultList();
        for (Itemlocado i : listit) {
            System.out.println(" Codigo do Item: " + i.getIteCodigo() + " Equipamento: " + i.getEquCodigo() + " Codigo da Locação: " + i.getLocCodigo() + " Qtde. Equipamento(s): " + i.getQtdeEquipamento());
        }
    }

}

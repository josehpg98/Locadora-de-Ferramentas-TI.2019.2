/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tbllocacao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testelistalocacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        String jpql = "select loc from Tbllocacao loc";
        List<Tbllocacao> loc = em.createQuery(jpql).getResultList();
        for(Tbllocacao l : loc){
            System.out.println(" Codogo da Locação: "+l.getLocCodigo()+" Funcionário: "+l.getFunCodigo()+" Cliente: "+l.getCliCodigo()+" Data da Locação:"+l.getDataLoc()+" Valor Total: "+l.getValorTotal()+" Data de Devolução: "+l.getDatadev());
        }
    }
    
}

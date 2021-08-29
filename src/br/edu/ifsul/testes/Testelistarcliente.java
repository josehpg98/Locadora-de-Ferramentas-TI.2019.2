/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblcliente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testelistarcliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        String jpql = "select cl from Tblcliente cl";
         List<Tblcliente> listacli = em.createQuery(jpql).getResultList();
        for(Tblcliente c : listacli){
            System.out.println("Codigo: "+ c.getCliCodigo()+" Nome: "+c.getNome()+" CPF: "+c.getCpf()+" RG: "+c.getRg()+" Data Nasc. "+c.getDataNasc()+" Número Tel. "+c.getNumTel()+" E-mail: "+c.getEmail()+" Endereço: "+c.getEndereço()+" Cidade: "+c.getCidCodigo()+" CEP: "+c.getCep()+" Número: "+c.getNúmero()+" Complemento: "+c.getComplemento());
        }
    }
    
}

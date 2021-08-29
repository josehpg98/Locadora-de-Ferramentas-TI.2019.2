/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import br.edu.ifsul.classes.Tblfuncionario;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author José Henrique
 */
public class Testelistarfuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjetoLocatech_TI.2019PU");
        EntityManager em = emf.createEntityManager();
        String jpql = "select f from Tblfuncionario f";
        List<Tblfuncionario> listaf = em.createQuery(jpql).getResultList();
        for (Tblfuncionario f : listaf) {
            System.out.println("Codigo: " + f.getFunCodigo() + " Nome: " + f.getNome() + " CPF: " + f.getCpf() + " Cargo: " + f.getCargoFunc() + " Número de Telefone: " + f.getNumTel() + " Senha: " + f.getSenha());
        }
    }

}

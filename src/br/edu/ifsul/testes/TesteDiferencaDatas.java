/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.testes;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author José Henrique
 */
public class TesteDiferencaDatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");        
        Date data1 = new Date(119, 11, 6);
        System.out.println("Data 1: " + sdf.format(data1));
        Date data2 = new Date(119, 11, 10);
        System.out.println("Data 2: " + sdf.format(data2));
        /// diferença em miliegundos
        Long diferenca = data2.getTime() - data1.getTime();
        System.out.println("Diferença em milisegundos: " + diferenca);
        Long difDias = diferenca / (24 * 60 * 60 * 1000);
        System.out.println("Diferença em dias: " + difDias);
    }
    
}
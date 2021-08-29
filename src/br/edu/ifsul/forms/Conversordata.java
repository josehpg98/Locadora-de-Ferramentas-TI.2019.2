/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsul.forms;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jdesktop.beansbinding.Converter;

/**
 *
 * @author José Henrique
 */
public class Conversordata extends Converter{

      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public Object convertForward(Object value) {
        Date data = (Date)value;
      return sdf.format(data);
    }

    @Override
    public Object convertReverse(Object value) {
         String str = (String)value;
        try {
            return sdf.parse(str);
        } catch (Exception e) {
            return null;
        }
    }
    
}

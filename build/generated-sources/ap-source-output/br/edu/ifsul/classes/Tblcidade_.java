package br.edu.ifsul.classes;

import br.edu.ifsul.classes.Tblcliente;
import br.edu.ifsul.classes.Tblfuncionario;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T18:40:50")
@StaticMetamodel(Tblcidade.class)
public class Tblcidade_ { 

    public static volatile SingularAttribute<Tblcidade, String> uf;
    public static volatile CollectionAttribute<Tblcidade, Tblfuncionario> tblfuncionarioCollection;
    public static volatile SingularAttribute<Tblcidade, Integer> cidCodigo;
    public static volatile SingularAttribute<Tblcidade, String> nome;
    public static volatile CollectionAttribute<Tblcidade, Tblcliente> tblclienteCollection;

}
package br.edu.ifsul.classes;

import br.edu.ifsul.classes.Tblcidade;
import br.edu.ifsul.classes.Tbllocacao;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T18:40:50")
@StaticMetamodel(Tblcliente.class)
public class Tblcliente_ { 

    public static volatile CollectionAttribute<Tblcliente, Tbllocacao> tbllocacaoCollection;
    public static volatile SingularAttribute<Tblcliente, String> endereço;
    public static volatile SingularAttribute<Tblcliente, String> nome;
    public static volatile SingularAttribute<Tblcliente, String> número;
    public static volatile SingularAttribute<Tblcliente, String> numTel;
    public static volatile SingularAttribute<Tblcliente, String> cep;
    public static volatile SingularAttribute<Tblcliente, Date> dataNasc;
    public static volatile SingularAttribute<Tblcliente, String> complemento;
    public static volatile SingularAttribute<Tblcliente, String> rg;
    public static volatile SingularAttribute<Tblcliente, Tblcidade> cidCodigo;
    public static volatile SingularAttribute<Tblcliente, String> cpf;
    public static volatile SingularAttribute<Tblcliente, String> sexo;
    public static volatile SingularAttribute<Tblcliente, Integer> cliCodigo;
    public static volatile SingularAttribute<Tblcliente, String> email;

}
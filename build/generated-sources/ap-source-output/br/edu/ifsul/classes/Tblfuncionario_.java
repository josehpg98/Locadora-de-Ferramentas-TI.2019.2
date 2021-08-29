package br.edu.ifsul.classes;

import br.edu.ifsul.classes.Tblcidade;
import br.edu.ifsul.classes.Tbllocacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T18:40:50")
@StaticMetamodel(Tblfuncionario.class)
public class Tblfuncionario_ { 

    public static volatile SingularAttribute<Tblfuncionario, String> cargoFunc;
    public static volatile SingularAttribute<Tblfuncionario, String> senha;
    public static volatile CollectionAttribute<Tblfuncionario, Tbllocacao> tbllocacaoCollection;
    public static volatile SingularAttribute<Tblfuncionario, Integer> funCodigo;
    public static volatile SingularAttribute<Tblfuncionario, Tblcidade> cidCodigo;
    public static volatile SingularAttribute<Tblfuncionario, String> cpf;
    public static volatile SingularAttribute<Tblfuncionario, String> nome;
    public static volatile SingularAttribute<Tblfuncionario, String> numTel;

}
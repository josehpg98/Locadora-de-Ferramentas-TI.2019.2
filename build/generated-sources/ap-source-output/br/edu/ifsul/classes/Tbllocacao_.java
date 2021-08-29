package br.edu.ifsul.classes;

import br.edu.ifsul.classes.Itemlocado;
import br.edu.ifsul.classes.Tblcliente;
import br.edu.ifsul.classes.Tblfuncionario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T18:40:50")
@StaticMetamodel(Tbllocacao.class)
public class Tbllocacao_ { 

    public static volatile SingularAttribute<Tbllocacao, Integer> locCodigo;
    public static volatile SingularAttribute<Tbllocacao, Date> dataLoc;
    public static volatile SingularAttribute<Tbllocacao, Tblfuncionario> funCodigo;
    public static volatile SingularAttribute<Tbllocacao, Date> datadevprev;
    public static volatile SingularAttribute<Tbllocacao, Double> valorTotal;
    public static volatile SingularAttribute<Tbllocacao, Double> multa;
    public static volatile SingularAttribute<Tbllocacao, Tblcliente> cliCodigo;
    public static volatile SingularAttribute<Tbllocacao, Date> dataDev;
    public static volatile CollectionAttribute<Tbllocacao, Itemlocado> itemlocadoCollection;

}
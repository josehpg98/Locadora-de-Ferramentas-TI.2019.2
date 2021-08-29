package br.edu.ifsul.classes;

import br.edu.ifsul.classes.Itemlocado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-10-13T21:07:01")
@StaticMetamodel(Tblequipamento.class)
public class Tblequipamento_ { 

    public static volatile SingularAttribute<Tblequipamento, String> marca;
    public static volatile SingularAttribute<Tblequipamento, Double> valor;
    public static volatile SingularAttribute<Tblequipamento, String> nome;
    public static volatile CollectionAttribute<Tblequipamento, Itemlocado> itemlocadoCollection;
    public static volatile SingularAttribute<Tblequipamento, Integer> equCodigo;

}
package br.edu.ifsul.classes;

import br.edu.ifsul.classes.Tblequipamento;
import br.edu.ifsul.classes.Tbllocacao;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-12-10T18:40:50")
@StaticMetamodel(Itemlocado.class)
public class Itemlocado_ { 

    public static volatile SingularAttribute<Itemlocado, Integer> qtdeEquipamento;
    public static volatile SingularAttribute<Itemlocado, Tbllocacao> locCodigo;
    public static volatile SingularAttribute<Itemlocado, Integer> iteCodigo;
    public static volatile SingularAttribute<Itemlocado, Tblequipamento> equCodigo;

}
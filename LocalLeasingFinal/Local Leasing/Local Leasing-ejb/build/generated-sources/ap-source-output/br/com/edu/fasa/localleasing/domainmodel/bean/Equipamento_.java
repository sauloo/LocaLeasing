package br.com.edu.fasa.localleasing.domainmodel.bean;

import br.com.edu.fasa.localleasing.domainmodel.bean.Estoque;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-07-02T11:45:19")
@StaticMetamodel(Equipamento.class)
public class Equipamento_ { 

    public static volatile SingularAttribute<Equipamento, Long> id;
    public static volatile SingularAttribute<Equipamento, Estoque> fkEstoque;
    public static volatile SingularAttribute<Equipamento, Integer> status;
    public static volatile SingularAttribute<Equipamento, String> tipo;
    public static volatile SingularAttribute<Equipamento, String> marca;
    public static volatile SingularAttribute<Equipamento, String> serial;

}
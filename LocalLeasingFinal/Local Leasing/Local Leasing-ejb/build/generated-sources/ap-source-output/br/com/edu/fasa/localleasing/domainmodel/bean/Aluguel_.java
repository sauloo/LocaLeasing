package br.com.edu.fasa.localleasing.domainmodel.bean;

import br.com.edu.fasa.localleasing.domainmodel.bean.Cliente;
import br.com.edu.fasa.localleasing.domainmodel.bean.Equipamento;
import br.com.edu.fasa.localleasing.domainmodel.bean.Funcionario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-07-02T11:45:19")
@StaticMetamodel(Aluguel.class)
public class Aluguel_ { 

    public static volatile SingularAttribute<Aluguel, Long> id;
    public static volatile SingularAttribute<Aluguel, Integer> quantidade;
    public static volatile SingularAttribute<Aluguel, Cliente> fkCliente;
    public static volatile SingularAttribute<Aluguel, Double> valor;
    public static volatile SingularAttribute<Aluguel, Date> dataLocao;
    public static volatile SingularAttribute<Aluguel, Funcionario> fkFuncionario;
    public static volatile SingularAttribute<Aluguel, Equipamento> fkEquipamento;

}
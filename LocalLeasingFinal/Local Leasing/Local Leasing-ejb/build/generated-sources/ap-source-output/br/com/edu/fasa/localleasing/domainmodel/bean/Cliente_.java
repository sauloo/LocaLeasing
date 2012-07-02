package br.com.edu.fasa.localleasing.domainmodel.bean;

import br.com.edu.fasa.localleasing.domainmodel.bean.Contato;
import br.com.edu.fasa.localleasing.domainmodel.bean.Endereco;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.3.0.v20110604-r9504", date="2012-07-02T11:45:19")
@StaticMetamodel(Cliente.class)
public class Cliente_ { 

    public static volatile SingularAttribute<Cliente, Long> id;
    public static volatile SingularAttribute<Cliente, Contato> contato;
    public static volatile SingularAttribute<Cliente, String> nome;
    public static volatile SingularAttribute<Cliente, String> cpf;
    public static volatile SingularAttribute<Cliente, String> cnpj;
    public static volatile SingularAttribute<Cliente, Endereco> endereco;

}
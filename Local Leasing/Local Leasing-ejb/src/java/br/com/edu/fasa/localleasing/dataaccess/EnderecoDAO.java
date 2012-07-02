/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Endereco;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEndereco;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class EnderecoDAO extends GenericDAO<Endereco> implements IEndereco {
    
    public EnderecoDAO(){
        super(Endereco.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected Long getID(Endereco obj) {
        return obj.getId();
    }
    
}

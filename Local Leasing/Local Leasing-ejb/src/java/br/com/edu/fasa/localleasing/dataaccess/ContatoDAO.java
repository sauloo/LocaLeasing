/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Contato;
import br.com.edu.fasa.localleasing.domainmodel.repository.IContato;
import javax.ejb.Stateless;


/**
 *
 * @author Alexsander Duarte
 */
@Stateless
public class ContatoDAO extends GenericDAO<Contato> implements IContato {
    
    public ContatoDAO(){
        super(Contato.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected Long getID(Contato obj) {
        return obj.getId();
    }
    
}

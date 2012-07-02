/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.dataaccess;

import br.com.edu.fasa.localleasing.domainmodel.bean.Estoque;
import br.com.edu.fasa.localleasing.domainmodel.repository.IEstoque;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class EstoqueDAO extends GenericDAO<Estoque> implements IEstoque {
    
    public EstoqueDAO(){
        super(Estoque.class);
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    protected Long getID(Estoque obj) {
        return obj.getId();
    }
    
}

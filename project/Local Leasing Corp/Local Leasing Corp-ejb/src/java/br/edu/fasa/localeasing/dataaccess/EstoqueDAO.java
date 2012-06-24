/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.EstoqueBean;
import br.edu.fasa.localeasing.domainmodel.repository.IEstoque;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class EstoqueDAO extends GenericDAO<EstoqueBean> implements IEstoque {
    
    public EstoqueDAO(){
        super(EstoqueBean.class);
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.ContatoBean;
import br.edu.fasa.localeasing.domainmodel.repository.IContato;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class ContatoDAO extends GenericDAO<ContatoBean> implements IContato {
    
    public ContatoDAO(){
        super(ContatoBean.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.EnderecoBean;
import br.edu.fasa.localeasing.domainmodel.repository.IEndereco;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class EnderecoDAO extends GenericDAO<EnderecoBean> implements IEndereco {
    
    public EnderecoDAO(){
        super(EnderecoBean.class);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

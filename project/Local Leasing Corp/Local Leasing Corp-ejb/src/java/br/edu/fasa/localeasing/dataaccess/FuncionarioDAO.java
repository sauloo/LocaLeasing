/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.FuncionarioBean;
import br.edu.fasa.localeasing.domainmodel.repository.IFuncionario;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class FuncionarioDAO extends GenericDAO<FuncionarioBean> implements IFuncionario{
    
    public FuncionarioDAO(){
        super(FuncionarioBean.class);
    }
            

    @Override
    public List<FuncionarioBean> listarFuncionarioPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.AluguelBean;
import br.edu.fasa.localeasing.domainmodel.bean.ClienteBean;
import br.edu.fasa.localeasing.domainmodel.bean.FuncionarioBean;
import br.edu.fasa.localeasing.domainmodel.repository.IAluguel;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class AluguelDAO extends GenericDAO<AluguelBean> implements IAluguel {

    public AluguelDAO(){
        super(AluguelBean.class);
    }
    
    @Override
    public List<AluguelBean> listaAluguemPorData(Date di, Date df) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<AluguelBean> produtosAlugados() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<AluguelBean> clientesPossuiAluguel(ClienteBean obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<AluguelBean> funcionariosPossuemAluguel(FuncionarioBean obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

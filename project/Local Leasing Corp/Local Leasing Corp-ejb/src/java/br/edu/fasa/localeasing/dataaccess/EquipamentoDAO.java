/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.dataaccess;

import br.edu.fasa.localeasing.domainmodel.bean.EquipamentoBean;
import br.edu.fasa.localeasing.domainmodel.repository.IEquipamento;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Alexsander Duarte
 */
@Stateless
@LocalBean
public class EquipamentoDAO extends GenericDAO<EquipamentoBean> implements IEquipamento {
    
    public EquipamentoDAO(){
        super(EquipamentoBean.class);
    }

    @Override
    public List<EquipamentoBean> listarEquipamentosPorModelo(String modelo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<EquipamentoBean> listarEquipamentosPorMarca(String marca) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<EquipamentoBean> listarEquipamentoStatus(int status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void alteraStatusEquipamento(int status) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}

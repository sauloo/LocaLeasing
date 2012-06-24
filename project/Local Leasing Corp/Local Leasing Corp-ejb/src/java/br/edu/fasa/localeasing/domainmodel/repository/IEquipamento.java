/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fasa.localeasing.domainmodel.repository;

import br.edu.fasa.localeasing.domainmodel.bean.EquipamentoBean;
import java.util.List;

/**
 *
 * @author Alexsander Duarte
 */
public interface IEquipamento extends IRepositorio<EquipamentoBean> {

    List<EquipamentoBean> listarEquipamentosPorModelo(String modelo);
    
    List<EquipamentoBean> listarEquipamentosPorMarca(String marca);
    
    List<EquipamentoBean> listarEquipamentoStatus(int status);
    
    void alteraStatusEquipamento(int status);
    
}

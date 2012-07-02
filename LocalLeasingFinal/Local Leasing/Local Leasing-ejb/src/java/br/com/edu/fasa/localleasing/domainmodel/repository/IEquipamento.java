/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.repository;

import br.com.edu.fasa.localleasing.domainmodel.bean.Equipamento;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Alexsander Duarte
 */

@Remote
public interface IEquipamento extends IRepositorio<Equipamento> {

    List<Equipamento> listarEquipamentosPorModelo(String modelo);
    
    List<Equipamento> listarEquipamentosPorMarca(String marca);
    
    List<Equipamento> listarEquipamentoStatus(int status);
    
    void alteraStatusEquipamento(Long id, int status);
    
}

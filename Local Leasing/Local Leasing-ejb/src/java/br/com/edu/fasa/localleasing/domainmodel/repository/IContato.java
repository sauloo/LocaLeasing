/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.edu.fasa.localleasing.domainmodel.repository;

import br.com.edu.fasa.localleasing.domainmodel.bean.Contato;
import javax.ejb.Remote;

/**
 *
 * @author Alexsander Duarte
 */
@Remote
public interface IContato extends IRepositorio<Contato> {
    
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import ClassesBasicas.OrdemServico;
import java.util.ArrayList;
/**
 *
 * @author Afonso
 */
public interface InterfaceOrdemServico {
    int  contarOrdemServico (OrdemServico orderServico) throws Exception;
    void cadastrarOrdemServico(OrdemServico ordemServico) throws Exception;
    void editarOrdemServico (OrdemServico ordemServico) throws Exception;   
    void removerOrdemServico (OrdemServico ordemServico) throws Exception;
    void editarOrdemServicoPorCPF (OrdemServico ordemServicoNova, OrdemServico ordemServicoVelha) throws Exception;   
    void cancelarOrdemServico (OrdemServico ordemServico) throws Exception;
    void solucionarOrdemServico (OrdemServico ordemServico) throws Exception;
    ArrayList <OrdemServico> listarOrdemServico (OrdemServico ordemServico) throws Exception;
    ArrayList <OrdemServico> listarOrdemServicoAberta (OrdemServico ordemServico) throws Exception;
}

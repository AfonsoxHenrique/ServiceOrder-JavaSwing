/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import ClassesBasicas.OrdemServico;
import Dados.DadosOrdemServico;
import Interfaces.InterfaceOrdemServico;
import java.util.ArrayList;

/**
 *
 * @author Afonso
 */
public class NegocioOrdemServico implements InterfaceOrdemServico{

    @Override
    public void cadastrarOrdemServico(OrdemServico ordemServico) throws Exception 
    {
        if(ordemServico.getDescricaoProblema() == null || ordemServico.getDescricaoProblema().equals(""))           
        {
            throw new Exception ("Descreva a descrição do problema");
        }
        if(ordemServico.getCliente().getCpf() == null || ordemServico.getCliente().getCpf().equals(""))
        {
            throw new Exception ("Selecione o cliente");
        }
        if(ordemServico.getFuncionario().getMatricula() <= 0)
        {
            throw new Exception ("Selecione o funcionário");
        }
        if(String.valueOf(ordemServico.getClassificacaoProblema().getCod_ClassProblema()).equals(""))
        {
            throw new Exception ("Selecione o problema");
        }
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.cadastrarOrdemServico(ordemServico);
    }

    @Override
    public void editarOrdemServico(OrdemServico ordemServico) throws Exception {
        if(String.valueOf(ordemServico.getFuncionario().getMatricula()).equals(""))
        {
            throw new Exception ("Selecione a OS");
        }
        if(ordemServico.getDescricaoProblema() == null && ordemServico.getDescricaoProblema().equals(""))           
        {
            throw new Exception ("Selecione a OS");
        }
        if(ordemServico.getCliente().getCpf() == null && ordemServico.getCliente().getCpf().equals(""))
        {
            throw new Exception ("Selecione a OS");
        }
        if(String.valueOf(ordemServico.getClassificacaoProblema().getCod_ClassProblema()).equals(""))
        {
            throw new Exception ("Selecione a OS");
        }
        if(ordemServico.getNumero() <= 0 )
        {
            throw new Exception ("Selecione a OS");
        }
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.editarOrdemServico(ordemServico);
    }


    @Override
    public ArrayList<OrdemServico> listarOrdemServico(OrdemServico ordemServico) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        return dadosOrdem.listarOrdemServico(ordemServico);
    }

    @Override
    public void cancelarOrdemServico(OrdemServico ordemServico) throws Exception 
    {
        if(ordemServico.getNumero() <= 0 )
        {
            throw new Exception ("Selecione a OS");
        }
        if(ordemServico.getMotivoCancelamento() == null || ordemServico.getMotivoCancelamento().equals(""))
        {
            throw new Exception ("Descreva o motivo do cancelamento");
        }
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.cancelarOrdemServico(ordemServico);
    }

    @Override
    public void solucionarOrdemServico(OrdemServico ordemServico) throws Exception 
    {
        if(ordemServico.getNumero() <= 0 )
        {
            throw new Exception ("Selecione a OS");
        }
        if(ordemServico.getDescricaoServico() == null || ordemServico.getDescricaoServico().equals(""))
        {
            throw new Exception ("Descreva o serviço fornecido");
        }
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.solucionarOrdemServico(ordemServico);
    }

    @Override
    public int contarOrdemServico(OrdemServico orderServico) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editarOrdemServicoPorCPF(OrdemServico ordemServicoNova, OrdemServico ordemServicoVelha) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.editarOrdemServicoPorCPF(ordemServicoNova, ordemServicoVelha);
    }

    @Override
    public ArrayList<OrdemServico> listarOrdemServicoAberta(OrdemServico ordemServico) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        return dadosOrdem.listarOrdemServicoAberta(ordemServico);
    }

    @Override
    public void removerOrdemServico(OrdemServico ordemServico) throws Exception {
        DadosOrdemServico dadosOrdem = new DadosOrdemServico();
        dadosOrdem.removerOrdemServico(ordemServico);
    }
    

    
}

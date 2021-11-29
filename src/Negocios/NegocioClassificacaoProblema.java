/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import ClassesBasicas.ClassificacaoProblema;
import Dados.DadosClassificacaoProblema;
import Interfaces.InterfaceClassProblema;
import java.util.ArrayList;

/**
 *
 * @author Afonso
 */
public class NegocioClassificacaoProblema implements InterfaceClassProblema{

    @Override
    public void cadastrarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
        if(classificacaoProblema.getDescricao() == null || classificacaoProblema.getDescricao().equals(""))
        {
            throw new Exception ("Digite a descrição");
        }
        if(classificacaoProblema.getNomeClassProblema() == null || classificacaoProblema.getNomeClassProblema().equals(""))
        {
            throw new Exception ("Digite o nome");
        }
        DadosClassificacaoProblema dadosClass = new DadosClassificacaoProblema();
        dadosClass.cadastrarClassProblema(classificacaoProblema);
    }

    @Override
    public void editarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception 
    {
        if(classificacaoProblema.getDescricao() == null || classificacaoProblema.getDescricao().equals(""))
        {
            throw new Exception ("Digite a descrição");
        }
        if(classificacaoProblema.getNomeClassProblema() == null || classificacaoProblema.getNomeClassProblema().equals(""))
        {
            throw new Exception ("Digite o nome");
        }
        if(classificacaoProblema.getCod_ClassProblema() <= 0)
        {
            throw new Exception ("Selecione o código");
        }
        DadosClassificacaoProblema dadosClass = new DadosClassificacaoProblema();
        dadosClass.editarClassProblema(classificacaoProblema);
    }

    @Override
    public void excluirClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
        DadosClassificacaoProblema dadosClass = new DadosClassificacaoProblema();
        dadosClass.excluirClassProblema(classificacaoProblema);
    }

    @Override
    public ArrayList<ClassificacaoProblema> listarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
        DadosClassificacaoProblema dadosClass = new DadosClassificacaoProblema();
        return dadosClass.listarClassProblema(classificacaoProblema);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import ClassesBasicas.ClassificacaoProblema;
import java.util.ArrayList;

/**
 *
 * @author Afonso
 */
public interface InterfaceClassProblema {

    void cadastrarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception;

    void editarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception;

    void excluirClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception;

    ArrayList<ClassificacaoProblema> listarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception;
}

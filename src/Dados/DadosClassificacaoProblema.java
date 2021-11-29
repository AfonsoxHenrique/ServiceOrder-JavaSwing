/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import ClassesBasicas.ClassificacaoProblema;
import Interfaces.InterfaceClassProblema;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author AfonsoeAna
 */
public class DadosClassificacaoProblema extends Dados implements InterfaceClassProblema{

    @Override
    public void cadastrarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
        abrirConexao();
        
        String SQL = "Insert Into classificacaoproblema (descricao, nome)";
        SQL += "Values (?,?)";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setString(1, classificacaoProblema.getDescricao());
        preparedStatement.setString(2, classificacaoProblema.getNomeClassProblema());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public void editarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
        abrirConexao();
        
        String SQL = "Update classificacaoproblema Set nome = ?, descricao = ? Where codigo = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setString(1, classificacaoProblema.getNomeClassProblema());
        preparedStatement.setString(2, classificacaoProblema.getDescricao());
        preparedStatement.setInt(3, classificacaoProblema.getCod_ClassProblema());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public void excluirClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
        abrirConexao();
        
        String SQL = "Delete From classificacaoproblema Where codigo = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setInt(1, classificacaoProblema.getCod_ClassProblema());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public ArrayList<ClassificacaoProblema> listarClassProblema(ClassificacaoProblema classificacaoProblema) throws Exception {
       abrirConexao();
        ArrayList<ClassificacaoProblema> retorno = new ArrayList<>();
        String sql = " Select codigo, descricao, nome ";
        sql += " From classificacaoproblema ";
        sql += " Where 0 = 0 ";
        
        if (classificacaoProblema.getDescricao() != null && classificacaoProblema.getDescricao().trim().equals("") == false) {
            sql += " and descricao LIKE  ? " ;
        }
         if (classificacaoProblema.getNomeClassProblema()!= null && classificacaoProblema.getNomeClassProblema().trim().equals("") == false) {
            sql += " and nome LIKE  ? " ;
        }
          if (classificacaoProblema.getCod_ClassProblema()!= 0) {
            sql += " and codigo = ? " ;
        }
        
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (classificacaoProblema.getDescricao() != null && classificacaoProblema.getDescricao().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + classificacaoProblema.getDescricao() +"%") ;
            pos++;
        }
        if (classificacaoProblema.getNomeClassProblema()!= null && classificacaoProblema.getNomeClassProblema().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +classificacaoProblema.getNomeClassProblema()+"%");
            pos++;
        }
        if (classificacaoProblema.getCod_ClassProblema()!= 0) {
            preparedStatement.setDouble(pos, classificacaoProblema.getCod_ClassProblema());
            pos++;
        }
        
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            ClassificacaoProblema cl = new ClassificacaoProblema();
            cl.setCod_ClassProblema(resultado.getInt("codigo"));
            cl.setDescricao(resultado.getString("descricao"));
            cl.setNomeClassProblema(resultado.getString("nome"));
            retorno.add(cl);
        }
        fecharConexao();
        return retorno;
    }    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;
import ClassesBasicas.Funcionario;
import Interfaces.InterfaceFuncionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
/**
 *
 * @author AfonsoeAna
 */
public class DadosFuncionario extends Dados implements InterfaceFuncionario{

    @Override
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        abrirConexao();
        
        String SQL = "Insert Into funcionario (matricula, salario, nome, rg, cpf)";
        SQL += "Values (?,?,?,?,?)";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setInt(1, funcionario.getMatricula());
        preparedStatement.setDouble(2, funcionario.getSalario());
        preparedStatement.setString(3, funcionario.getNome());
        preparedStatement.setString(4, funcionario.getRg());
        preparedStatement.setString(5, funcionario.getCpf());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public void editarFuncionario(Funcionario funcionario) throws Exception {
        abrirConexao();
        
        String SQL = "Update funcionario Set salario = ?, nome = ?, cpf = ?, rg = ? Where matricula = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setDouble(1, funcionario.getSalario());
        preparedStatement.setString(2, funcionario.getNome());
        preparedStatement.setString(3, funcionario.getCpf());
        preparedStatement.setString(4, funcionario.getRg());       
        preparedStatement.setInt(5, funcionario.getMatricula());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();        
    }

    @Override
    public void excluirFuncionario(Funcionario funcionario) throws Exception {
        abrirConexao();
        
        String SQL = "Delete From funcionario Where matricula = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);

        preparedStatement.setInt(1, funcionario.getMatricula());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();    
    }

    @Override
    public ArrayList<Funcionario> listarFuncionario(Funcionario funcionario) throws Exception {
        abrirConexao();
        ArrayList<Funcionario> retorno = new ArrayList<>();
        String sql = " Select cpf, nome, rg, salario, matricula ";
        sql += " From funcionario ";
        sql += " Where 0 = 0 ";
        
        if (funcionario.getCpf() != null && funcionario.getCpf().trim().equals("") == false) {
            sql += " and cpf LIKE  ? " ;
        }
        if (funcionario.getNome()!= null && funcionario.getNome().trim().equals("") == false) {
            sql += " and nome LIKE  ? " ;
        }
        if (funcionario.getRg()!= null && funcionario.getRg().trim().equals("") == false) {
            sql += " and rg LIKE  ? " ;
        }
        if(funcionario.getSalario() != 0)
        {
            sql += " and salario = ? " ;
        }
        if(funcionario.getMatricula() != 0)
        {
            sql += " and matricula = ? " ;
        }
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if (funcionario.getCpf() != null && funcionario.getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + funcionario.getCpf() +"%") ;
            pos++;
        }
        if (funcionario.getNome()!= null && funcionario.getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +funcionario.getNome()+"%");
            pos++;
        }
        if (funcionario.getRg() != null && funcionario.getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + funcionario.getRg()+"%");
            pos++;
        }
        if(funcionario.getSalario() != 0)
        {
           preparedStatement.setDouble(pos, funcionario.getSalario());
           pos++; 
        }
        if(funcionario.getMatricula() != 0)
        {
            preparedStatement.setInt(pos, funcionario.getMatricula());
           pos++; 
        }
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            Funcionario f = new Funcionario();
            f.setMatricula(resultado.getInt("matricula"));
            f.setSalario(resultado.getDouble("salario"));
            f.setCpf(resultado.getString("cpf"));
            f.setNome(resultado.getString("nome"));
            f.setRg(resultado.getString("rg"));
            retorno.add(f);
        }
        fecharConexao();
        return retorno;
    }
    

    @Override
    public int contarFuncionario(Funcionario funcionario) throws Exception {
        abrirConexao();
        
        String SQL = "Select Count(*) As 'Total' From funcionario";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while(resultSet.next())
        {
            return resultSet.getInt("Total");
        }
        return 0;
    }
    
    public boolean verificaUso(Funcionario funcionario) throws Exception {
        boolean retorno = false;
        abrirConexao();
        String sql = "Select distinct matricula_funcionario from ordemservico Where matricula_funcionario  = ? ";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        preparedStatement.setInt(1, funcionario.getMatricula());
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            retorno = true;
            break;
        }
        fecharConexao();
        return retorno;
    }
}

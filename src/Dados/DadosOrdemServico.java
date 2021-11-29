/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

import ClassesBasicas.OrdemServico;
import Interfaces.InterfaceOrdemServico;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author AfonsoeAna
 */
public class DadosOrdemServico extends Dados implements InterfaceOrdemServico{

    @Override
    public void cadastrarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        
        String SQL = " Insert Into ordemservico (datacadastro, descricaoproblema, cpf_cliente, codigo_classificacao, matricula_funcionario) ";
        SQL += " Values (?,?,?,?,?) ";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setDate(1, (Date) ordemServico.getDataCadastro());
        preparedStatement.setString(2, ordemServico.getDescricaoProblema());
        preparedStatement.setString(3, ordemServico.getCliente().getCpf());
        preparedStatement.setInt(4, ordemServico.getClassificacaoProblema().getCod_ClassProblema());
        preparedStatement.setInt(5, ordemServico.getFuncionario().getMatricula());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public void editarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        
        String SQL = "Update ordemservico Set datacadastro = ?, descricaoproblema = ?, cpf_cliente = ?, codigo_classificacao = ?, matricula_funcionario = ? Where numero = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setDate(1, (Date) ordemServico.getDataCadastro());
        preparedStatement.setString(2, ordemServico.getDescricaoProblema());
        preparedStatement.setString(3, ordemServico.getCliente().getCpf());
        preparedStatement.setInt(4, ordemServico.getClassificacaoProblema().getCod_ClassProblema());
        preparedStatement.setInt(5, ordemServico.getFuncionario().getMatricula());
        preparedStatement.setInt(6, ordemServico.getNumero());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }


    @Override
    public ArrayList<OrdemServico> listarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        ArrayList<OrdemServico> retorno = new ArrayList<>();
        String sql = "Select Os.numero as numeroOrdem, Os.motivocancelamento as motivoCancelamentoOrdem, Os.datacadastro as dataCadastroOrdem, Os.datasolucao as dataSolucaoOrdem, \n" +
        "Os.descricaoproblema as descProblemaOrdem, Os.descricaoservico as descServicoOrdem, Os.datacancelamento as dataCancelamentoOrdem, \n" +
        "\n" +
        "Fun.matricula As matriculafuncionario, Fun.salario as salariofuncionario, Fun.nome as nomefuncionario, Fun.rg as rgfuncionario, Fun.cpf as cpffuncionario, \n" +
        "\n" +
        "Cli.cpf as cpfcliente, Cli.nome as nomecliente, Cli.rg as rgcliente, \n" +
        "\n" +
        "ClassP.codigo as codigoclassProblema, ClassP.nome as nomeClassProblema, ClassP.descricao as descricaoClassProblema\n" +
        "\n" +  
        "\n" +
        "FROM ordemservico As Os \n" +
        "Join cliente As Cli On Os.cpf_cliente = Cli.cpf \n" +
        "Join funcionario As Fun on Os.matricula_funcionario = Fun.matricula \n" +
        "Join classificacaoproblema As ClassP On Os.codigo_classificacao = ClassP.codigo \n" +
        "WHERE numero > 0";
        if(ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false){
            sql += " and Cli.cpf LIKE  ? ";
        }
        if(ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false){
            sql += " and Cli.rg LIKE  ? ";
        }
        if(ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false){
            sql += " and Cli.nome LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            sql += " and Fun.cpf LIKE  ? " ;
        }
        if (ordemServico.getFuncionario().getNome()!= null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            sql += " and Fun.nome LIKE  ? " ;
        }
        if (ordemServico.getFuncionario().getRg()!= null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            sql += " and Fun.rg LIKE  ? " ;
        }
        if(ordemServico.getFuncionario().getSalario() != 0)
        {
            sql += " and Fun.salario = ? " ;
        }
        if(ordemServico.getFuncionario().getMatricula() != 0)
        {
            sql += " and Fun.matricula = ? " ;
        }
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if(ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false){
            preparedStatement.setString(pos, "%"+ordemServico.getCliente().getCpf()+"%") ;
            pos++;
        }
        if(ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false){
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getRg() +"%") ;
            pos++;
        }
        if(ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false){
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getNome() +"%") ;
            pos++;
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getCpf() +"%") ;
            pos++;
        }
        if (ordemServico.getFuncionario().getNome()!= null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +ordemServico.getFuncionario().getNome()+"%");
            pos++;
        }
        if (ordemServico.getFuncionario().getRg() != null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getRg()+"%");
            pos++;
        }
        if(ordemServico.getFuncionario().getSalario() != 0)
        {
           preparedStatement.setDouble(pos, ordemServico.getFuncionario().getSalario());
           pos++; 
        }
        if(ordemServico.getFuncionario().getMatricula() != 0)
        {
           preparedStatement.setInt(pos, ordemServico.getFuncionario().getMatricula());
           pos++; 
        }
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            OrdemServico od = new OrdemServico();
            od.setNumero(resultado.getInt("numeroOrdem"));
            od.setMotivoCancelamento(resultado.getString("motivoCancelamentoOrdem"));
            od.setDataCadastro(resultado.getDate("dataCadastroOrdem"));
            od.setDataSolucao(resultado.getDate("dataSolucaoOrdem"));
            od.setDescricaoProblema(resultado.getString("descProblemaOrdem"));
            od.setDescricaoServico(resultado.getString("descServicoOrdem"));
            od.setDatacancelamento(resultado.getDate("dataCancelamentoOrdem"));
            od.getFuncionario().setMatricula(resultado.getInt("matriculafuncionario"));
            od.getCliente().setCpf(resultado.getString("cpfcliente"));
            od.getClassificacaoProblema().setCod_ClassProblema(resultado.getInt("codigoclassProblema"));
            
            od.getCliente().setNome(resultado.getString("nomecliente"));
            od.getCliente().setRg(resultado.getString("rgcliente"));
            od.getFuncionario().setSalario(resultado.getDouble("salariofuncionario"));
            od.getFuncionario().setNome(resultado.getString("nomefuncionario"));
            od.getFuncionario().setRg(resultado.getString("rgfuncionario"));
            od.getFuncionario().setCpf(resultado.getString("cpffuncionario"));
            od.getClassificacaoProblema().setNomeClassProblema(resultado.getString("nomeClassProblema"));
            od.getClassificacaoProblema().setDescricao(resultado.getString("descricaoClassProblema"));
            retorno.add(od);
        }
        fecharConexao();
        return retorno;
    }


    @Override
    public void cancelarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        
        String SQL = "Update ordemservico Set datacancelamento = ?, motivocancelamento = ? Where numero = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setDate(1, (Date) ordemServico.getDatacancelamento());
        preparedStatement.setString(2, ordemServico.getMotivoCancelamento());
        preparedStatement.setInt(3, ordemServico.getNumero());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public void solucionarOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        
        String SQL = "Update ordemservico Set datasolucao = ?, descricaoservico = ? Where numero = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setDate(1, (Date) ordemServico.getDataSolucao());
        preparedStatement.setString(2, ordemServico.getDescricaoServico());
        preparedStatement.setInt(3, ordemServico.getNumero());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public int contarOrdemServico(OrdemServico orderServico) throws Exception {
        abrirConexao();
        
        String SQL = "Select Count(*) As 'Total' From ordemservico";
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        
        ResultSet resultSet = preparedStatement.executeQuery();
        
        while (resultSet.next())
        {
            return resultSet.getInt("Total");
        }
        return 0;
    }

    @Override
    public void editarOrdemServicoPorCPF(OrdemServico ordemServicoNova, OrdemServico ordemServicoVelha) throws Exception 
    {
        abrirConexao();
        
        String SQL = "Update ordemservico Set cpf_cliente = ? Where cpf_cliente = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        preparedStatement.setString(1, ordemServicoNova.getCliente().getCpf());
        preparedStatement.setString(2, ordemServicoVelha.getCliente().getCpf());
        preparedStatement.executeUpdate();
        
        fecharConexao();
    }

    @Override
    public ArrayList<OrdemServico> listarOrdemServicoAberta(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        ArrayList<OrdemServico> retorno = new ArrayList<>();
        String sql = "Select Os.numero as numeroOrdem, Os.motivocancelamento as motivoCancelamentoOrdem, Os.datacadastro as dataCadastroOrdem, Os.datasolucao as dataSolucaoOrdem, \n" +
        "Os.descricaoproblema as descProblemaOrdem, Os.descricaoservico as descServicoOrdem, Os.datacancelamento as dataCancelamentoOrdem, \n" +
        "\n" +
        "Fun.matricula As matriculafuncionario, Fun.salario as salariofuncionario, Fun.nome as nomefuncionario, Fun.rg as rgfuncionario, Fun.cpf as cpffuncionario, \n" +
        "\n" +
        "Cli.cpf as cpfcliente, Cli.nome as nomecliente, Cli.rg as rgcliente, \n" +
        "\n" +
        "ClassP.codigo as codigoclassProblema, ClassP.nome as nomeClassProblema, ClassP.descricao as descricaoClassProblema\n" +
        "\n" +  
        "\n" +
        "FROM ordemservico As Os \n" +
        "Join cliente As Cli On Os.cpf_cliente = Cli.cpf \n" +
        "Join funcionario As Fun on Os.matricula_funcionario = Fun.matricula \n" +
        "Join classificacaoproblema As ClassP On Os.codigo_classificacao = ClassP.codigo \n" +
        "WHERE Os.motivocancelamento Is Null And Os.datasolucao Is Null And Os.datacancelamento Is Null And Os.descricaoservico Is Null  ";
        if(ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false){
            sql += " and Cli.cpf LIKE  ? ";
        }
        if(ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false){
            sql += " and Cli.rg LIKE  ? ";
        }
        if(ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false){
            sql += " and Cli.nome LIKE  ? ";
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            sql += " and Fun.cpf LIKE  ? " ;
        }
        if (ordemServico.getFuncionario().getNome()!= null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            sql += " and Fun.nome LIKE  ? " ;
        }
        if (ordemServico.getFuncionario().getRg()!= null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            sql += " and Fun.rg LIKE  ? " ;
        }
        if(ordemServico.getFuncionario().getSalario() != 0)
        {
            sql += " and Fun.salario = ? " ;
        }
        if(ordemServico.getFuncionario().getMatricula() != 0)
        {
            sql += " and Fun.matricula = ? " ;
        }
        PreparedStatement preparedStatement = conn.prepareStatement(sql);
        
        int pos = 1;
        
        if(ordemServico.getCliente().getCpf() != null && ordemServico.getCliente().getCpf().trim().equals("") == false){
            preparedStatement.setString(pos, "%"+ordemServico.getCliente().getCpf()+"%") ;
            pos++;
        }
        if(ordemServico.getCliente().getRg() != null && ordemServico.getCliente().getRg().trim().equals("") == false){
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getRg() +"%") ;
            pos++;
        }
        if(ordemServico.getCliente().getNome() != null && ordemServico.getCliente().getNome().trim().equals("") == false){
            preparedStatement.setString(pos, "%" + ordemServico.getCliente().getNome() +"%") ;
            pos++;
        }
        if (ordemServico.getFuncionario().getCpf() != null && ordemServico.getFuncionario().getCpf().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getCpf() +"%") ;
            pos++;
        }
        if (ordemServico.getFuncionario().getNome()!= null && ordemServico.getFuncionario().getNome().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" +ordemServico.getFuncionario().getNome()+"%");
            pos++;
        }
        if (ordemServico.getFuncionario().getRg() != null && ordemServico.getFuncionario().getRg().trim().equals("") == false) {
            preparedStatement.setString(pos, "%" + ordemServico.getFuncionario().getRg()+"%");
            pos++;
        }
        if(ordemServico.getFuncionario().getSalario() != 0)
        {
           preparedStatement.setDouble(pos, ordemServico.getFuncionario().getSalario());
           pos++; 
        }
        if(ordemServico.getFuncionario().getMatricula() != 0)
        {
           preparedStatement.setInt(pos, ordemServico.getFuncionario().getMatricula());
           pos++; 
        }
        ResultSet resultado = preparedStatement.executeQuery();
        while (resultado.next()) {
            OrdemServico od = new OrdemServico();
            od.setNumero(resultado.getInt("numeroOrdem"));
            od.setMotivoCancelamento(resultado.getString("motivoCancelamentoOrdem"));
            od.setDataCadastro(resultado.getDate("dataCadastroOrdem"));
            od.setDataSolucao(resultado.getDate("dataSolucaoOrdem"));
            od.setDescricaoProblema(resultado.getString("descProblemaOrdem"));
            od.setDescricaoServico(resultado.getString("descServicoOrdem"));
            od.setDatacancelamento(resultado.getDate("dataCancelamentoOrdem"));
            od.getFuncionario().setMatricula(resultado.getInt("matriculafuncionario"));
            od.getCliente().setCpf(resultado.getString("cpfcliente"));
            od.getClassificacaoProblema().setCod_ClassProblema(resultado.getInt("codigoclassProblema"));
            
            od.getCliente().setNome(resultado.getString("nomecliente"));
            od.getCliente().setRg(resultado.getString("rgcliente"));
            od.getFuncionario().setSalario(resultado.getDouble("salariofuncionario"));
            od.getFuncionario().setNome(resultado.getString("nomefuncionario"));
            od.getFuncionario().setRg(resultado.getString("rgfuncionario"));
            od.getFuncionario().setCpf(resultado.getString("cpffuncionario"));
            od.getClassificacaoProblema().setNomeClassProblema(resultado.getString("nomeClassProblema"));
            od.getClassificacaoProblema().setDescricao(resultado.getString("descricaoClassProblema"));
            retorno.add(od);
        }
        fecharConexao();
        return retorno;
    }

    @Override
    public void removerOrdemServico(OrdemServico ordemServico) throws Exception {
        abrirConexao();
        
        String SQL = "Delete From ordemservico Where numero = ?";
        
        PreparedStatement preparedStatement = conn.prepareStatement(SQL);
        
        preparedStatement.setInt(1, ordemServico.getNumero());
        
        preparedStatement.executeUpdate();
        
        fecharConexao();
        
    }

   
    

}

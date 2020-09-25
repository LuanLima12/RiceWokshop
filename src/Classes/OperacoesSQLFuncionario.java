/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.sql.SQLException;
import java.sql.Statement;
// NÃO DEU CERTO
/**
 *
 * @author Luan
 */
public class OperacoesSQLFuncionario extends CriarBancoSQLite {

    public OperacoesSQLFuncionario(ConexaoSQLite pConexaoSQLite) {
        super(pConexaoSQLite);
    }
    
    public void funcionarioInsert(String nome, String email, String cpf, String fone, String cargo, String anoNascimento){
        String sql = "INSERT INTO tbl_funcionarios ( "
                + "nome, "
                + "email, "
                + "cpf, "
                + "fone, "
                + "cargo,"
                + "anoNascimento)"
                + "VALUES("
                + "'" + nome +"',"
                + "'" + email +"',"
                + "'" + cpf +"',"
                + "'" + fone +"',"
                + "'" + cargo +"',"
                + "'" + anoNascimento +"')"
                + ";";
        
       boolean conectou = false;
       
       try{
           //SE CONECTOU CORRETAMENTE
           conectou = this.conexaoSQLite.conectar();
           //SE CONECTOU, CRIARA O STATEMENT
           Statement stmt = this.conexaoSQLite.criarStatement();
           //O STATEMENT EXECUTA O SQL
           stmt.execute(sql);
           
           //System.out.println("Tabela funcionario criada.");
           
       }catch(SQLException e){
           
       } finally{
           if(conectou){
               //SE A CONEXÃO FOI FEITA, A FECHA
               this.conexaoSQLite.desconectar();
           }
       }
    }
    
}

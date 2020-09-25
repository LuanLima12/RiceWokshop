/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Luan
 */
public class DadosFuncionario {
    public boolean validarUsuario(String usuario, String senha){
        if(usuario.equals("entrar")&& senha.equals("1234")){
            return true;
        }else{
            return false;
        }
    }
}

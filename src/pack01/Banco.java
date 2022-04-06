/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack01;

import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author gabs
 */
public class Banco {
    public int codigo;
    public int conta;
    public int agencia;
    public String tipo;
    public double saldo;
    public double taxaSaque = this.taxaSaque;

    public double Depositar(double valor){
        this.saldo += valor;
        return this.saldo;
    }

    public double Sacar(double valor){
        double dif = this.saldo - valor - this.taxaSaque;
        if(this.saldo < valor || dif < 0){
            JOptionPane.showMessageDialog(null,"Erro ao sacar. Você não tem saldo suficiente. (Consultar taxas de saque)","Saldo insuficiente",WARNING_MESSAGE);
            return 0;
        }else {
            if(this.tipo.equals("Corrente")){
                this.saldo -= this.taxaSaque;
            }
            this.saldo -= valor;
            return this.saldo;
        }
    }
}

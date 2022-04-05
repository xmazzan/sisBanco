/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack01;

/**
 *
 * @author gabs
 */
public class Teste {
    public static void main(String[] args) {
        Banco bb = new Banco();
        bb.codigo = 1;
        bb.conta = 1014;
        bb.agencia = 1514;
        bb.saldo = 100;
        bb.tipo = "Poupança";
        bb.Depositar(1000);
        System.out.println("Conta: "+bb.conta);
        System.out.println("Agencia: "+bb.agencia);
        System.out.println("Saldo atual: "+bb.saldo);
        System.out.println("---------------------");
        Banco st = new Banco();
        st.codigo = 2;
        st.conta = 1011;
        st.agencia = 123;
        st.saldo = 0;
        st.tipo = "Corrente";
        st.Depositar(4000);
        System.out.println("Conta: "+st.conta);
        System.out.println("Agencia: "+st.agencia);
        System.out.println("Saldo atual: "+st.saldo);
        System.out.println("---------------------");
        st.Sacar(2000);
        System.out.println("Conta: "+st.conta);
        System.out.println("Agencia: "+st.agencia);
        System.out.println("Saldo atual: "+st.saldo);
        
        System.out.println("---------------------");
        
    }
}

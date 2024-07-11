/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campominado;

/**
 *
 * @author erick.ssouza
 */
public class CampoMinado {
    
    
    public static void main(String[] args) {
        Logica logica = new Logica();
        logica.imprimirTabuleiro();
        System.out.println("Tabuleiro atualizado");
        logica.atualizaValores();
    }
}

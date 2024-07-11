/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campominado;

/**
 *
 * @author erick.ssouza
 */
public class Logica {
    
    private int valores[][];
    
    public Logica(){
        this.valores = new int[10][10];
        inicializaValores();
        gerarBombas(10);
        atualizaValores();
    }
    
    public void inicializaValores(){
       for(int i = 0; i < 10; ++i){
           for(int j = 0; j < 10; ++j){
               this.valores[i][j] = 0;
           }
       } 
    }
    
    public void gerarBombas(int qtdBombas){
        int linha, coluna;
        
        while(qtdBombas > 0){
            linha = (int) Math.floor(Math.random() * 10);
            coluna = (int) Math.floor(Math.random() * 10);
            if(this.valores[linha][coluna] != 9){
                this.valores[linha][coluna] = 9;
                --qtdBombas;
            }
        }
    }
    
    public void imprimirTabuleiro(){
       for(int i = 0; i < 10; ++i){
           for(int j = 0; j < 10; ++j){
               System.out.print(this.valores[i][j] + " ");
           }
           System.out.println("");
       } 
    }
    
    public void atualizaValores(){
        int qtde;
        for(int i = 1; i < 9; ++i){
           for(int j = 1; j < 9; ++j){
               qtde = 0;
               if(this.valores[i-1][j-1] == 9) ++qtde;
               if(this.valores[i-1][j] == 9) ++qtde;
               if(this.valores[i-1][j+1] == 9) ++qtde;
               if(this.valores[i][j+1] == 9) ++qtde;
               if(this.valores[i][j-1] == 9) ++qtde;
               if(this.valores[i+1][j-1] == 9) ++qtde;
               if(this.valores[i+1][j] == 9) ++qtde;
               if(this.valores[i+1][j+1] == 9) ++qtde;
               if(this.valores[i][j] != 9){
                this.valores[i][j] = qtde;
               }
           }
       }
        
       for(int j = 1; j < 9; ++j){
         qtde = 0;
         if(this.valores[0][j+1] == 9) ++qtde;
         if(this.valores[0][j-1] == 9) ++qtde;
         if(this.valores[1][j-1] == 9) ++qtde;
         if(this.valores[1][j] == 9) ++qtde;
         if(this.valores[1][j+1] == 9) ++qtde;
         if(this.valores[0][j] != 9){
          this.valores[0][j] = qtde;
         }
       }
       for(int j = 1; j < 9; ++j){
         qtde = 0;
         if(this.valores[8][j-1] == 9) ++qtde;
         if(this.valores[8][j] == 9) ++qtde;
         if(this.valores[8][j+1] == 9) ++qtde;
         if(this.valores[9][j+1] == 9) ++qtde;
         if(this.valores[9][j-1] == 9) ++qtde;
         if(this.valores[9][j] != 9){
          this.valores[9][j] = qtde;
         }
       }
       for(int i = 1; i < 9; ++i){
        qtde = 0;
        if(this.valores[i-1][0] == 9) ++qtde;
        if(this.valores[i-1][1] == 9) ++qtde;
        if(this.valores[i][1] == 9) ++qtde;
        if(this.valores[i+1][0] == 9) ++qtde;
        if(this.valores[i+1][1] == 9) ++qtde;
        if(this.valores[i][0] != 9){
            this.valores[i][0] = qtde;
        }
       }
       for(int i = 1; i < 9; ++i){
         qtde = 0;
         if(this.valores[i-1][8] == 9) ++qtde;
         if(this.valores[i-1][9] == 9) ++qtde;
         if(this.valores[i][8] == 9) ++qtde;
         if(this.valores[i+1][8] == 9) ++qtde;
         if(this.valores[i+1][9] == 9) ++qtde;
         if(this.valores[i][9] != 9){
          this.valores[i][9] = qtde;
         }
       }
       if(this.valores[0][0] != 9){
           qtde = 0;
           if(this.valores[0][1] == 9) ++qtde;
           if(this.valores[1][0] == 9) ++qtde;
           if(this.valores[1][1] == 9) ++qtde;
           this.valores[0][0] = qtde;
       }
       if(this.valores[0][9] != 9){
           qtde = 0;
           if(this.valores[0][8] == 9) ++qtde;
           if(this.valores[1][8] == 9) ++qtde;
           if(this.valores[1][9] == 9) ++qtde;
           this.valores[0][9] = qtde;
       }
       if(this.valores[9][0] != 9){
           qtde = 0;
           if(this.valores[8][0] == 9) ++qtde;
           if(this.valores[8][1] == 9) ++qtde;
           if(this.valores[9][1] == 9) ++qtde;
           this.valores[9][0] = qtde;
       }
       if(this.valores[9][9] != 9){
           qtde = 0;
           if(this.valores[8][9] == 9) ++qtde;
           if(this.valores[8][8] == 9) ++qtde;
           if(this.valores[9][8] == 9) ++qtde;
           this.valores[9][9] = qtde;
       }
    }
}

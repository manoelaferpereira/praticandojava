/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aulajava;
import java.util.Scanner;
/**
 *
 * @author 55199
 */
public class tabuada {
   
       public static void main(String[] args ){
           Scanner sc = new Scanner(System.in);
           
           //Aqui pergunta o número da tabuada 
           
           System.out.println("Digite um número para ver a tabuada ");
           int numero = sc.nextInt();
           
           //Laço para mostrara tabuada de 1 até 10 
           
           System.out.println("tabuada do "+ numero+ ":");
           for (int i = 1; i<=10;i++){
               int resultado = numero *i;
               System.out.println(numero+"x" +i + "="+ resultado);
           }
           sc.close();
       }
   }


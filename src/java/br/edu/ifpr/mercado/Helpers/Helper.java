/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifpr.mercado.Helpers;

/**
 *
 * @author otavio
 */
public class Helper {
    public static Integer stringToInt(String numero){
        try {
        return Integer.parseInt(numero);
        }
        catch(NumberFormatException ex){
            return null;
        }
    }
}

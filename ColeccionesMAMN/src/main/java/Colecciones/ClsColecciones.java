/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colecciones;

import NuevaComisionMAMN.NuevaComision;
import java.util.*;


/**
 *
 * @author Marjorie
 */
public class ClsColecciones {
        public static void main(String[] args) {
        List milista = new ArrayList();

      NuevaComision comi = new NuevaComision();
      comi.Menu();
      
    }
    public static void imprimir(Collection colection){
        for(Object elemento: colection){
            System.out.println("elemento = "+elemento);
        }
    }
}

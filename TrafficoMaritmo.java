/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficomaritmo.src.it.unipa.community.davideproietto.prg.n12.es02;

import java.io.*;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author davide
 */
public class TrafficoMaritmo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Porto portoDiPalermo = new Porto();
        System.out.println(portoDiPalermo.toString());
         String scelta = null;
       // do
            System.out.println("MENU GESTIONE TRAFFICO");
            
          //  Map<String, Integer> flotta = new HashMap<String, Integer>();
            
            Nave sottomarino = new Nave("A1", 5, 6, 50, 180, 120, 60, 26);
            Nave baleniera = new Nave("A2", 8, 4, 40, 100, 90, 50, 16);            
            Nave motoscafo = new Nave("A3", 11, 5, 50, 180, 120, 60, 26);
            Nave rimorchiatore = new Nave("A4", 30, 8, 40, 100, 90, 50, 16);  
            Nave portaerei = new Nave("A5", 51, 6, 50, 180, 120, 60, 26);
            Nave crociera = new Nave("A6", 85, 36, 40, 100, 90, 50, 16);            
            Nave pedalo = new Nave("A7", 15, 60, 50, 180, 120, 60, 26);
            Nave peschereccio = new Nave("A8", 18, 66, 40, 100, 90, 50, 16); 
            
        try (InputStreamReader ir = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(ir)){
            scelta = in.readLine();
            while (scelta != null){
                if(scelta == "exit"){
                    System.out.print("Programma terminato");
                    break;
                }
                  System.err.println("Hai scritto: "+ scelta);
                  if(scelta != "1" && scelta != "2" && scelta != "3"){
                      throw new IllegalArgumentException("Hai digitato una "
                              + "scelta non valida");
                  }
                  System.out.println("Prova di nuovo");
                  scelta = in.readLine();    
                                 
            switch(scelta){
                    case "1":   // crea Natante
                        System.out.println("Crea Nuovo Natante");
                        //new Nave(stringa);
                    case "2":   // rimuovi Natante
                        System.out.println("Elimina Natante");
                    case "3":   // stampa traffico
                        System.out.println("Stampa Situazione Traffico");
                    default:
                    
            }
        }
    }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficomaritmo.src.it.unipa.community.davideproietto.prg.n12.es02;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author davide
 */
public class Porto {
    private String name = "";
    
    public Porto(String name){
        setName(name);
        
       //Collection natanti = new Map<K,V>();
        
    }
    
    public Porto(){
        this("Porto di Palermo");
    }
    
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Benvenuti al Porto di "  + name ;
    }
 
      Map<String, Integer> flotta = new HashMap<>();
   
public String printTraffic(){
    return ( "" + flotta.toString());   
    }    
    
}
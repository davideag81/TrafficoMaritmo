/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trafficomaritmo.src.it.unipa.community.davideproietto.prg.n12.es02;

/**
 *
 * @author davide
 */
public class Nave {
    private String codex;
    private double lat, lon;
    private double speed;
    private int direction;
    private double lenght,width;
    private int passengers;
    
    public Nave(String codex, double lat, double lon, double speed, int direction,
            double lenght, double width, int passengers){
        setCodex(codex);
        setLat(lat);
        setLon(lon);
        setSpeed(speed);
        setDirection(direction);
        setLenght(lenght);
        setWidth(width);
        setPassengers(passengers);
    }
    
    public Nave(){
        this("Natante", 1.0, 1.0, 1.0, 1, 1.0, 1.0, 1);
    }
    
public void avanza(){
    // FA QUALCOSA
    this.lat+=speed*Math.cos(direction*Math.PI/180);
    setLat(lat);
    this.lon+=speed*Math.sin(direction*Math.PI/180);
    setLon(lon);
}

public void evitaCollisioni(double lat, double lon/*passa tutte le navi con un ArrayList penso*/){
    double dx = this.lat - lat;
    double dy = this.lon - lon;
    double distance = Math.sqrt(dx*dx+dy*dy);
    if(distance < 20){
        System.out.println("Attenzione ALLARME COLLISIONE per " + this.codex);
    }
}
@Override
public String toString(){
    return "Nave : " +this.getCodex() + "\t"
            +this.getLat()+ "\t"
            +this.getLon()+ "\t"
            +this.getDirection()+ "\t"
            +this.getLenght() + "\t"
            +this.getWidth() + "\t"
            +this.getSpeed() + "\t"
            +this.getPassengers()+"\n";
}
    /**
     * @return the codex
     */
    public String getCodex() {
        return codex;
    }

    /**
     * @param codex the codex to set
     */
    public void setCodex(String codex) {
        this.codex = codex;
    }

    /**
     * @return the cordinate
     */
    public double getLat() {
        return lat;
    }
    public double getLon() {
        return lon;
    }
    
    public void setLat(double lat) {
        this.lat = lat;
    }
    
    public void setLon(double lon) {
        this.lon = lon;
    }

    /**
     * @return the speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * @return the direction
     */
    public int getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(int direction) {
        this.direction = direction;
    }

    /**
     * @return the lenght
     */
    public double getLenght() {
        return lenght;
    }

    /**
     * @param lenght the lenght to set
     */
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    /**
     * @return the width
     */
    public double getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * @return the passengers
     */
    public int getPassengers() {
        return passengers;
    }

    /**
     * @param passengers the passengers to set
     */
    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }
     
}
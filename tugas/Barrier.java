/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author INDRAFN
 */
public class Barrier implements Destroyable{
    private int strength;
    
    public Barrier(int strength){
        this.strength = strength;
    }
    
    public int strength(){
        return strength;
    }
    
    public void setStrength(int Strength){
        this.strength = strength;
    }

    @Override
    public void destroyed() {
        int destroy = (int)(this.strength * 0.112);
        this.strength = this.strength - destroy;
    }
    
    public String getBarrierInfo(){
        return "Barrier Strength = " + strength + "\n";
    }
}

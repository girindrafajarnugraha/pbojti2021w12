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
public class Plant {
    
    public void doDestroy(Destroyable d){
        if(d instanceof WalkingZombie){
            WalkingZombie walk = (WalkingZombie)d;
            walk.destroyed();
        }else if(d instanceof JumpingZombie){
            JumpingZombie jump = (JumpingZombie)d;
            jump.destroyed();
        }else if(d instanceof Barrier){
            Barrier b = (Barrier)d;
            b.destroyed();
        }
    }
}

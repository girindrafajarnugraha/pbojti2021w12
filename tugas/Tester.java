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
public class Tester {
    public static void main(String[] args) {
        WalkingZombie walk = new WalkingZombie(100, 1);
        JumpingZombie jump = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();
        System.out.println("" + walk.getZombieInfo());
        System.out.println("" + jump.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
        System.out.println("------------------------");
        for(int i = 0; i < 4; i++){
            p.doDestroy(walk);
            p.doDestroy(jump);
            p.doDestroy(b);
        }
        System.out.println("" + walk.getZombieInfo());
        System.out.println("" + jump.getZombieInfo());
        System.out.println("" + b.getBarrierInfo());
    }
}

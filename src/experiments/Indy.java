/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author Gladwin
 */
public class Indy implements Bird{

    @Override
    public void grow() {
        System.out.println("I make the Indy bird grow");
    }

    @Override
    public String LifeCycle() {
         return (LayEggs() + ", " + HatchEggs() + ", " + BirdGrow());
         
    }
     private String LayEggs() {
        return ("I lay the eggs");
    }

    private String HatchEggs() {
        return ("I hatch eggs");
    }

    private String BirdGrow() {
        return ("I grow feathers and fly");
    }

    
}

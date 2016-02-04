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
public class Charlie implements Bird{

    @Override
    public void grow() {
        System.out.println("The bird grows");
    }

    @Override
    public String LifeCycle() {
        return ("This is the LifeCycle of a Bird");
    }
    
}  

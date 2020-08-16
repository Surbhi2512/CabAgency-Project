/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabagency;

/**
 *
 * @author DELL
 */
public class Pair {
    int x;
    int y;
    
    public Pair(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    
    public String toString()
    {
        return "(" + this.x + "," + this.y + ")";
    }

}

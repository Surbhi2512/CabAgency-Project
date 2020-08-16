/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabagency;

import java.util.LinkedList;

/**
 *
 * @author DELL
 */
public class Passenger {
    String name;
    int p_ID;
    int x1,y1;
    int x2,y2;
    Pair p_location;
    Pair drop_location;
    
    public Passenger(String name,int p_ID,int x1,int y1,int x2,int y2)
    {
        this.name=name;
        this.p_ID=p_ID;
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.p_location=new Pair(x1,y1);
        this.drop_location=new Pair(x2,y2);
    
}
    
    public String toString()
    {
        return this.name + " " + this.p_ID + " " + p_location.toString() +" " + drop_location.toString();
    }
    
    static LinkedList<Passenger> ppassenger=new LinkedList<Passenger>();
    
    static void printelem(LinkedList<Passenger> ppassenger){
        for(int i=0;i<ppassenger.size();i++)
        {
            System.out.println(ppassenger.get(i));
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabagency;

import java.util.LinkedList;

public class CabDriver {
    int d_ID;
    String name;
    
    public CabDriver(int d_ID,String name)
    {
        this.d_ID=d_ID;
        this.name=name;
    }
    
    @Override
    public String toString()
    {
        return this.d_ID + " " + this.name;
    }
    static LinkedList<CabDriver> driver=new LinkedList<>();
    
    static void printelem(LinkedList<CabDriver> driver){
        for(int i=0;i<driver.size();i++)
        {
            System.out.println(driver.get(i));
        }
    }

}

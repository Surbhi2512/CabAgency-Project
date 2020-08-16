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
public class CurrentStatus {
    int d_ID;
    boolean status;
    int x,y;
    Pair location=new Pair(x,y);
    
    public CurrentStatus(int d_ID,boolean status,int x,int y)
    {
        this.d_ID=d_ID;
        this.status=status;
        this.x=x;
        this.y=y;
        this.location=new Pair(x,y);
    }
    
    public String toString(){
        return this.d_ID + " " + this.status + " " + "(" + this.x + "," + this.y + ")";
    }
static LinkedList<CurrentStatus> cstatus=new LinkedList<>();

static void printelem(LinkedList<CurrentStatus> cstatus){
        for(int i=0;i<cstatus.size();i++)
        {
            System.out.println(cstatus.get(i));
        }
    }

}

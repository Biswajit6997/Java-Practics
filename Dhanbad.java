// using package Name .classname
package science.state.cityinfo
public class Dhanbad {
    public void stateinfo()
    {
        System.out.println("Dhanbad is one of the majpr city of Jharkhand");
    }

    public void cityinfo(){
        System.out.println("Dhanbad is coal captial of India");
    }
}
package com.cs.state.requireinfo;
import science.state.cityinfo.dhanbad;

class cs{
    public static void main(String[] args) {
        Dhanbad d =new Dhanbad();
        d.stateinfo();
        d.cityinfo();
    }
}

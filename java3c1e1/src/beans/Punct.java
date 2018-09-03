package beans;

import main.NumarAleator;

public class Punct {
 
    @NumarAleator
    private int x;
    private int y;
    
    public void afisareCoordonae(){
        System.out.println(x + " " + y);
    }
}
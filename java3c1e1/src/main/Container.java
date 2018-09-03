package main;

import beans.Punct;
import java.lang.reflect.Field;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Container {
    public static void main(String[] args) throws IllegalAccessException {
        
        Punct punct = new Punct();
        Random random = new Random();
        
        try {
            Class<?> punctClass = Class.forName("bbeans.Punct");
            Field [] fields = punctClass.getDeclaredFields();
            for (Field f : fields){
                f.setAccessible(true);
                if (f.isAnnotationPresent(NumarAleator.class)){
                    f.setInt(punct, random.nextInt(1000));
                }
            }
            punct.afisareCoordonae();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Container.class.getName()).log(Level.SEVERE, null, ex);
    }    
}
}
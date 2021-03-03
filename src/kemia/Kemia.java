package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Kemia {
    private List<String> sorok;
    private List<Felfedezesek> elemek;
    
    
    
    public static void main(String[] args) throws IOException {
        new Kemia().feladatok();
        
        
        
        
        
        
        
        
        
        
        
    }

    private void feladatok() throws IOException {
       beolvas();
       feladat3();
       feladat4();
       feladat5();
       feladat6();
       feladat7();
       feladat8();
       
    }

    private void beolvas() throws IOException {
        sorok = Files.readAllLines(Paths.get("felfedezesek.csv"));
        elemek = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            String sor = sorok.get(i);
            elemek.add(new Felfedezesek(sor));
        }
    }

    private void feladat3() {
       
        
        
        
        
        
        
        
        
    }

    private void feladat4() {
        
        
        
        
        
        
        
    }
    
     private void feladat5() {
       
         
         
         
         
         
         
    }

    private void feladat6() {
       
        
        
        
        
        
    }

   
    private void feladat7() {
       
        
        
        
        
        
        
        
        
    }

    private void feladat8() {
       
        
        
        
        
        
        
        
        
        
    }
    
}

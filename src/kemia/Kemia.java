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
       
    }

    private void beolvas() throws IOException {
        sorok = Files.readAllLines(Paths.get("felfedezesek.csv"));
        elemek = new ArrayList<>();
        for (int i = 1; i < sorok.size(); i++) {
            String sor = sorok.get(i);
            elemek.add(new Felfedezesek(sor));
        }
    }
    
}

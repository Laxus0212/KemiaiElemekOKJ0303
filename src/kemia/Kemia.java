package kemia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.printf("3. feladat: Elemek száma: %d\n", elemek.size());
        
        
        
        
        
        
        
        
    }

    private void feladat4() {
        int okoriFelf = 0;
        for (Felfedezesek elem : elemek) {
            if (elem.getEv().equals("Ókor")) {
                okoriFelf++;
            }
        }
        System.out.printf("4. feladat: Felfedezéssek száma az ókorban: %d\n", okoriFelf);
        
        
        
        
        
        
    }
    
     private void feladat5() {
       
         Scanner sc = new Scanner(System.in);  
        boolean ok;
        String be;
        //System.out.println(betu);
        do{ System.out.print("5. feladat: Kérek egy vegyjelet: ");
           be = sc.nextLine();
           boolean betuk = be.matches("[a-zA-Z]+");           
           boolean joHossz = be.length()==1 || be.length() == 2;
           ok = betuk && joHossz;
        }
        while (!ok);
         
         
         
         
         
    }

    private void feladat6() {
       
        
        
        
        
        
    }

   
    private void feladat7() {
       
        
        int maxEv = 0;
        int minEv = 0;
        int elteltIdo = 0;
        while(elemek.get(minEv).getEv().equals("Ókor")){
            minEv++;
        }
        maxEv = Integer.parseInt(elemek.get(minEv+1).getEv());
        minEv = Integer.parseInt(elemek.get(minEv).getEv());
        elteltIdo = maxEv - minEv;
        
            for (int i = 0; i < elemek.size()-1; i++) {
                if(!elemek.get(i).getEv().equals("Ókor")){
                    
                    minEv = Integer.parseInt(elemek.get(i).getEv());
                    maxEv = Integer.parseInt(elemek.get(i+1).getEv());
                    int aktElteltIdo = maxEv - minEv;
                    if(elteltIdo < aktElteltIdo){
                        elteltIdo = aktElteltIdo;
                    }
                } 
            }
           
        System.out.printf("7. feladat: %d ev volt a leghosszabb idoszak ket elem felfedezese kozott.\n", elteltIdo);
        
        
        
        
        
        
    }

    private void feladat8() {
       
        
        System.out.println("8. feladat: Statisztika");
        
        HashMap<String, Integer> halmaz = new HashMap<>();
        
        for (Felfedezesek elem : elemek) {
            String kulcs = elem.getEv();
            if(!halmaz.containsKey(kulcs)){
                halmaz.put(kulcs, 1);
            }else{
                int ertek = halmaz.get(kulcs);
                halmaz.put(kulcs, ++ertek);
            }
        }
        
        for (Map.Entry<String, Integer> elem : halmaz.entrySet()) {
            String kulcs = elem.getKey();
            Integer ertek = elem.getValue();
            if (ertek > 3 && !(kulcs.equals("Ókor"))) {
                System.out.printf("\t%s: %d db\n", kulcs, ertek);
            }
            
        }
        
        
            
        
        
        
        
        
        
        
        
    }
    
}

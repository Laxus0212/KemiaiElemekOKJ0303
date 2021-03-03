
package kemia;


public class Felfedezesek {
    private String ev;
    private String nev;
    private String vj;
    private int rsz;
    private String felf;

    public Felfedezesek(String sor) {
        String [] s = sor.split(";");
        this.ev = s[0];
        this.nev = s[1];
        this.vj = s[2];
        this.rsz = Integer.parseInt(s[3]);
        this.felf = s[4];
    }

    public String getEv() {
        return ev;
    }

    public String getNev() {
        return nev;
    }

    public String getVj() {
        return vj;
    }

    public int getRsz() {
        return rsz;
    }

    public String getFelf() {
        return felf;
    }
    
    
    
    
    
    
    
    
}

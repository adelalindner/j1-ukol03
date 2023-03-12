package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty() {
        return jeZapnuty;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.out.println("-- CHYBA --  Nelze vytvářet soubory, když je počítač vypnutý");
            return;
        }

        if (pevnyDisk.getKapacita() < pevnyDisk.getVyuziteMisto() + velikost) {
            System.out.println("-- CHYBA --  Na disku není dostatek místa");
        } else {
            System.out.println("Právě se vytvořil soubor o velikosti " + velikost);
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() + velikost);
        }
    }

    public void vymazSouborOVelikosti(long velikost) {
        if (!jeZapnuty) {
            System.out.println("-- CHYBA --  Nelze mazat soubory, když je počítač vypnutý");
            return;
        }

        if (0 > pevnyDisk.getVyuziteMisto() - velikost) {
            System.out.println("-- CHYBA --  Využité místo nemůže klesnout pod nulu");
        } else {
            System.out.println("Právě se vytvořil soubor o velikosti " + velikost);
            pevnyDisk.setVyuziteMisto(pevnyDisk.getVyuziteMisto() - velikost);
        }
    }



    public void zapniSe() {
        if (ram == null || cpu == null || pevnyDisk == null) {
            System.err.println("ERROR: Počítač nelze zapnout bez všech součástí");
            return;
        }

        if (jeZapnuty == false) {
            jeZapnuty = true;
            System.out.println("Počítač se právě zapnul");
        } else {
            System.err.println("ERROR: Počítač již je zapnutý");
        }
    }

    public void vypniSe() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Počítač se právě vypnul");
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }


    @Override
    public String toString() {
        return "Pocitac:" + "cpu = " + cpu + ", ram = " + ram + ", pevný disk = " + pevnyDisk;
    }

}

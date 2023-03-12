package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    public boolean jeZapnuty() {
        return jeZapnuty;
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

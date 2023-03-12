package cz.czechitas.ukol3;

public class Pocitac {

    private boolean jeZapnuty;


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



    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;


    @Override
    public String toString() {
        return "Pocitac:" + "cpu = " + cpu + ", ram = " + ram + ", pevný disk = " + pevnyDisk;
    }

}

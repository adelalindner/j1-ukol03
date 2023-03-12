package cz.czechitas.ukol3;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        Pocitac adelPocitac = new Pocitac();
        adelPocitac.setPevnyDisk(adelDisk);
        adelPocitac.setRam(adelPamet);
        adelPocitac.setProcesor(adelProcesor);

        Disk adelDisk = new Disk();
        adelDisk.setKapacita(254_548_554_547L);
        adelDisk.setVyuziteMisto(222_256_458_230L);

        Pamet adelPamet = new Pamet();
        adelPamet.setKapacita(8_000_000_000L);


        Procesor adelProcesor = new Procesor();
        adelProcesor.setRychlost(5_300_000_000_000L);
        adelProcesor.setVyrobce("AMD");




        System.out.println("Program spuštěn.");
    }

}

package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        System.out.println("Program spuštěn.");

        Pocitac adelPocitac;
        adelPocitac = new Pocitac();

        System.out.println(adelPocitac.toString());
        adelPocitac.zapniSe();

        Procesor adelProcesor = new Procesor();
        adelProcesor.setRychlost(3_400_000_000_000L);
        adelProcesor.setVyrobce("Intel");

        Pamet adelPamet = new Pamet();
        adelPamet.setKapacita(16_000_000_000L);

        Disk adelDisk = new Disk();
        adelDisk.setKapacita(255_195_746_304L);

        adelPocitac.setCpu(adelProcesor);
        adelPocitac.setRam(adelPamet);
        adelPocitac.setPevnyDisk(adelDisk);

        System.out.println(adelPocitac.toString());

        adelPocitac.zapniSe();
        adelPocitac.zapniSe();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(adelPocitac.toString());
        adelPocitac.vypniSe();

        adelPocitac.vypniSe();      // Nevypise chybu, ale nic neprovede,
        adelPocitac.vypniSe();      // protoze pocitac je uz vypnut

        adelPocitac.vytvorSouborOVelikosti(15);
        adelPocitac.vymazSouborOVelikosti(15);

        adelPocitac.zapniSe();

        adelPocitac.vytvorSouborOVelikosti(355_195_746_303L);
        adelPocitac.vytvorSouborOVelikosti(105_195_746_200L);
        adelPocitac.vytvorSouborOVelikosti(50_195_746_200L);
        adelPocitac.vytvorSouborOVelikosti(150_195_746_304L);
        adelPocitac.vymazSouborOVelikosti(255_195_746_304L);


    }

}

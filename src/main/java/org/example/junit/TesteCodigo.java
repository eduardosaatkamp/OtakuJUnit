package org.example.junit;

import java.time.LocalDate;

public class TesteCodigo {
    public static void main(String[] args) {

        Otaku leo = new Otaku("Leo");
        Anime anime1 = new Anime("Naruto", "Masashi Kishimoto", 2002, LocalDate.of(2002, 10, 3));
        Anime anime2 = new Anime("One Piece", "Eiichiro Oda", 1997, LocalDate.of(1997, 10, 20));
        Anime anime3 = new Anime("Bleach", "Tite Kubo", 2001, LocalDate.of(2001, 10, 5));
        Anime anime4 = new Anime("Dragon Ball", "Akira Toriyama", 1984, LocalDate.of(1984, 2, 26));

        leo.getcoletaneaDoOtaku().add(anime1);
        leo.getcoletaneaDoOtaku().add(anime2);
        leo.getcoletaneaDoOtaku().add(anime3);
        leo.getcoletaneaDoOtaku().add(anime4);

        int ano = leo.obterAnoDoAnimeMaisAntigo();

        System.out.println("Ano do anime mais antigo: " + ano);
    }
}

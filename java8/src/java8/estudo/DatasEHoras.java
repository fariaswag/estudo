package java8.estudo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DatasEHoras {


    public static void main(String args[]) {


        LocalDate agora = LocalDate.now();
        LocalDate futuro = LocalDate.of(2099, 01, 24);

        DateTimeFormatter f  = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Period periodo = Period.between(agora, futuro);

        System.out.println(futuro.format(f));
    }
}

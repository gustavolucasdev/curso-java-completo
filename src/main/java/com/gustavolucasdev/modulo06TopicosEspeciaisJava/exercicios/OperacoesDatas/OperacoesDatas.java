package com.gustavolucasdev.modulo06TopicosEspeciaisJava.exercicios.OperacoesDatas;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class OperacoesDatas {
    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWekkLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocaDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWekkLocalDate);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWekkLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = " + nextWekkLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekinstant = " + nextWeekInstant);

        //Calculando Duração

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);

        System.out.println("T1 Duração = " + t1.toDays());
        System.out.println("T2 Duração = " + t2.toDays());
        System.out.println("T3 Duração = " + t3.toDays());
        System.out.println("T4 Duração = " + t4.toDays());

    }
}

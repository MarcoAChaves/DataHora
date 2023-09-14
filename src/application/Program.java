package application;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Program {

    public static void main(String[] args) {

        //instanciando data e hora ( d01 - data local / d02 - Dt e Hr GLobal / d03 - Dt e Hr global com GMT Londres
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        //formatando
        LocalDate d04 = LocalDate.parse("2023-09-01");
        LocalDateTime d05 = LocalDateTime.parse("2022-09-01T01:30:26");
        Instant d06 = Instant.parse("2023-08-31T01:30:26Z");
        //instanciando com horario GMT x local
        //LocalDateTime d07 = LocalDateTime.parse("2023-09-25 01:30:26-03:00", fmt2);

        LocalDate d08 = LocalDate.parse("25/09/1978", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("25/09/1978 06:45", fmt2);

        LocalDate d10 = LocalDate.of(1978, 9, 25);
        LocalDateTime d11 = LocalDateTime.of(1978, 9, 25 ,1,30);

        // transformando data em texto
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //chamando com fuso
        DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;

        //Convertendo de global x local
        // exibir todos GMT - for (String s : ZoneId.getAvaliableZoneIds)
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        //Cálculos com data e hora
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate plusYearsLocalDate = d04.plusYears(7);
        LocalDateTime pastHourLocalDateTime = d05.minusHours(7);
        LocalDateTime nextMinutesLocalDateTime = d05.plusMinutes(7);
        LocalDateTime plusSecondsLocalDateTime = d05.plusSeconds(7);
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        //Calculando tempo
        Duration t1 = Duration.between(pastWeekInstant, d06);


        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        //System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
        System.out.println("fmt3 = " + d04.format(fmt3));
        System.out.println("fmt4 = " + d05.format(fmt3));
        System.out.println("fmt4 = " + d05.format(fmt4));
        System.out.println("fmt5 = " + fmt5.format(d06));
        System.out.println("fmt6 = " + d05.format(fmt6));
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        //Obtendo data e hora local
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mes = " + d04.getDayOfWeek().getValue());
        System.out.println("d04 dias do ano = " + d04.getDayOfYear()); //Contagem de dias no ano
        System.out.println("d04 ano = " + d04.getYear());
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
        System.out.println("d05 segundos = " + d05.getSecond());

        //Cálculos
        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("plusYearsLocalDate = " + plusYearsLocalDate);
        System.out.println("pastHourLocalDate = " + pastHourLocalDateTime);
        System.out.println("nextMinutesLocalDate = " + nextMinutesLocalDateTime);
        System.out.println("plusSecondsLocalDate = " + plusSecondsLocalDateTime);
        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);
        System.out.println("t1 dias =" + t1.toDays());
    }
}

package pl.deptala.piotr.queencelldatecalculator.web.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class QueenBeesReproductionCalendarModel {
    LocalDate localDate;
    LocalDateTime beeQueenIsolation;
    LocalDateTime raisingColony;
    LocalDateTime larvaeTransfer;
    LocalDateTime returningQueen;
    LocalDateTime returningQueenNoLater;
    LocalDateTime sealingWax;
    LocalDateTime histolysis;
    LocalDateTime insulation;
    LocalDateTime possibleQueenHatching;
    LocalDateTime queenHatching;

    public QueenBeesReproductionCalendarModel() {
    }
}

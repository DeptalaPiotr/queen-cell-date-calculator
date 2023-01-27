package pl.deptala.piotr.queencelldatecalculator.web.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class QueenBeesReproducionCalendarModel {
    LocalDate localDate;
    LocalDateTime beeQueenIsolation;
    LocalDateTime raisingColony;

    public QueenBeesReproducionCalendarModel() {
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalDateTime getBeeQueenIsolation() {
        return beeQueenIsolation;
    }

    public void setBeeQueenIsolation(LocalDateTime beeQueenIsolation) {
        this.beeQueenIsolation = beeQueenIsolation;
    }

    public LocalDateTime getRaisingColony() {
        return raisingColony;
    }

    public void setRaisingColony(LocalDateTime raisingColony) {
        this.raisingColony = raisingColony;
    }

    @Override
    public String toString() {
        return "CalenderModel{" +
                "localDate=" + localDate +
                '}';
    }
}

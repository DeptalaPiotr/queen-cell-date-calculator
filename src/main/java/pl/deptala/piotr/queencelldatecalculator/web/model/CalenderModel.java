package pl.deptala.piotr.queencelldatecalculator.web.model;

import java.time.LocalDate;

public class CalenderModel {
    LocalDate localDate;

    public CalenderModel() {
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    @Override
    public String toString() {
        return "CalenderModel{" +
                "localDate=" + localDate +
                '}';
    }
}

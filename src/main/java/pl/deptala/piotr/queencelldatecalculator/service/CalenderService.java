package pl.deptala.piotr.queencelldatecalculator.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.logging.Logger;

@Service
public class CalenderService {

    private static final Logger LOGGER = Logger.getLogger(CalenderService.class.getName());


    // C - create
    public LocalDate beeQueenIsolation(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LocalDate date = localDate.minusDays(4);
        LOGGER.info("create(...)" + date);
        return date;
    }

    // Larvae Transfer
    public LocalDate larvaeTransfer(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LOGGER.info("create(...)");
        return localDate;
    }

    // Sealing wax
    public LocalDate sealingWax(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LocalDate date = localDate.plusDays(5);
        LOGGER.info("create(...)" + date);
        return date;
    }

    // Histolysis
    public LocalDate histolysis(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LocalDate date = localDate.plusDays(7);
        LOGGER.info("create(...)" + date);
        return date;
    }

    // Insulation
    public LocalDate insulation(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LocalDate date = localDate.plusDays(9);
        LOGGER.info("create(...)" + date);
        return date;
    }

    // Possible Queen Hatching
    public LocalDate possibleQueenHatching(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LocalDate date = localDate.plusDays(11);
        LOGGER.info("create(...)" + date);
        return date;
    }

    //  Queen Hatching
    public LocalDate queenHatching(LocalDate localDate) {
        LOGGER.info("create(" + localDate + ")");
        LocalDate date = localDate.plusDays(12);
        LOGGER.info("create(...)" + date);
        return date;
    }

    // R - read
    public void read() {
        LOGGER.info("read()");
        LOGGER.info("read(...)");
    }

    // U - update
    public void update() {
        LOGGER.info("update()");
        LOGGER.info("update(...)");
    }

    // D - delete
    public void delete() {
        LOGGER.info("delete()");
        LOGGER.info("delete(...)");
    }

    // L - list
    public void list() {
        LOGGER.info("list()");
        LOGGER.info("list(...)");
    }
}

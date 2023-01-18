package pl.deptala.piotr.queencelldatecalculator.service;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;

@Service
public class CalenderService {

    private static final Logger LOGGER = Logger.getLogger(CalenderService.class.getName());


    // Bee Queen Isolation
    public LocalDateTime beeQueenIsolation(LocalDateTime localDate) {
        LOGGER.info("beeQueenIsolation(" + localDate + ")");
        LocalDateTime date = localDate.minusDays(4);
        LocalDateTime dateTime = date.plusHours(16);
        LOGGER.info("beeQueenIsolation(...)" + dateTime);
        return dateTime;
    }

    // Isolate the queen bee from the raising colony
    public LocalDateTime raisingColony(LocalDateTime localDate) {
        LOGGER.info("raisingColony(" + localDate + ")");
        LocalDateTime localDateTime = localDate.minusHours(3);
        LOGGER.info("raisingColony(...) " + localDateTime);
        return localDateTime;
    }

    // Larvae Transfer
    public LocalDateTime larvaeTransfer(LocalDateTime localDate) {
        LOGGER.info("larvaeTransfer(" + localDate + ")");
        LOGGER.info("larvaeTransfer(...)");
        return localDate;
    }

    // Returning the queen to the rearing family and isolating her from the queen cell frame
    public LocalDateTime returningQueen(LocalDateTime localDateTime) {
        LOGGER.info("returningQueen(" + localDateTime + ")");
        LocalDateTime returningQueen = localDateTime.plusHours(20);
        LOGGER.info("returningQueen(...)" + returningQueen);
        return returningQueen;
    }

    // Returning the mother to the raising family and isolating her from the nursery frame - no later than
    public LocalDateTime returningQueenNoLater(LocalDateTime localDateTime) {
        LOGGER.info("returningQueenNoLater(" + localDateTime + ")");
        LocalDateTime returningQueenNoLater = localDateTime.plusHours(48);
        LOGGER.info("returningQueenNoLater(...)" + returningQueenNoLater);
        return returningQueenNoLater;
    }

    // Sealing wax
    public LocalDate sealingWax(LocalDate localDate) {
        LOGGER.info("sealingWax(" + localDate + ")");
        LocalDate date = localDate.plusDays(5);
        LOGGER.info("sealingWax(...)" + date);
        return date;
    }

    // Histolysis
    public LocalDate histolysis(LocalDate localDate) {
        LOGGER.info("histolysis(" + localDate + ")");
        LocalDate date = localDate.plusDays(7);
        LOGGER.info("histolysis(...)" + date);
        return date;
    }

    // Insulation
    public LocalDate insulation(LocalDate localDate) {
        LOGGER.info("insulation(" + localDate + ")");
        LocalDate date = localDate.plusDays(9);
        LOGGER.info("insulation(...)" + date);
        return date;
    }

    // Possible Queen Hatching
    public LocalDate possibleQueenHatching(LocalDate localDate) {
        LOGGER.info("possibleQueenHatching(" + localDate + ")");
        LocalDate date = localDate.plusDays(11);
        LOGGER.info("possibleQueenHatching(...)" + date);
        return date;
    }

    //  Queen Hatching
    public LocalDate queenHatching(LocalDate localDate) {
        LOGGER.info("queenHatching(" + localDate + ")");
        LocalDate date = localDate.plusDays(12);
        LOGGER.info("queenHatching(...)" + date);
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

package pl.deptala.piotr.queencelldatecalculator.service;

import org.springframework.stereotype.Service;
import pl.deptala.piotr.queencelldatecalculator.web.model.QueenBeesReproductionCalendarModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;

@Service
public class CalenderService {

    private static final Logger LOGGER = Logger.getLogger(CalenderService.class.getName());

    // C - create
    public QueenBeesReproductionCalendarModel calculate(LocalDateTime calendarDate) {

        LOGGER.info("read(" + calendarDate + ")");
        QueenBeesReproductionCalendarModel queenBeesReproductionCalendarModel = new QueenBeesReproductionCalendarModel();

        // Bee Queen Isolation
        LocalDateTime date = calendarDate.minusDays(4);
        LocalDateTime beeQueenIsolation = date.plusHours(16);
        queenBeesReproductionCalendarModel.setBeeQueenIsolation(beeQueenIsolation);

        // Isolate the queen bee from the raising colony
        LocalDateTime raisingColony = calendarDate.minusHours(3);
        queenBeesReproductionCalendarModel.setRaisingColony(raisingColony);

        // Larvae Transfer
        queenBeesReproductionCalendarModel.setLarvaeTransfer(calendarDate);

        // Returning the queen to the rearing family and isolating her from the queen cell frame
        LocalDateTime returningQueen = calendarDate.plusHours(20);
        queenBeesReproductionCalendarModel.setReturningQueen(returningQueen);

        // Returning the mother to the raising family and isolating her from the nursery frame - no later than
        LocalDateTime returningQueenNoLater = calendarDate.plusHours(48);
        queenBeesReproductionCalendarModel.setReturningQueenNoLater(returningQueenNoLater);

        // Sealing wax
        LocalDateTime sealingWax = calendarDate.plusDays(5);
        queenBeesReproductionCalendarModel.setSealingWax(sealingWax);

        // Histolysis
        LocalDateTime histolysis = calendarDate.plusDays(7);
        queenBeesReproductionCalendarModel.setHistolysis(histolysis);

        // Insulation
        LocalDateTime insulation = calendarDate.plusDays(9);
        queenBeesReproductionCalendarModel.setInsulation(insulation);

        // Possible Queen Hatching
        LocalDateTime possibleQueenHatching = calendarDate.plusDays(11);
        queenBeesReproductionCalendarModel.setPossibleQueenHatching(possibleQueenHatching);

        //  Queen Hatching
        LocalDateTime queenHatching = calendarDate.plusDays(12);
        queenBeesReproductionCalendarModel.setQueenHatching(queenHatching);

        LOGGER.info("read(...) " + queenBeesReproductionCalendarModel);

        return queenBeesReproductionCalendarModel;
    }
}

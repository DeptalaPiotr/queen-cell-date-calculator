package pl.deptala.piotr.queencelldatecalculator.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.deptala.piotr.queencelldatecalculator.service.CalenderService;
import pl.deptala.piotr.queencelldatecalculator.web.model.QueenBeesReproductionCalendarModel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/calendar")
public class CalenderController {

    private static final Logger LOGGER = Logger.getLogger(CalenderController.class.getName());

    private CalenderService calenderService;

    public CalenderController(CalenderService calenderService) {
        this.calenderService = calenderService;
    }

    // C - create
    @GetMapping
    public String createView() {
        return "calendar.html";
    }

    @PostMapping
    public String beeQueenIsolation(LocalDateTime localDate, ModelMap modelMap) {
        LOGGER.info("create(" + localDate + ")");
        QueenBeesReproductionCalendarModel calculate = calenderService.calculate(localDate);
        modelMap.addAttribute("calculate", calculate);
        LOGGER.info("create(...)");
        return "calendar.html";
    }
}
// TODO: 18.01.2023
// Poszukanie darmowej API dla prognozy pogody
// Implementacja Weather API
// Dodanie error.html
// Testy aplikacji
// Dodanie opcji wydrukowania tabeli

package pl.deptala.piotr.queencelldatecalculator.web;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.deptala.piotr.queencelldatecalculator.service.CalenderService;
import pl.deptala.piotr.queencelldatecalculator.service.PdfGeneratorService;
import pl.deptala.piotr.queencelldatecalculator.web.model.QueenBeesReproductionCalendarModel;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/calendar")
public class CalenderController {

    private static final Logger LOGGER = Logger.getLogger(CalenderController.class.getName());

    private CalenderService calenderService;
    private PdfGeneratorService pdfGeneratorService;

    public CalenderController(CalenderService calenderService, PdfGeneratorService pdfGeneratorService) {
        this.calenderService = calenderService;
        this.pdfGeneratorService = pdfGeneratorService;
    }

    // C - create
    @GetMapping
    public String createView() {
        LOGGER.info("createView()");
        return "calendar.html";
    }

    @PostMapping
    public String create(LocalDateTime localDate, ModelMap modelMap) {
        LOGGER.info("create(" + localDate + ")");
        QueenBeesReproductionCalendarModel calculate = calenderService.calculate(localDate);
        modelMap.addAttribute("calculate", calculate);
        LOGGER.info("create(...)");
        return "calendar.html";
    }

    @PostMapping("/pdf/generate")
    public void generatePDF(HttpServletResponse response, LocalDateTime localDateTime) throws IOException {
        response.setContentType("/calendar");
        DateFormat dateFormatter = new SimpleDateFormat("dd-mm-yyyy:hh:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=pdf_" + currentDateTime + "+pdf";
        response.setHeader(headerKey,headerValue);

        this.pdfGeneratorService.export(response, localDateTime);
    }
}
// TODO: 18.01.2023
// Poszukanie darmowej API dla prognozy pogody
// Implementacja Weather API
// Dodanie error.html
// Testy aplikacji

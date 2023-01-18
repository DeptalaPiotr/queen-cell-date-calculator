package pl.deptala.piotr.queencelldatecalculator.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.deptala.piotr.queencelldatecalculator.service.CalenderService;

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
    @PostMapping
    public void beeQueenIsolation(LocalDateTime localDate, ModelMap modelMap) {
        LOGGER.info("create()");
        LocalDateTime beeQueenIsolation = calenderService.beeQueenIsolation(localDate);
        modelMap.addAttribute("beeQueenIsolation", beeQueenIsolation);

        LocalDateTime raisingColony = calenderService.raisingColony(localDate);
        modelMap.addAttribute("raisingColony", raisingColony);

        LocalDateTime larvaeTransfer = calenderService.larvaeTransfer(localDate);
        modelMap.addAttribute("larvaeTransfer", larvaeTransfer);

        LocalDateTime returningQueen = calenderService.returningQueen(localDate);
        modelMap.addAttribute("returningQueen", returningQueen);

        LocalDateTime returningQueenNoLater = calenderService.returningQueenNoLater(localDate);
        modelMap.addAttribute("returningQueenNoLater", returningQueenNoLater);

        LocalDate sealingWax = calenderService.sealingWax(LocalDate.from(localDate));
        modelMap.addAttribute("sealingWax", sealingWax);

        LocalDate histolysis = calenderService.histolysis(LocalDate.from(localDate));
        modelMap.addAttribute("histolysis", histolysis);

        LocalDate insulation = calenderService.insulation(LocalDate.from(localDate));
        modelMap.addAttribute("insulation", insulation);

        LocalDate possibleQueenHatching = calenderService.possibleQueenHatching(LocalDate.from(localDate));
        modelMap.addAttribute("possibleQueenHatching", possibleQueenHatching);

        LocalDate queenHatching = calenderService.queenHatching(LocalDate.from(localDate));
        modelMap.addAttribute("queenHatching", queenHatching);
        LOGGER.info("create(...)");
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
    @GetMapping
    public String list() {
        LOGGER.info("list()");
        LOGGER.info("list(...)");
        return "calendar.html";
    }
}

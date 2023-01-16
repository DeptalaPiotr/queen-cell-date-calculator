package pl.deptala.piotr.queencelldatecalculator.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.deptala.piotr.queencelldatecalculator.service.CalenderService;

import java.time.LocalDate;
import java.util.logging.Logger;

@Controller
@RequestMapping(value = "/calendar")
public class CalenderController {

    private static final Logger LOGGER = Logger.getLogger(CalenderController.class.getName());

//
//    // Date
//    @GetMapping
//    public void date(ModelMap modelMap){
//        LocalDate toDay = LocalDate.now();
//        modelMap.addAttribute("toDay",toDay);
//    }

    // C - create
    public void create() {
        LOGGER.info("create()");
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

package pl.deptala.piotr.queencelldatecalculator.service;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Service;
import pl.deptala.piotr.queencelldatecalculator.web.model.QueenBeesReproductionCalendarModel;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.logging.Logger;

@Service
public class PdfGeneratorService {

    private static final Logger LOGGER = Logger.getLogger(PdfGeneratorService.class.getName());

    private CalenderService calenderService;

    public PdfGeneratorService(CalenderService calenderService) {
        this.calenderService = calenderService;
    }

    public void export(HttpServletResponse response, LocalDateTime localDateTime) throws IOException {

        LOGGER.info("export(" + response + ")");

        Document document = new Document(PageSize.A4);
        PdfWriter.getInstance(document, response.getOutputStream());

        document.open();
        Font fontTitle = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontTitle.setSize(18);

        Paragraph paragraph = new Paragraph("Kalendarz wychowu matek pszczelich", fontTitle);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        Font fontParagraph = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        fontParagraph.setSize(12);

        Paragraph paragraph2 = new Paragraph("Harmonogram prac", fontParagraph);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        Paragraph paragraph3 = new Paragraph("Data oraz godzina prac", fontParagraph);
        paragraph.setAlignment(Paragraph.ALIGN_CENTER);

        QueenBeesReproductionCalendarModel calculate = calenderService.calculate(localDateTime);

        Table table = new Table(2);

        table.addCell(new Cell(paragraph2));
        table.addCell(new Cell(paragraph3));

        table.addCell(new Cell("Izolacja matki"));
        table.addCell(new Cell(String.valueOf(calculate.getBeeQueenIsolation())));

        table.addCell(new Cell("Zabranie z rodziny wychowującej matki i zrobienie miejsca na ramkę z miseczkami matecznikowymi"));
        table.addCell(new Cell(String.valueOf(calculate.getRaisingColony())));

        table.addCell(new Cell("Przekładanie larw jednodniowych"));
        table.addCell(new Cell(String.valueOf(calculate.getLarvaeTransfer())));

        table.addCell(new Cell("Zwrot matki do rodziny wychowującej i odizolowanie jej od ramki matecznikowej"));
        table.addCell(new Cell(String.valueOf(calculate.getReturningQueen())));

        table.addCell(new Cell("Zwrot matki do rodziny wychowującej i odizolowanie jej od ramki matecznikowej - nie później niż"));
        table.addCell(new Cell(String.valueOf(calculate.getReturningQueenNoLater())));

        table.addCell(new Cell("Zasklepienie mateczników"));
        table.addCell(new Cell(String.valueOf(calculate.getSealingWax())));

        table.addCell(new Cell("Histoliza"));
        table.addCell(new Cell(String.valueOf(calculate.getHistolysis())));

        table.addCell(new Cell("Izolacja mateczników"));
        table.addCell(new Cell(String.valueOf(calculate.getInsulation())));

        table.addCell(new Cell("Możliwe wygryzanie matek"));
        table.addCell(new Cell(String.valueOf(calculate.getPossibleQueenHatching())));

        table.addCell(new Cell("Wygryzanie matek"));
        table.addCell(new Cell(String.valueOf(calculate.getQueenHatching())));


        document.add(paragraph);
        document.add(table);
        document.close();
    }
}

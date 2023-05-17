package foev;

import foev.service.ExcelParser;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;


class ExcelParserTest {

    @Test
    void parseExcel() throws IOException, URISyntaxException {
        ExcelParser parser = new ExcelParser();
        parser.parseExcel("2023-5.xlsx");

    }

}
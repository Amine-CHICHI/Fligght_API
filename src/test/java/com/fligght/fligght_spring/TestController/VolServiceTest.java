package com.fligght.fligght_spring.TestController;
import com.fligght.fligght_spring.dto.VolDto;
import com.fligght.fligght_spring.service.VolService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
public class VolServiceTest {

    @Autowired
    VolService volService;

    @Test
    public void testGetAllFlights() {
        List<VolDto> volDtoList = volService.findFlights();
        assertEquals(volDtoList.size(), 34);

    }

    @Test
    public void testGetRelevantFlights() {

        VolDto volDto = new VolDto();
        volDto.setAeroportDepartName("Aéroport Rabat-Salé");
        volDto.setAeroportArriveName("Paris-Charles de Gaulle");
        volDto.setCabineType("");
        volDto.setDateDepart(null);
        volDto.setDateArrivee(null);

        List<VolDto> volDtoList = volService.getRelevantFlights(volDto);
        assertEquals(volDtoList.size(), 6);
    }
}

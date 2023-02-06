package io.codelex.dynamiccontentwithjavaspring;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MenuServicesTest {

    MenuServices menuServices = new MenuServices();

    @Test
    public void testGetTime() {
        String time = menuServices.getTime();
        String expectedTime = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        assertEquals(time, expectedTime);
    }

    @Test
    public void testGetDate() {
        String date = menuServices.getDate();
        String expectedDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        assertEquals(date, expectedDate);
    }

    @Test
    public void testGetRandomInt() {
        int randomInt = menuServices.getRandomInt();
        assertTrue(randomInt >= 1 && randomInt <= 10);
    }

}

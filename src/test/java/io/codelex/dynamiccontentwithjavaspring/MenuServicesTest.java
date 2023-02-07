package io.codelex.dynamiccontentwithjavaspring;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MenuServicesTest {

    Clock fixedClock = Clock.fixed(Instant.parse("2023-02-07T10:15:30.00Z"), ZoneId.of("UTC"));
    MenuServices menuServices = new MenuServices(fixedClock);
    @Test
    public void testGetTime() {
        String time = menuServices.getTime();
        String expectedTime = LocalTime.ofInstant(fixedClock.instant(), fixedClock.getZone()).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        assertEquals(time, expectedTime);
    }

    @Test
    public void testGetDate() {
        String date = menuServices.getDate();
        String expectedDate = LocalDate.ofInstant(fixedClock.instant(), fixedClock.getZone()).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        assertEquals(date, expectedDate);
    }

    @Test
    public void testGetRandomInt() {
        int randomInt = menuServices.getRandomInt();
        assertTrue(randomInt >= 1 && randomInt <= 10);
    }

}

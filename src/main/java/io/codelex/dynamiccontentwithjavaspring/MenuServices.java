package io.codelex.dynamiccontentwithjavaspring;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class MenuServices {
    int count;
    Random random = new Random();

    public String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getDate() {
        return LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public int getRandomInt() {
        count++;
        return random.nextInt(10) + 1;
    }

    public int getCount() {
        return count;
    }
}

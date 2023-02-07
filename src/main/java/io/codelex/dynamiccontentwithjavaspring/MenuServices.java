package io.codelex.dynamiccontentwithjavaspring;

import org.springframework.stereotype.Service;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

@Service
public class MenuServices {
    private int count;
    private final Random random = new Random();
    private final Clock clock;

    public MenuServices(Clock clock) {
        this.clock = clock;
    }

    public String getTime() {
        return LocalTime.now(clock).format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public String getDate() {
        return LocalDate.now(clock).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public int getRandomInt() {
        count++;
        return random.nextInt(10) + 1;
    }

    public int getCount() {
        return count;
    }
}

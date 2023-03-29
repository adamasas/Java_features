package lt.kaunas.jug.java;

import java.time.LocalDateTime;

public record JugEvent(String topic, LocalDateTime time) {

}

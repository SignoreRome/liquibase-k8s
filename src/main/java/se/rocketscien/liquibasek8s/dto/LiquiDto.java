package se.rocketscien.liquibasek8s.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

import java.time.LocalDateTime;

public record LiquiDto(
        String info,
        @JsonDeserialize(using = LocalDateTimeDeserializer.class)
        LocalDateTime time
) {
}

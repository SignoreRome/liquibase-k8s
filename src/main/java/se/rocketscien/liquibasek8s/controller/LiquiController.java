package se.rocketscien.liquibasek8s.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.rocketscien.liquibasek8s.dto.LiquiDto;
import se.rocketscien.liquibasek8s.repository.LiquiRepository;

import java.util.List;

@RestController
@RequestMapping(value = "/liqui")
@RequiredArgsConstructor
public class LiquiController {

    private final LiquiRepository repository;

    @GetMapping
    public List<LiquiDto> getAll() {
        return repository.getAll().stream()
                .map(l -> new LiquiDto(l.getInfo(), l.getTime()))
                .toList();
    }

}

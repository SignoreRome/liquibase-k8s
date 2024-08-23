package se.rocketscien.liquibasek8s.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "t_liqui")
@Entity
@Getter
@NoArgsConstructor
public class Liqui {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String info;

    private LocalDateTime time;

}

package se.rocketscien.liquibasek8s.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import se.rocketscien.liquibasek8s.entity.Liqui;

import java.util.List;

@Repository
public interface LiquiRepository extends JpaRepository<Liqui, Long> {

    @Query("from Liqui order by time")
    List<Liqui> getAll();

}

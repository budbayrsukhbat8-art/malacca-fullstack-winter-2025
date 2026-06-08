package icode.mn.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import icode.mn.model.Film;

@Repository
public interface  FilmRepository extends JpaRepository<Film, Long> {
    @Query("SELECT f FROM Film f WHERE "
        +"LOWER(f.title) LIKE LOWER(CONCAT('%', :search, '%')) OR "
        +"LOWER(f.description) LIKE LOWER(CONCAT('%', :search, '%'))"
    )
    Page<Film> searchFilms(@Param("search") String search, Pageable pageable);
}
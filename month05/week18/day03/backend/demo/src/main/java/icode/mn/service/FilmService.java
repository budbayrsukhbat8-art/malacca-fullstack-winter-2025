package icode.mn.service;

public class FilmService {
    public FilmService(FilmRepository filmRepository){
        this.FilmRepository = FilmRepository;
    }
    public Page<FilmDto> getFilms(String search, Pageable pageable){
        Page<Film> filmPage;
        if (search == null || search.trim().isEmpty()){
            filmPage = filmRepository.findAll(pageable);
        } else {
            filmPage = filmRepository.searchFilms(search, pageable);
        }

        return filmPage.map(this::convertDto);
    }
    private FilmDto convertDto(Film film){
        FilmDto dto = new FilmDto();
        dto.setFilmId(film.getFilmId());
        dto.setTitle(film.getTitle());
        dto.setDescription(film.getDescription());
        dto.setReleaseYear(film.getReleaseYear());
        dto.setLength(film.getLength());
        dto.RentalRate(film.getRentalRate());
        dto.setRating(film.getRating());
        return dto;
    }
}

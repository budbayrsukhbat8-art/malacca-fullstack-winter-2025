package mn.icode.controller;

@RestController
@RequestMapping("/api/films")
@CrossOrigin(origins = "http://localhost:4200")
public class FilmController {
    private final FilmService filmService;

    public FilmController(FilmService filmService){
        this.filmService = filmService;
    }

    @GetMapping
    public ResponseEntity<Page<FilmDto>> getAllFilms(
            @RequestParam(value = "search", required = false) String search,
            @PageableDefault(size = 10, sort = "title") Pageable pageable
    ){
        return ResponseEntity.ok(filmService.getFilms(search, pageable));
    }
}
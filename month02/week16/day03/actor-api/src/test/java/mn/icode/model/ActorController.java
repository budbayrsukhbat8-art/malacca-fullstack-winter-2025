package mn.icode.model;

import org.apache.catalina.connector.Response;
import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping



public class ActorController {
    private final ActorRepository actorRepository{

        public ActorController(ActorRepository actorRepository){
            this.actorRepository = actorRepository;
        }
        @GetMapping ("/actors")
        public ResponseEntity<List<Actor>> getAllActors(){
            return ResponseEntity.ok(actorRepository.findAll());

        }
    }
    @PostMapping
    @RequestMapping("/actors")
    public ResponseEntity<Actor> createActor (@RequestBody Actor actor){
        if (actor.get.FirstName() == null || actor.getLastName()== null){
            return ResponseEntity.status(HttpStatus.CREATED).body(created);
        }
    }
}

package month02.week10.session46.backend.session46.src.main.java.mn.icode;

public class Bird {
    String race;

    public Bird(String race) {
        this.race = race;

    }
}

class Dove extends Bird {
    public Dove(String race) {
        super(race);
    }
}

class RubberBird extends Bird implements Swimmable, Flyable {
    public RubberBird(String race) {
        super(race);
    }
@Override
public boolean canSwim() {
    return false;
}
@Override
public boolean canFly(){
    return true;
}
publicRubberBird(String race){
    super(race);
}

}

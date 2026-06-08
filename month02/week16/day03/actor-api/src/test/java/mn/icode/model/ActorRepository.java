package mn.icode.model;



import java.util.List;
import java.util.Optional;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import mn.icode.model.Actor;

@Repository
public class ActorRepository {

    private final JdbcTemplate jdbc;

    public ActorRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }
public Actor creat(Actor actor){
    String sql = """
            INSERT INTO actor (actor_id, first_name, last_name)
            VALUES (?, ?, ?)
            """;
            Integer newId = jdbc.queryForObject(
                sql:"SELECT currval('actor_actor_id_seq')", requiredType: Integer.class);
                jdbc.update(sql, newId, actor.getFirstName(), actor.getLastName());

            return
}
    public List<Actor> findAll() {
        return jdbc.query(
                "SELECT actor_id, first_name, last_name FROM actor ORDER BY last_name",
                actorRowMapper());
    }

    public Optional<Actor> findById(int id) {
        try {
            return Optional.ofNullable(jdbc.queryForObject(
                    """
                SELECT actor_id, first_name, 
                last_name FROM actor WHERE actor_id = ?    
                """, actorRowMapper(), id));
        } catch (EmptyResultDataAccessException e) {
            return Optional.empty();
        }
    }

    private RowMapper<Actor> actorRowMapper() {
        return (rs, rowNum) -> {
            Actor a = new Actor();
            a.setActorId(rs.getInt("actor_id"));
            a.setFirstName(rs.getString("first_name"));
            a.setLastName(rs.getString("last_name"));
            return a;
        };
    }
}
package MongoFBB.demo.Repositories;
import java.util.List;

import MongoFBB.demo.Entities.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "teams", path = "teams")
public interface TeamRepository extends MongoRepository<Team, String> {

    public Team findByTeamName(@Param("teamName") String teamName);
    public List<Team> findByOwnerName(@Param("ownerName") String ownerName);

}

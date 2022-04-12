package MongoFBB.demo.Repositories;
import java.util.List;

import MongoFBB.demo.Entities.Owner;
import MongoFBB.demo.Entities.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "owners", path = "owners")
public interface OwnerRepository extends MongoRepository<Owner, String>{

    public Owner findByOwnerName(@Param("ownerName") String ownerName);
    public List<Owner> findByTeamName(@Param("teamName") String teamName);
}

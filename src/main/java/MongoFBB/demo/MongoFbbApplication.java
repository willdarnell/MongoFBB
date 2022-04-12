package MongoFBB.demo;

import MongoFBB.demo.Entities.Owner;
import MongoFBB.demo.Entities.Team;
import MongoFBB.demo.Repositories.OwnerRepository;
import MongoFBB.demo.Repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoFbbApplication implements CommandLineRunner {
	@Autowired
	private TeamRepository repository;
	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoFbbApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		ownerRepository.deleteAll();

		ownerRepository.save(new Owner("Will Darnell",
				"willdarnell@gmail.com",
				"Kareem Abdul Gom Jabbars"));
		repository.save(new Team("Jabronis", "Trent Johnson"));
		repository.save(new Team("Regular Season Champs", "Chris Dismuke"));


		System.out.println("Owners found with findAll():");
		System.out.println("---------------------------");
		for (Owner owner : ownerRepository.findAll()) {
			System.out.println(owner);
		}
		System.out.println();


		System.out.println("Teams found with findAll():");
		System.out.println("---------------------------");
		for(Team team : repository.findAll()) {
			System.out.println(team);
		}
		System.out.println();

		System.out.println("Team found with findByTeamName('Jabronis')");
		System.out.println("---------------------------");
		System.out.println(repository.findByTeamName("Jabronis"));

		System.out.println("Team found with findByOwnerName('Trent Johnson')");
		System.out.println("---------------------------");
		for(Team team : repository.findByOwnerName("Trent Johnson")) {
			System.out.println(team);
		}
	}
}
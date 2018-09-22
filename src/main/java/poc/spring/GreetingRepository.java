package poc.spring;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {

	<S extends Greeting> S save(S entity);

	Optional<Greeting> findById(Long id);
	
	Iterable<Greeting> findAll();
}
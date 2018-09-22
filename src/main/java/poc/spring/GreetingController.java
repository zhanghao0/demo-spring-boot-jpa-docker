package poc.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GreetingController {
	@Autowired
    private GreetingRepository repository;

    @RequestMapping(path = "/greetings", method = RequestMethod.POST)
    public Greeting create(@RequestBody CreateGreetingRequest request) {
    	Greeting greeting = new Greeting();
    	greeting.setContent(request.getContent());
    	
    	return this.repository.save(greeting);
    }

    @RequestMapping(path = "/greetings", method = RequestMethod.GET)
    public Iterable<Greeting> findAll() {
        return this.repository.findAll();
    }
}

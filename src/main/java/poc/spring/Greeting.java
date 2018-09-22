package poc.spring;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private String content;

    public Greeting() {
		super();
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
        return id;
    }

	public void setContent(String content) {
		this.content = content;
	}

    public String getContent() {
        return content;
    }

}

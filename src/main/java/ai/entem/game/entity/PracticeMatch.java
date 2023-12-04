package ai.entem.game.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
public class PracticeMatch {
	
	@Id
	private Integer id;
	private Date date;
	private String url;
	private String teamAColor;
	private String teamBColor;

	

}

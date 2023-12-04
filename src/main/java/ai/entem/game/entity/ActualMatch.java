package ai.entem.game.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
public class ActualMatch {
	
	@Id
	private Integer id;
	private Integer teamAId;
	private Integer teamBId;
	private Date date;
	private String teamAColor;
	private String teamBColor;
	private String url;
	private Double teamAScore;
	private Double teamBScore;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "actualMatch", orphanRemoval = true)
	private Set<ActualMatchPlayerIndividualPerformance> players = new HashSet<>();
	
	

}

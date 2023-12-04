package ai.entem.game.entity;

import java.sql.Time;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

//@Entity
@Getter
@Setter
public class ActualMatchPlayerIndividualPerformance {
	
	private Time timeStamp;
	private String keyEmotion;
	private Double confidence;
	private Double engagement;
	private Double control;
	private Double energy;
	private Double peakPerformance;
	private String valence;
	private String impactLevel;
	private Double impact;
	private String actionableRecommendation;
	private String insightComment;
	
	

}

package ai.entem.game.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "et_user")
public class User {

	@Id
	private String username;
	private String password;
	private String email;
	private String mobile;
	private LocalDate birthDate;

}

package ai.entem.game.service.impl;

import org.springframework.stereotype.Service;

import ai.entem.game.dto.UserRegistrationRequestDto;
import ai.entem.game.entity.User;
import ai.entem.game.repository.UserRepository;
import ai.entem.game.service.UserService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;

	@Override
	public void registerUser(UserRegistrationRequestDto userRegistrationRequestDto) {

		// STEP 1: create entity object
		final var user = new User();

		user.setUsername(userRegistrationRequestDto.getUsername());
		user.setPassword(userRegistrationRequestDto.getPassword());
		user.setEmail(userRegistrationRequestDto.getEmail());
		user.setMobile(userRegistrationRequestDto.getMobile());
		user.setBirthDate(userRegistrationRequestDto.getBirthDate());

		// STEP 2: save to database
		this.userRepository.save(user);

	}

}

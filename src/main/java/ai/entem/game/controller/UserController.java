package ai.entem.game.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.entem.game.dto.ApiResponse;
import ai.entem.game.dto.UserRegistrationRequestDto;
import ai.entem.game.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

	private final UserService userService;

	@PostMapping("/register")
	public ApiResponse<String> registerUser(@Valid @RequestBody UserRegistrationRequestDto userRegistrationRequestDto) {

		this.userService.registerUser(userRegistrationRequestDto);

		return ApiResponse.<String>builder()
				.httpStatus(HttpStatus.CREATED)
				.message("User registered successfully")
				.build();
	}

}

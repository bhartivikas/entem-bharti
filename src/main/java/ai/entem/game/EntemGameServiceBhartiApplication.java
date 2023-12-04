package ai.entem.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class EntemGameServiceBhartiApplication {
	
	private final ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(EntemGameServiceBhartiApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void printAllEndPoints() {
		
		final var mapping = this.applicationContext.getBean(RequestMappingHandlerMapping.class);
		final var methods = mapping.getHandlerMethods();
		methods.forEach((k,v) -> log.info("URL: {} - MethodSignature: {}", k,v));
		
		
		
	}

}

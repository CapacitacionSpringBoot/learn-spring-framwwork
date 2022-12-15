package com.fam.springboot.learnspringframwwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.fam.springboot.learnspringframwwork.enterprise.example.MyWebController;
import com.fam.springboot.learnspringframwwork.game.GameRunner;
import com.fam.springboot.learnspringframwwork.game.GamingConsole;
import com.fam.springboot.learnspringframwwork.game.MarioGame;
import com.fam.springboot.learnspringframwwork.game.PacmanGame;
import com.fam.springboot.learnspringframwwork.game.SuperContraGame;

@SpringBootApplication
public class LearnSpringFramwworkApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFramwworkApplication.class, args);
		
//		GamingConsole game = new PacmanGame();
//		GameRunner runner = new GameRunner(game);
		
		GameRunner runner = context.getBean(GameRunner.class);
		
		runner.run();
		
		MyWebController controller = context.getBean(MyWebController.class);
		
		System.out.println(controller.returnValueFromBusinessService());
	}

}

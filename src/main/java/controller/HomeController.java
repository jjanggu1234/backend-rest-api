package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HomeController {
	@GetMapping("/")
	public String index() {
<<<<<<< HEAD
		log.info("수정5");
=======
		log.info("수정3");
>>>>>>> branch 'master' of D:\kosa-course\projects\06-git\backend-rest-api
		return "index";
	}

}

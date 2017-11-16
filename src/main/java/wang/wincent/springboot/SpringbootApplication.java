package wang.wincent.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
@Configuration
public class SpringbootApplication {
	
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
	    return "hello world！";
	}

	public static void main(String[] args){
		SpringApplication  app=new SpringApplication(SpringbootApplication.class);
		app.setBannerMode(Mode.OFF);
		app.run(SpringbootApplication.class, args);
	}
	
	
	
}

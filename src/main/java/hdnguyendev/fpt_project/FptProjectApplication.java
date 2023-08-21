package hdnguyendev.fpt_project;

import hdnguyendev.fpt_project.sb1.Girl;
import hdnguyendev.fpt_project.sb1.Outfit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


// Spring's main task: create a container that contains our dependencies

@SpringBootApplication
public class FptProjectApplication {

	public static void main(String[] args) {
		// container = ApplicationContext
		ApplicationContext context = SpringApplication.run(FptProjectApplication.class, args); // create Container

		Outfit outfit = context.getBean(Outfit.class);

		System.out.println("Instance: " + outfit);
		outfit.wear();

		Girl girl = context.getBean(Girl.class);

		System.out.println("Girl Instance: " + girl);
		System.out.println("Girl Outfit: " + girl.outfit);

		girl.outfit.wear();

	}
}

/*
* @Component is an Annotation, marked on the Class to help Spring know it is Bean
* @Autowired
* Các Bean được quản lí bên trong ApplicationContext đều là singleton
*
* */
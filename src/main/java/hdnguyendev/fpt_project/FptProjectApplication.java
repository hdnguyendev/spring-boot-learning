package hdnguyendev.fpt_project;

import hdnguyendev.fpt_project.sb4.Girl;
import hdnguyendev.fpt_project.sb4.GirlService;
import hdnguyendev.fpt_project.sb7.DatabaseConnector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


// Spring's main task: create a container that contains our dependencies

@SpringBootApplication
public class FptProjectApplication {

    public static void main(String[] args) {
        // container = ApplicationContext
        ApplicationContext context = SpringApplication.run(FptProjectApplication.class, args); // create Container

//        Outfit outfit = context.getBean(Outfit.class);
//
//        System.out.println("Instance: " + outfit);
//        outfit.wear();
//
//        Girl girl1 = context.getBean(Girl.class);
//
//        System.out.println("Girl Instance: " + girl1);
//        System.out.println("Girl Outfit: " + girl1.outfit);
//
//        girl1.outfit.wear();
//        Girl girl2 = context.getBean(Girl.class);
//
//        System.out.println("Girl Instance: " + girl2);
//        System.out.println("Girl Outfit: " + girl2.outfit);
//
//        girl2.outfit.wear();
//        context.getBeanFactory().destroyBean(girl1);
//        context.getBeanFactory().destroyBean(girl2);

        /* SB 4*/
//        GirlService girlService = context.getBean(GirlService.class);
//
//        Girl girl = girlService.getRandomGirl();
//        System.out.println(girl);
        /* SB 7*/
        DatabaseConnector databaseConnector = context.getBean(DatabaseConnector.class);
        databaseConnector.connect();
    }
}

/*
 * @Component is an Annotation, marked on the Class to help Spring know it is Bean
 * @Autowired
 * Các Bean được quản lí bên trong ApplicationContext đều là singleton
 * @PostConstruct
 * @PreDestroy
 * @Controller
 * @Service
 * @Repository
 * */

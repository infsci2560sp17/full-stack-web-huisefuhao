package edu.infsci2560;

import edu.infsci2560.models.Room;
import edu.infsci2560.models.Room.RoomType;
import edu.infsci2560.models.Room.BedType;
import edu.infsci2560.repositories.RoomRepository;
import edu.infsci2560.models.Activity;
import edu.infsci2560.models.Activity.ActivityType;
import edu.infsci2560.repositories.ActivityRepository;
import edu.infsci2560.models.Breakfast;
import edu.infsci2560.models.Breakfast.BreakfastType;
import edu.infsci2560.repositories.BreakfastRepository;
import edu.infsci2560.models.Reservation;
import edu.infsci2560.repositories.ReservationRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        RoomRepository roomrepository = ctx.getBean(RoomRepository.class);
        roomrepository.save(new Room(1L, "beast", RoomType.Suite, 120L, 60L, 3L, 2L, BedType.King));
        roomrepository.save(new Room(2L, "cow", RoomType.QueenSizeRoom, 110L, 50L, 2L, 1L, BedType.Queen));
        roomrepository.save(new Room(3L, "deer", RoomType.Suite, 100L, 55L, 2L, 1L, BedType.King));

        ActivityRepository activityrepository = ctx.getBean(ActivityRepository.class);
        activityrepository.save(new Activity(1L, "beast", ActivityType.Unknown, "beast", "beast", "beast"));
        activityrepository.save(new Activity(2L, "cow", ActivityType.Unknown, "beast", "beast", "beast"));
        activityrepository.save(new Activity(3L, "deer", ActivityType.Unknown, "beast", "beast", "beast"));

        BreakfastRepository breakfastrepository = ctx.getBean(BreakfastRepository.class);
        breakfastrepository.save(new Breakfast(1L, "beast", BreakfastType.Unknown, "beast", "beast", "beast"));
        breakfastrepository.save(new Breakfast(2L, "cow", BreakfastType.Unknown, "beast", "beast", "beast"));
        breakfastrepository.save(new Breakfast(3L, "deer", BreakfastType.Unknown, "beast", "beast", "beast"));

        ReservationRepository reservationrepository = ctx.getBean(ReservationRepository.class);
        reservationrepository.save(new Reservation(1L, "beast", 120L, "beast", "beast"));
        reservationrepository.save(new Reservation(2L, "cow",  110L, "beast", "beast"));
        reservationrepository.save(new Reservation(3L, "deer", 55L, "beast", "beast"));
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());            
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }            
//        };
//    }
}

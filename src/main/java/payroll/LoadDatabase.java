package payroll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase2(EmployeeRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Employee("Thorin Oakenshield", "Company Leader")));
            log.info("Preloading " + repository.save(new Employee("Balin son of Fundin", "Lord of Moria")));


        };
    }

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("User adding" + repository.save(new User("JerryGaHe", "Jerry", "Garcia", "1","1","2020-12-08", "2020-12-08", "1")));
            log.info("User adding" + repository.save(new User("Tenchis", "Tencho", "Nodal", "1","2","2020-12-08", "2020-12-08", "1")));
            log.info("User adding" + repository.save(new User("Are", "Areli", "Martinez", "1","3","2020-12-08", "2020-12-08", "1")));
            log.info("User adding" + repository.save(new User("John", "John", "Clifford", "1","2","2020-12-08", "2020-12-08", "1")));
            log.info("User adding" + repository.save(new User("Artis", "Artie", "Curtois", "1","1","2020-12-08", "2020-12-08", "1")));
            log.info("User adding" + repository.save(new User("Emli", "Emily", "Krauss", "1","4","2020-12-08", "2020-12-08", "1")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseDepts(DepartmentRepository repository) {

        return args -> {
            log.info("Dept adding" + repository.save(new Department("dept001", 1, "Department 1", 1, "1", "2018-01-01", "2020-01-01", "type", "CODE", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept002", 2, "Department 2", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept003", 3, "Department 3", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept004", 4, "Department 4", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept005", 5, "Department 5", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept006", 6, "Department 7", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept007", 7, "Department 8", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept008", 8, "Department 29", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info("Dept adding" + repository.save(new Department("dept009", 9, "Department 10", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseCampaigns(CampaignRepository repository) {

        return args -> {
            log.info("Campaign adding" + repository.save(new Campaign("00001", "00041", "00087", "1", "1", 2, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00002", "00042", "00088", "2", "2", 4, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00003", "00043", "00089", "1", "3", 3, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00004", "00044", "00090", "2", "4", 1, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00005", "00045", "00091", "1", "1", 8, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00006", "00046", "00092", "2", "2", 6, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00007", "00047", "00093", "1", "4", 5, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00008", "00048", "00094", "2", "3", 1, "2020-11-01", "2021-02-20", "2")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseProducts(ProductRepository repository) {

        return args -> {
            log.info("adding Product" + repository.save(new Product("000001", "JEANC13245", "Jeans", "Jeans Wrangler Male", 52, 12, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000002", "JEANC45325", "Jeans", "Jeans Wrangler Male", 32, 13, "BR01", "MD09", "", "", "2", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000003", "JEANC66745", "Jeans", "Jeans Wrangler Male", 33, 54, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000004", "JEAND45", "Jeans", "Jeans Wrangler Male", 55, 3, "BR01", "MD09", "", "", "2", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000005", "TSH9098", "T shirt", "T Shirt Wrangler Male", 44, 13, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000006", "TSH9099", "T shirt", "T Shirt Wrangler Female", 77, 19, "BR01", "MD09", "", "", "2", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000007", "JEANC135", "Jeans", "Jeans Wrangler Male", 6, 91, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "")));
            log.info("adding Product" + repository.save(new Product("000008", "JEANC100245", "Jeans", "Jeans Wrangler Male", 89, 1, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseReplenishments(ReplenishmentRepository repository) {

        return args -> {
            log.info("adding Replenishment" + repository.save(new Replenishment("ABDE-001544", "", "0055", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("DERE-001142", "", "0056", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("ETER-001544", "", "0057", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("KIUYT-00144", "", "0058", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("CCOP-021590", "", "0059", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseContent(SiteContentRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new SiteContent("mission", "Mission", 0, "<h1>Mission</h1>")));
            log.info("adding " + repository.save(new SiteContent("who", "Who we are", 0, "<h1>Who we are</h1>")));
            log.info("adding " + repository.save(new SiteContent("board", "Our Board", 0, "<h1>Our Board</h1>")));
            log.info("adding " + repository.save(new SiteContent("blog", "Blog", 0, "<h1>Blog</h1>")));
            log.info("adding " + repository.save(new SiteContent("mission", "Mission", 0, "<h1>Mission</h1>")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseCMS(SiteCMSRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new SiteCMS("imgs/bevariante1.png", "rgb(255,255,255)", "rgb(0,0,0)", "Verdana", "rgb(4,60,148)",  "rgb(255,255,255)")));

        };
    }
}
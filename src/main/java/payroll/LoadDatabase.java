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
    CommandLineRunner initDatabase(UserRepository repository) {

        return args -> {
            log.info("adding" + repository.save(new User(null, "jerry@mail.com", "1234", "Jerry", "", "1", false, "Garcia", "Jerry", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(null, "siteManager@mail.com", "1234", "Site Manager", "", "2", false, "Thomas", "John", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(null, "siteAdmin@mail.com", "1234", "Site Admin", "", "3", false, "Kent", "Clark", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(null, "siteStaff@mail.com", "1234", "Site Staff", "", "4", false, "Lane", "Lois", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(1, "store01Manager@mail.com", "1234", "Store01 Manager", "", "5", false, "James", "Jonas", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(2, "store02Admin@mail.com", "1234", "Store02 Admin", "", "6", false, "Pons", "Dane", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(3, "store03Staff@mail.com", "1234", "Store03 Staff", "", "7", false, "Johnson", "Patrick", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL")));
            log.info("adding" + repository.save(new User(1, "store01Member@mail.com", "1234", "Store01 Member", "", "9", false, "WIlson", "Lamar", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL",false, false, false, false, true, false, false, false )));
            log.info("adding" + repository.save(new User(1, "store01Customer@mail.com", "1234", "Store01 Customer", "", "9", false, "Manning", "Peyton", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL",false, false, false, false, false, true, false, false )));
            log.info("adding" + repository.save(new User(1, "store01Subscriber@mail.com", "1234", "Store01 Subscriber", "", "9", false, "Scott", "Preston", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL",false, false, false, false, false, false, true, false )));
            log.info("adding" + repository.save(new User(1, "store01Supplier@mail.com", "1234", "Store01 Supplier", "", "9", false, "Vick", "John", "address1Text", "address2Text", "City name", "stateCode", 87764, "countryCode", 123456, 2345678, 2345454, "other@mail.com", "Website URL",false, true, false, false, false, false, false, false )));
        };
    }

    @Bean
    CommandLineRunner initDatabaseCUs(CUMessageRepository repository) {

        return args -> {
            log.info("adding" + repository.save(new CUMessage(1, "user@mail.com", 1, null, null, null, "1", "Lionel Messi", "No Name", "Question regarding subscription","asuh iudh qdqudh qiduwqd hqiwdh")));
            log.info("adding" + repository.save(new CUMessage(2, "userTest@mail.com", 1, null, null, null, "2", "Ansu Fati", "Barcelona Team", "Question regarding payments","asuh iudh qdqudh qiduwqd hqiwdh")));
            log.info("adding" + repository.save(new CUMessage(3, "user2@mail.com", 2, null, null, null, "3", "Drew Brees", "No Name", "Question regarding subscription","asuh iudh qdqudh qiduwqd hqiwdh")));
            log.info("adding" + repository.save(new CUMessage(4, "userTes2t@mail.com", 2, null, null, null, "4", "Brett Favre", "Barcelona Team", "Question regarding payments","asuh iudh qdqudh qiduwqd hqiwdh")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseEvents(EventRepository repository) {

        return args -> {
            log.info("adding" + repository.save(new Event("2020-01-01", "1", "1", "Test activity", 9L, "2020-01-01", "2020-01-02", "1", "Device 001", "", "1", "1", "1")));
            log.info("adding" + repository.save(new Event("2021-01-02", "2", "2", "Test activity2", 9L, "2021-01-01", "2021-01-02", "2", "Device 002", "", "2", "2", "2")));
            log.info("adding" + repository.save(new Event("2021-01-03", "3", "3", "Test activity3", 9L, "2021-01-02", "2021-01-03", "1", "Device 003", "", "3", "3", "3")));
            log.info("adding" + repository.save(new Event("2021-01-04", "4", "4", "Test activity4", 9L, "2021-01-03", "2021-01-04", "2", "Device 004", "", "2", "1", "4")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseDepts(DepartmentRepository repository) {

        return args -> {
            log.info(" adding" + repository.save(new Department(1L, 1, "Department 1", 1, "1", "2018-01-01", "2020-01-01", "type", "CODE", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info(" adding" + repository.save(new Department(2L, 2, "Department 2", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));
            log.info(" adding" + repository.save(new Department(3L, 3, "Department 3", 2, "1", "2018-01-01", "2020-01-01", "type", "CODE2", "", "1", "2020-01-01", "2020-01-01", "2020-01-01")));

        };
    }

    @Bean
    CommandLineRunner initDatabaseCMS(SiteCMSRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new SiteCMS(0L,"imgs/bevariante1.png", "rgb(255,255,255)", "rgb(0,0,0)", "Verdana", "rgb(4,60,148)",  "rgb(255,255,255)",  "BeSmart Online Shop", "Online products shopping", "/blog","/imgs/banner1.jpg", "/imgs/banner2.jpg","/imgs/banner3.jpg", "", "", "/imgs/offers1.jpg", "/imgs/offers2.jpg", "/imgs/offers3.jpg", "http://media.w3.org/2010/05/sintel/trailer.mp4", "http://www.facebook.com", "http://www.twitter.com", "http://www.instagram.com", "http://www.pinterest.com", "@2020 HL Productions. All Rights Reserved", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>", "<p>Hi! This is the <strong> Who we are</strong> Content</p>", "<p>Hi! This is the <strong> Board</strong> Content</p>", "<p>Hi! This is the <strong> Features</strong> Content</p>", "<p>Hi! This is the <strong>Sites visitors policies</strong> Content</p>", "<p>Hi! This is the <strong> Contact US</strong> Content</p>", "<p>Hi! This is the <strong> History</strong> Content</p>","<p>Hi! This is the <strong> Site Policies</strong> Content</p>", "<p>Hi! This is the <strong> Membership</strong> Content</p>","<p>Hi! This is the <strong>Costumers policies</strong> Content</p>", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>")));
            log.info("adding " + repository.save(new SiteCMS(1L,"imgs/bevariante2.png", "rgb(255,255,255)", "rgb(0,0,0)", "Verdana", "rgb(37,47,68)",  "rgb(255,255,255)",  "Bags Store Online", "Bags products", "","/imgs/banner1.jpg", "/imgs/banner2.jpg","/imgs/banner3.jpg", "", "", "/imgs/offers1.jpg", "/imgs/offers2.jpg", "/imgs/offers3.jpg", "http://media.w3.org/2010/05/sintel/trailer.mp4", "http://www.facebook.com", "http://www.twitter.com", "http://www.instagram.com", "http://www.pinterest.com", "@2020 HL Productions. All Rights Reserved", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>", "<p>Hi! This is the <strong> Who we are</strong> Content</p>", "<p>Hi! This is the <strong> Board</strong> Content</p>", "<p>Hi! This is the <strong> Features</strong> Content</p>", "<p>Hi! This is the <strong>Sites visitors policies</strong> Content</p>", "<p>Hi! This is the <strong> Contact US</strong> Content</p>", "<p>Hi! This is the <strong> History</strong> Content</p>","<p>Hi! This is the <strong> Site Policies</strong> Content</p>", "<p>Hi! This is the <strong> Membership</strong> Content</p>","<p>Hi! This is the <strong>Costumers policies</strong> Content</p>", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>")));
            log.info("adding " + repository.save(new SiteCMS(2L,"imgs/bevariante3.png", "rgb(255,255,255)", "rgb(0,0,0)", "Verdana", "rgb(96,124,60)",  "rgb(255,255,255)",  "Glasses Store Online", "Glasses products", "http://espndeportes.com","/imgs/banner1.jpg&ref=/store/2", "/imgs/banner2.jpg&ref=/store/2/product/4","/imgs/banner3.jpg", "", "", "/imgs/offers1.jpg", "/imgs/offers2.jpg", "/imgs/offers3.jpg", "http://media.w3.org/2010/05/sintel/trailer.mp4", "http://www.facebook.com", "http://www.twitter.com", "http://www.instagram.com", "http://www.pinterest.com", "@2020 HL Productions. All Rights Reserved", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>", "<p>Hi! This is the <strong> Who we are</strong> Content</p>", "<p>Hi! This is the <strong> Board</strong> Content</p>", "<p>Hi! This is the <strong> Features</strong> Content</p>", "<p>Hi! This is the <strong>Sites visitors policies</strong> Content</p>", "<p>Hi! This is the <strong> Contact US</strong> Content</p>", "<p>Hi! This is the <strong> History</strong> Content</p>","<p>Hi! This is the <strong> Site Policies</strong> Content</p>", "<p>Hi! This is the <strong> Membership</strong> Content</p>","<p>Hi! This is the <strong>Costumers policies</strong> Content</p>", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>")));
            log.info("adding " + repository.save(new SiteCMS(3L,"imgs/mardi6blanco1.png", "rgb(255,255,255)", "rgb(0,0,0)", "Verdana", "rgb(0,0,0)",  "rgb(255,255,255)", "Sports Store Online", "Sports products", "/blog","/imgs/banner1.jpg", "/imgs/banner2.jpg","/imgs/banner3.jpg", "", "", "/imgs/offers1.jpg", "/imgs/offers2.jpg", "/imgs/offers3.jpg", "http://media.w3.org/2010/05/sintel/trailer.mp4", "http://www.facebook.com", "http://www.twitter.com", "http://www.instagram.com", "http://www.pinterest.com", "@2020 HL Productions. All Rights Reserved", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>", "<p>Hi! This is the <strong> Who we are</strong> Content</p>", "<p>Hi! This is the <strong> Board</strong> Content</p>", "<p>Hi! This is the <strong> Features</strong> Content</p>", "<p>Hi! This is the <strong>Sites visitors policies</strong> Content</p>", "<p>Hi! This is the <strong> Contact US</strong> Content</p>", "<p>Hi! This is the <strong> History</strong> Content</p>","<p>Hi! This is the <strong> Site Policies</strong> Content</p>", "<p>Hi! This is the <strong> Membership</strong> Content</p>","<p>Hi! This is the <strong>Costumers policies</strong> Content</p>", "<p>Hi! This is the <strong> Our Mission</strong> Content</p>")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseCampaigns(CampaignRepository repository) {

        return args -> {
            log.info("Campaign adding" + repository.save(new Campaign("00001", 0, "00087", "1", "1", 2, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00002", 0, "00088", "2", "2", 4, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00003", 1, "00089", "1", "3", 3, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00004", 1, "00090", "2", "4", 1, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00005", 2, "00091", "1", "1", 8, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00006", 2, "00092", "2", "2", 6, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00007", 3, "00093", "1", "4", 5, "2020-11-01", "2021-02-20", "2")));
            log.info("Campaign adding" + repository.save(new Campaign("00008", 3, "00094", "2", "3", 1, "2020-11-01", "2021-02-20", "2")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseProducts(ProductRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new Product(1,"000001", "JEANC13245", "Jeans", "Jeans Wrangler Male", 52, 12, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "", "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg", false)));
            log.info("adding " + repository.save(new Product(1,"000002", "JEANC45325", "Jeans", "Jeans Wrangler Male", 32, 13, "BR01", "MD09", "", "", "2", "", "3", "2", "4", "",  "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg",true)));
            log.info("adding " + repository.save(new Product(1,"000003", "JEANC66745", "Jeans", "Jeans Wrangler Male", 33, 54, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "", "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg", false)));
            log.info("adding " + repository.save(new Product(2,"000004", "JEAND45", "Jeans", "Jeans Wrangler Male", 55, 3, "BR01", "MD09", "", "", "2", "", "3", "2", "4", "", "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg",false)));
            log.info("adding " + repository.save(new Product(2,"000005", "TSH9098", "T shirt", "T Shirt Wrangler Male", 44, 13, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "", "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg", true)));
            log.info("adding " + repository.save(new Product(3,"000006", "TSH9099", "T shirt", "T Shirt Wrangler Female", 77, 19, "BR01", "MD09", "", "", "2", "", "3", "2", "4", "", "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg", false)));
            log.info("adding " + repository.save(new Product(3,"000007", "JEANC135", "Jeans", "Jeans Wrangler Male", 6, 91, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "",  "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg", false)));
            log.info("adding " + repository.save(new Product(3,"000008", "JEANC100245", "Jeans", "Jeans Wrangler Male", 89, 1, "BR01", "MD09", "", "", "1", "", "3", "2", "4", "", "/imgs/bag1.jpg", "", "/imgs/bag2.jpg",
                    "/imgs/bag3.jpg", "/imgs/bag4.jpg", "/imgs/bag5.jpg", "/imgs/bag6.jpg", true)));
        };
    }

    @Bean
    CommandLineRunner initDatabaseProdCategories(ProdCategoryRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new ProdCategory(1, "Frutas, verduras y hierbas", "", true)));
            log.info("adding " + repository.save(new ProdCategory(4, "Herramientas eléctricas y manuales", "", true)));
            log.info("adding " + repository.save(new ProdCategory(6, "Artículos de iluminación", "", true)));
            log.info("adding " + repository.save(new ProdCategory(9, "Pinturas y revestimientos", "", true)));
            log.info("adding " + repository.save(new ProdCategory(12, "Herramientas y marcas de jardin", "", true)));
        };
    }
    @Bean
    CommandLineRunner initDatabaseProdSubCategories(ProdSubcategoryRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new ProdSubcategory(1, 1, "Fruta frescas", "", true)));
            log.info("adding " + repository.save(new ProdSubcategory(2, 1, "Fruta Secas", "", true)));
            log.info("adding " + repository.save(new ProdSubcategory(3, 1, "Verduras y vegetales frescos", "", true)));
            log.info("adding " + repository.save(new ProdSubcategory(4, 1, "Hierbas secas", "", true)));

            log.info("adding " + repository.save(new ProdSubcategory(5, 4, "Taladros eléctricos", "", true)));
            log.info("adding " + repository.save(new ProdSubcategory(6, 4, "Taladros a batería", "", true)));

            log.info("adding " + repository.save(new ProdSubcategory(7, 6, "Lámparas de pie", "", true)));
            log.info("adding " + repository.save(new ProdSubcategory(8, 6, "Repuestps y accesorios de iluminación", "", true)));

        };
    }
    @Bean
    CommandLineRunner initDatabaseReplenishments(ReplenishmentRepository repository) {

        return args -> {
            log.info("adding Replenishment" + repository.save(new Replenishment("ABDE-001544", 1, "0055", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("DERE-001142", 1, "0056", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("ETER-001544", 2, "0057", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("KIUYT-00144", 3, "0058", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
            log.info("adding Replenishment" + repository.save(new Replenishment("CCOP-021590", 3, "0059", "2020-05-01", "", "", 1, "00001", "001", 200.00, 190.00, 198.00, 199.00, "2021-01-01", "")));
        };
    }

    @Bean
    CommandLineRunner initDatabaseContent(SiteContentRepository repository) {

        return args -> {
            log.info("adding " + repository.save(new SiteContent("blog", "Blog", 0, "<h1>Blog Smartshop</h1>")));
            log.info("adding " + repository.save(new SiteContent("blog", "Blog", 1, "<h1>Blog Store 1</h1>")));
            log.info("adding " + repository.save(new SiteContent("blog", "Blog", 2, "<h1>Blog Store 2</h1>")));
            log.info("adding " + repository.save(new SiteContent("blog", "Blog", 3, "<h1>Blog Store 3</h1>")));
        };
    }


}
package payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    private final UserRepository userRepository;
    private final DepartmentRepository deptRepository;
    private final CampaignRepository campaignRepository;
    private final ProductRepository productRepository;
    private final ReplenishmentRepository replenishmentRepository;
    private final SiteContentRepository siteContentRepository;
    private final SiteCMSRepository  siteCMSRepository;
    private final CUMessageRepository cUMessageRepository;
    private final EventRepository eventRepository;
    private final ProdCategoryRepository prodCategoryRepository;
    private final ProdSubcategoryRepository prodSubcategoryRepository;


    UserController(UserRepository repository, DepartmentRepository deptRepository, CampaignRepository campaignRepository, ProductRepository productRepository,ReplenishmentRepository replenishmentRepository, SiteContentRepository siteContentRepository, SiteCMSRepository  siteCMSRepository, CUMessageRepository cUMessageRepository, EventRepository eventRepository,
                   ProdCategoryRepository prodCategoryRepository, ProdSubcategoryRepository prodSubcategoryRepository){
        this.userRepository = repository;
        this.deptRepository = deptRepository;
        this.campaignRepository = campaignRepository;
        this.productRepository = productRepository;
        this.replenishmentRepository = replenishmentRepository;
        this.siteContentRepository = siteContentRepository;
        this.siteCMSRepository = siteCMSRepository;
        this.cUMessageRepository = cUMessageRepository;
        this.eventRepository = eventRepository;
        this.prodCategoryRepository = prodCategoryRepository;
        this.prodSubcategoryRepository = prodSubcategoryRepository;

    }

    /* Content ************************************/
    @GetMapping("/content")
    List<SiteContent> allContent() {
        return this.siteContentRepository.findAll();
    }

    @GetMapping("/content/{id}")
    SiteContent oneContent(@PathVariable Long id) {
        return siteContentRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }
    @GetMapping("/content/{sectionId}/{pageId}")
    SiteContent oneContent(@PathVariable  String sectionId, @PathVariable Integer pageId) {
        return siteContentRepository.findBySectionIdAndPageId(sectionId, pageId);
    }



    @PutMapping("/content/{id}")
    SiteContent replaceContent(@RequestBody SiteContent newContent, @PathVariable Long id) {

        return siteContentRepository.findById(id)
                .map(content -> {
                    content.setId(id);
                    content.setContent(newContent.getContent());


                    return siteContentRepository.save(content);
                })
                .orElseGet(() -> {
                    newContent.setId(id);
                    return siteContentRepository.save(newContent);
                });
    }
    /* Departments  ****************************************************/
    @GetMapping("/departments")
    List<Department> allDepts() {
        return this.deptRepository.findAll();
    }

    @GetMapping("/departments/{id}")
    Department oneDept(@PathVariable Long id) {
        return deptRepository.findByDepartmentID(id);
                //.orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/departments")
    Department newDepartment(@RequestBody Department newDept) {
        siteCMSRepository.save(new SiteCMS(newDept.getDepartmentID(),"imgs/mardi6blanco1.png", "rgb(255,255,255)", "rgb(0,0,0)", "Verdana", "rgb(55,55,55)",  "rgb(255,255,255)"));
        return deptRepository.save(newDept);
    }
    /* Campaigns ****************************************************/
    @GetMapping("/campaigns")
    List<Campaign> allCampaigns() {
        return this.campaignRepository.findAll();
    }

    @GetMapping("/campaigns/{id}")
    Campaign oneCategory(@PathVariable Long id) {
        return campaignRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @GetMapping("/campaigns/department/{id}")
    List<Campaign> allCampaignsByDepartment(@PathVariable Integer id) {
        return this.campaignRepository.findByDepartmentID(id);
    }
    /* Products ****************************************************/
    @GetMapping("/products")
    List<Product> allProducts() {
        return this.productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    Product oneProduct(@PathVariable Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @GetMapping("/products/department/{id}")
    List<Product> allProductsByDepartment(@PathVariable Integer id) {
        return this.productRepository.findByDepartmentID(id);
    }

    @GetMapping("/products/categories")
    List<ProdCategory> allProductsCategories() {
        return this.prodCategoryRepository.findAll();
    }
    @GetMapping("/products/category/{id}/subcategories")
    List<ProdSubcategory> allProductsSubCategories(@PathVariable Integer id) {
        return this.prodSubcategoryRepository.findByProdCategoryCode(id);
    }

    /* Replenishments ****************************************************/
    @GetMapping("/replenishments")
    List<Replenishment> allReplenishments() {
        return this.replenishmentRepository.findAll();
    }
    @GetMapping("/replenishments/{id}")
    Replenishment oneReplenishments(@PathVariable Long id) {
        return this.replenishmentRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }
    @GetMapping("/replenishments/department/{id}")
    List<Replenishment> allReplenishmentsByDepartment(@PathVariable Integer id) {
        return this.replenishmentRepository.findByDepartmentID(id);
    }

    /* CUs Messages ****************************************************/
    @GetMapping("/incidents")
    List<CUMessage> allIncidents() {
        return this.cUMessageRepository.findAll();
    }
    @GetMapping("/incidents/{id}")
    CUMessage oneIncident(@PathVariable Long id) {
        return this.cUMessageRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    /* Events ****************************************************/
    @GetMapping("/events")
    List<Event> allEvents() {
        List<Event> events = this.eventRepository.findAll();
        User user = new User();
        for (Event evt : events){
            user = userRepository.findById(evt.getOriginatorID())
                    .orElseThrow(() -> new EmployeeNotFoundException(evt.getOriginatorID()));

            evt.setUsername(user.getUsername());
            evt.setUserStatus(user.getUserStatus());
            evt.setCellPhoneNumber(user.getCellPhoneNumber());
            evt.setFullName(user.getUserFirstName() + " " + user.getUserLastName());
            evt.setUserType(user.getUserType());
            evt.setDepartmentID(user.getDepartmentID());
        }


            return events;
    }
    @GetMapping("/events/{id}")
    Event oneEvent(@PathVariable Long id) {
         Event evt = this.eventRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));

        User user = userRepository.findById(evt.getOriginatorID())
                .orElseThrow(() -> new EmployeeNotFoundException(evt.getOriginatorID()));

         evt.setUsername(user.getUsername());
         evt.setUserStatus(user.getUserStatus());
         evt.setCellPhoneNumber(user.getCellPhoneNumber());
         evt.setFullName(user.getUserFirstName() + " " + user.getUserLastName());
         evt.setUserType(user.getUserType());
         evt.setDepartmentID(user.getDepartmentID());

         return evt;
    }
    /* Users  ****************************************************/
    @GetMapping("/users")
    List<User> allUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {
        return userRepository.findById(id )
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }
    @PostMapping("/users")
    User newUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @PutMapping("/users/{id}")
    User replaceEmployee(@RequestBody User newUser, @PathVariable Long id) {

        return userRepository.findById(id)
                .map(user -> {
                    user.setId(id);
                    user.setAddress1Text(newUser.getAddress1Text());
                    user.setAddress2Text(newUser.getAddress2Text());
                    user.setUsername(newUser.getUsername());
                    user.setUserFirstName(newUser.getUserFirstName());
                    user.setUserLastName(newUser.getUserLastName());
                    user.setUserStatus(newUser.getUserStatus());
                    user.setUsername(newUser.getUsername());
                    user.setPassword(newUser.getPassword());

                    return userRepository.save(user);
                })
                .orElseGet(() -> {
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    @DeleteMapping("/users/{id}")
    void deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
    }
}

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


    UserController(UserRepository repository, DepartmentRepository deptRepository, CampaignRepository campaignRepository, ProductRepository productRepository,ReplenishmentRepository replenishmentRepository, SiteContentRepository siteContentRepository){
        this.userRepository = repository;
        this.deptRepository = deptRepository;
        this.campaignRepository = campaignRepository;
        this.productRepository = productRepository;
        this.replenishmentRepository = replenishmentRepository;
        this.siteContentRepository = siteContentRepository;
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
        return deptRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PostMapping("/departments")
    Department newDepartment(@RequestBody Department newDept) {
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
    /* Products ****************************************************/
    @GetMapping("/replenishments")
    List<Replenishment> allReplenishments() {
        return this.replenishmentRepository.findAll();
    }


    /* Users  ****************************************************/
    @GetMapping("/users")
    List<User> allUsers() {
        return this.userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    User one(@PathVariable Long id) {
        return userRepository.findById(id)
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
                    user.setUserEmail(newUser.getUserEmail());
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

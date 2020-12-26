package payroll;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SiteCMSController {
    private final SiteCMSRepository  siteCMSRepository;

    SiteCMSController(SiteCMSRepository  siteCMSRepository){
        this.siteCMSRepository = siteCMSRepository;
    }

    /* Content ************************************/
    @GetMapping("/cms")
    List<SiteCMS> allCMS() {
        return this.siteCMSRepository.findAll();
    }

    @GetMapping("/cms/{id}")
    SiteCMS oneContent(@PathVariable Long id) {
        return siteCMSRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }


    @PutMapping("/cms/{id}")
    SiteCMS replaceContent(@RequestBody SiteCMS newContent, @PathVariable Long id) {

        return siteCMSRepository.findById(id)
                .map(content -> {
                    System.out.println(newContent.toString());
                    content.setSiteBodyColorRGB(newContent.getSiteBodyColorRGB());
                    content.setSiteMainColorRGB(newContent.getSiteMainColorRGB());
                    content.setSiteBodyFontColorText(newContent.getSiteBodyFontColorText());
                    content.setSiteFontNameText(newContent.getSiteFontNameText());
                    content.setSiteMainFontColorText(newContent.getSiteMainFontColorText());

                    return siteCMSRepository.save(content);
                })
                .orElseGet(() -> {

                    newContent.setSiteID(id);
                    return siteCMSRepository.save(newContent);
                });
    }
}

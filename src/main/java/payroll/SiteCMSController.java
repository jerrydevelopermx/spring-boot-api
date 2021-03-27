package payroll;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SiteCMSController {
    private final SiteCMSRepository  siteCMSRepository;
    private final SiteContentRepository siteContentRepository;

    SiteCMSController(SiteCMSRepository  siteCMSRepository, SiteContentRepository siteContentRepository){
        this.siteCMSRepository = siteCMSRepository;
        this.siteContentRepository = siteContentRepository;
    }

    /* Content ************************************/
    @GetMapping("/cms")
    List<SiteCMS> allCMS() {
        return this.siteCMSRepository.findAll();
    }

    @GetMapping("/cms/{id}")
    SiteCMS oneContent(@PathVariable Long id) {
        return siteCMSRepository.findBySiteID(id);
                //.orElseThrow(() -> new EmployeeNotFoundException(id));
    }

    @PutMapping("/cms/{id}/{sectionId}")
    SiteContent replaceContent(@RequestBody SiteContent newContent, @PathVariable Long id,@PathVariable String sectionId ) {

        SiteCMS cmsContent = siteCMSRepository.findBySiteID(id);
        SiteContent siteContent = siteContentRepository.findBySectionIdAndPageId("blog", id.intValue());
        String newContentStr = newContent.getContent();
        switch (sectionId) {
            case "contactUs":
                System.out.println(cmsContent.toString());
                cmsContent.setSiteID(id);
                cmsContent.setContactUsJson(newContentStr);
                System.out.println(cmsContent.toString());
                siteCMSRepository.save(cmsContent);
                break;
            case "ourMission":
                cmsContent.setSiteID(id);
                cmsContent.setOurServMissionJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "whoWeAre":
                cmsContent.setSiteID(id);
                cmsContent.setOurServWhoWeRJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "board":
                cmsContent.setSiteID(id);
                cmsContent.setOurServBoardJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "features":
                cmsContent.setSiteID(id);
                cmsContent.setOurServFeaturesJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "membership":
                cmsContent.setSiteID(id);
                cmsContent.setOurServMmbshipJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "history":
                cmsContent.setSiteID(id);
                cmsContent.setFooterHistoryJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "sitePolicies":
                cmsContent.setSiteID(id);
                cmsContent.setSitePoliciesJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "membershipPolicies":
                cmsContent.setSiteID(id);
                cmsContent.setSiteMembersPolicyJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "customersPolicies":
                cmsContent.setSiteID(id);
                cmsContent.setSiteCustomrsPolicyJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "visitorsPolicies":
                cmsContent.setSiteID(id);
                cmsContent.setSiteVisitorsPolicyJson(newContentStr);
                siteCMSRepository.save(cmsContent);
                break;
            case "blog":
                siteContent.setPageId(id.intValue());
                siteContent.setContent(newContentStr);
                siteContentRepository.save(siteContent);
                break;
        }

        return siteContent;
    }

    @GetMapping("/cms/{id}/{sectionId}")
    JsonContent oneHtmlContent(@PathVariable Long id, @PathVariable String sectionId) {
        System.out.println(sectionId);
        SiteCMS cmsContent = siteCMSRepository.findBySiteID(id);
        System.out.println(cmsContent.toString());
        String htmlContent = "";

        switch (sectionId) {
            case "contactUs":
                htmlContent = cmsContent.getContactUsJson();
                break;
            case "ourMission":
                htmlContent = cmsContent.getOurServMissionJson();
                break;
            case "whoWeAre":
                htmlContent = cmsContent.getOurServWhoWeRJson();
                break;
            case "board":
                htmlContent = cmsContent.getOurServBoardJson();
                break;
            case "features":
                htmlContent = cmsContent.getOurServFeaturesJson();
                break;
            case "membership":
                htmlContent = cmsContent.getOurServMmbshipJson();
                break;
            case "history":
                htmlContent = cmsContent.getFooterHistoryJson();
                break;
            case "sitePolicies":
                htmlContent = cmsContent.getSitePoliciesJson();
                break;
            case "membershipPolicies":
                htmlContent = cmsContent.getSiteMembersPolicyJson();
                break;
            case "customersPolicies":
                htmlContent = cmsContent.getSiteCustomrsPolicyJson();
                break;
            case "visitorsPolicies":
                htmlContent = cmsContent.getSiteVisitorsPolicyJson();
                break;
            case "blog":
                SiteContent content = siteContentRepository.findBySectionIdAndPageId("blog", id.intValue());
                htmlContent = content.getContent();
                break;
        }
        JsonContent jsonContent = new JsonContent(htmlContent);
        return jsonContent;
    }

    @PutMapping("/cms/{id}")
    SiteCMS replaceContent(@RequestBody SiteCMS newContent, @PathVariable Long id) {

                System.out.println(newContent.toString());
                SiteCMS cms = siteCMSRepository.findBySiteID(id);
                cms.setSiteID(id);
                cms.setSiteBodyColorRGB(newContent.getSiteBodyColorRGB());
                cms.setSiteMainColorRGB(newContent.getSiteMainColorRGB());
                cms.setSiteBodyFontColorText(newContent.getSiteBodyFontColorText());
                cms.setSiteFontNameText(newContent.getSiteFontNameText());
                cms.setSiteMainFontColorText(newContent.getSiteMainFontColorText());

            return siteCMSRepository.save(cms);
    }

    @PutMapping("/cms/{id}/content")
    SiteCMS replaceSiteContent(@RequestBody SiteCMS newContent, @PathVariable Long id) {

        System.out.println(newContent.toString());
        SiteCMS cms = siteCMSRepository.findBySiteID(id);
        cms.setSiteID(id);

        cms.setSiteTitleText(newContent.getSiteTitleText());
        cms.setSiteMetaDescriptionText((newContent.getSiteMetaDescriptionText()));
        cms.setBlogLink(newContent.getBlogLink());

        cms.setSlide1DefaultLink(newContent.getSlide1DefaultLink());
        cms.setSlide2DefaultLink(newContent.getSlide2DefaultLink());
        cms.setSlide3DefaultLink(newContent.getSlide3DefaultLink());
        cms.setSlide4DefaultLink(newContent.getSlide4DefaultLink());
        cms.setSlide5DefaultLink(newContent.getSlide5DefaultLink());

        cms.setEvent1DefaultLink(newContent.getEvent1DefaultLink());
        cms.setEvent2DefaultLink(newContent.getEvent2DefaultLink());
        cms.setEvent3DefaultLink(newContent.getEvent3DefaultLink());

        cms.setTourDefaultLink(newContent.getTourDefaultLink());

        cms.setSiteFacebookLink(newContent.getSiteFacebookLink());
        cms.setSiteTwitterLink(newContent.getSiteTwitterLink());
        cms.setSiteInstagramLink(newContent.getSiteInstagramLink());
        cms.setSitePinterestLink(newContent.getSitePinterestLink());
        cms.setSiteCopyright(newContent.getSiteCopyright());

        return siteCMSRepository.save(cms);
    }

    @GetMapping("/cms/page/{id}")
    CMSPage getPage(@PathVariable Long id) {
        SiteCMS cms = siteCMSRepository.findBySiteID(id);
        System.out.println(cms.toString());
        CMSPage page = new CMSPage();
        page.setId(cms.getSiteID());
        page.setBlogLink(cms.getBlogLink());
        page.setDescription(cms.getSiteMetaDescriptionText());
        page.setName(cms.getSiteTitleText());
        page.setLogo(cms.getSiteLogoLink());

        //Footer
        PageFooter footer = new PageFooter();
        footer.setCopyright(cms.getSiteCopyright());
        List<PageSocial> socialList = new ArrayList<PageSocial>();
        if(cms.getSiteFacebookLink() != null) {
            socialList.add(new PageSocial(cms.getSiteFacebookLink()));
        }
        if(cms.getSiteTwitterLink() != null) {
            socialList.add(new PageSocial(cms.getSiteTwitterLink()));
        }
        if(cms.getSiteInstagramLink() != null) {
            socialList.add(new PageSocial(cms.getSiteInstagramLink()));
        }
        if(cms.getSitePinterestLink() != null) {
            socialList.add(new PageSocial(cms.getSitePinterestLink()));
        }

        PageSocial socials[] = socialList.toArray(new PageSocial[0]);
        footer.setSocial(socials);
        page.setFooter(footer);

        //slides
        List<PageImage> slidesList = new ArrayList<PageImage>();
        if(!cms.getSlide1DefaultLink().equals("")){
            slidesList.add(new PageImage(cms.getSlide1DefaultLink()));
        }
        if(!cms.getSlide2DefaultLink().equals("")){
            slidesList.add(new PageImage(cms.getSlide2DefaultLink()));
        }
        if(!cms.getSlide3DefaultLink().equals("")){
            slidesList.add(new PageImage(cms.getSlide3DefaultLink()));
        }
        if(!cms.getSlide4DefaultLink().equals("")){
            slidesList.add(new PageImage(cms.getSlide4DefaultLink()));
        }
        if(!cms.getSlide5DefaultLink().equals("")){
            slidesList.add(new PageImage(cms.getSlide5DefaultLink()));
        }
        PageImage slides[] = slidesList.toArray(new PageImage[0]);
        page.setSlides(slides);

        //events
        List<PageImage> eventsList = new ArrayList<PageImage>();
        if(!cms.getEvent1DefaultLink().equals("")){
            eventsList.add(new PageImage(cms.getEvent1DefaultLink()));
        }
        if(!cms.getEvent2DefaultLink().equals("")){
            eventsList.add(new PageImage(cms.getEvent2DefaultLink()));
        }
        if(!cms.getEvent3DefaultLink().equals("")){
            eventsList.add(new PageImage(cms.getEvent3DefaultLink()));
        }
        PageImage events[] = eventsList.toArray(new PageImage[0]);
        page.setOffers(events);

        //Styles
        PageStyles styles = new PageStyles();
        PageCSSConfig body = new PageCSSConfig();
        body.setBackground(cms.getSiteBodyColorRGB());
        body.setFontFamily(cms.getSiteFontNameText());
        body.setColor(cms.getSiteBodyFontColorText());
        styles.setBody(body);

        PageCSSGroup header = new PageCSSGroup();
        PageCSSConfig topBar = new PageCSSConfig();
        topBar.setBackground(cms.getSiteMainColorRGB());
        PageCSSConfig headerMenu = new PageCSSConfig();
        headerMenu.setColor(cms.getSiteMainFontColorText());
        header.setTopBar(topBar);
        header.setHeaderMenu(headerMenu);

        PageCSSRootConfig styledMenu = new PageCSSRootConfig();
        PageCSSRootConfig mobileNavBar = new PageCSSRootConfig();
        PageCSSConfig smenu = new PageCSSConfig();
        PageCSSConfig mNavBar = new PageCSSConfig();

        smenu.setBackgroundColor(cms.getSiteMainColorRGB());
        smenu.setColor(cms.getSiteMainFontColorText());
        mNavBar.setBackgroundColor(cms.getSiteMainColorRGB());
        mNavBar.setColor(cms.getSiteMainFontColorText());

        styledMenu.setPaper(smenu);
        mobileNavBar.setPaper(mNavBar);

        header.setStyledMenu(styledMenu);
        header.setMobileNavBar(mobileNavBar);
        styles.setHeader(header);

        PageCSSGroup footerCSS = new PageCSSGroup();
        PageCSSConfig bottomBar = new PageCSSConfig();
        bottomBar.setBackground(cms.getSiteMainColorRGB());
        bottomBar.setColor(cms.getSiteMainFontColorText());
        footerCSS.setBottomBar(bottomBar);
        PageCSSConfig footerLinks = new PageCSSConfig();
        footerLinks.setColor(cms.getSiteMainFontColorText());
        footerCSS.setFooterLinks(footerLinks);
        styles.setFooter(footerCSS);

        PageCSSGroup modalStyles = new PageCSSGroup();
        PageCSSConfig modalHeader = new PageCSSConfig();
        modalHeader.setColor(cms.getSiteMainFontColorText());
        modalHeader.setBackground(cms.getSiteMainColorRGB());
        modalStyles.setHeader(modalHeader);
        PageCSSConfig modalBody = new PageCSSConfig();
        modalBody.setColor(cms.getSiteBodyFontColorText());
        modalBody.setBackground(cms.getSiteBodyColorRGB());
        modalStyles.setBody(modalBody);
        styles.setModalStyles(modalStyles);

        PageCSSRootConfig closeBUtton = new PageCSSRootConfig();
        PageCSSConfig buttonRoot = new PageCSSConfig();
        buttonRoot.setColor(cms.getSiteMainFontColorText());
        buttonRoot.setBackgroundColor(cms.getSiteMainColorRGB());
        closeBUtton.setRoot(buttonRoot);
        modalStyles.setCloseButton(closeBUtton);

        page.setStyles(styles);


        return page;
    }

}
/*
*   SELECT
  nsc.PartnerCD,
  nsc.CustomerID Customer,
  ns.SubscriptionID Subscription,
  ns.SubscriptionLineID 'Subscription Line',
  nsct.display as 'Charge Type',
  so.PartnerRevenueDtm,
  so.PartnerRevenueDtm,
  count(*) as transactionCount,
  sum(sop.PaymentAmt) suma

  FROM NetSuiteSubscription ns
  LEFT JOIN NetSuiteSubscriptionChargeType nsct ON nsct.SubscriptionChargeTypeCD = ns.SubscriptionChargeTypeCD
  LEFT JOIN NetSuiteCustomer nsc ON nsc.CustomerID = ns.CustomerID
   JOIN SyncOrder so ON so.PartnerCD = nsc.PartnerCD
  LEFT JOIN SyncOrderPayment sop ON sop.SyncOrderID = so.SyncOrderID

  GROUP BY
  so.PartnerRevenueDtm,
  so.PartnerRevenueDtm,
  nsc.PartnerCD,
  nsc.CustomerID ,
  SubscriptionID ,
  SubscriptionLineID ,
  nsct.display
  --select distinct PartnerCD from SyncOrder

  SELECT
  so.PartnerCD,
  so.VestaRevenueDtm,
  so.PartnerRevenueDtm,
  count(*) as counting,
  sum(sop.PaymentAmt) as total
  FROM SyncOrder so
  JOIN SyncOrderPayment sop ON sop.SyncOrderID = so.SyncOrderID
  GROUP BY so.PartnerCD, so.VestaRevenueDtm, so.PartnerRevenueDtm,sop.PaymentAmt


  select * from NetSuiteSubscription nss
  JOIN NetSuiteCustomer nsc on nsc.CustomerID = nss.CustomerID

  select
  nsc.CustomerID,
  nss.SubscriptionID,
  nss.SubscriptionLineID,
  nssc.Display,
  fo.VestaRevenueDtm,
	fo.PartnerRevenueDtm,
	count(*) counting,
	sum(PaymentAmt) sum,
	sum(fvf.FeeAmt) fee

   from FinanceOrder fo
  JOIN AccountingEntry ae ON ae.FinanceOrderID = fo.FinanceOrderID
  JOIN FinanceOrderPayment fop ON fop.FinanceOrderID = fo.FinanceOrderID
  JOIN FinanceVestaFee fvf ON fvf.FinanceOrderID = fo.FinanceOrderID
    JOIN AccountingEntryAP aea ON aea.AccountingEntryID = ae.AccountingEntryID
	JOIN NetSuiteCustomer nsc ON nsc.PartnerCD = fo.PartnerCD AND nsc.APVendor = aea.Vendor
	JOIN NetSuiteSubscription nss ON nss.CustomerID = nsc.CustomerID
	JOIN NetSuiteSubscriptionChargeType nssc ON nssc.SubscriptionChargeTypeCD = nss.SubscriptionChargeTypeCD

	group by
	fo.VestaRevenueDtm,
	fo.PartnerRevenueDtm,
	nsc.CustomerID,
  nss.SubscriptionID,
  nss.SubscriptionLineID,
 nssc.Display

*
* 		/*
		select
		tfo.InvoiceType
		,fo.PartnerCD
		,tfo.AccountingEntryAPID
		,tfo.AccountingEntryARDistID
		,ap.vendor

		 ,NetSuiteCustomer  = case
                                   when fo.PartnerCD = 99
                                       then (select CustomerID from NetSuiteCustomer (nolock) where PartnerCD = 99)
                                       else nsc.CustomerID
                                   end
		,GrossReceipts     = case
                                   when tfo.InvoiceType = 'I'
                                       then fop.PaymentAmt
                                       else 0
                                   end
         , ReturnBaseAmt     = case
                                   when tfo.InvoiceType = 'C'
                                       then ard.DistributionAmt
                                       else 0
                                   end from #TempFinanceOrder tfo
		 join FinanceOrder              fo (nolock) on fo.FinanceOrderID          = tfo.FinanceOrderID
		 join FinanceOrderPayment      fop (nolock) on fop.FinanceOrderID         = tfo.FinanceOrderID
		 left join AccountingEntryAP         ap (nolock) on ap.AccountingEntryID     = tfo.AccountingEntryID
		 left join AccountingEntryARDist    ard (nolock) on ard.AccountingEntryID         = tfo.AccountingEntryID
		 left join NetSuiteCustomer         nsc (nolock) on nsc.PartnerCD              = fo.PartnerCD          --  and nsc.APVendor               = ap.Vendor
         --left join NetSuiteItem             nsi (nolock) on nsi.PartnerCD              = fo.PartnerCD
         --left join NetSuitePaymentProcessor nsp (nolock) on nsp.AcquirerID             = fop.AcquirerID          and nsp.PaymentDeviceTypeID    = fop.PaymentDeviceTypeCD

	EXEC NetSuite_Get_Subscriptionstest
   @AsOfDateYYYY    = 2020
,  @AsOfDateMM      = 10
,  @AsOfDateDD      = 14
,  @getDetail        = 0

 */

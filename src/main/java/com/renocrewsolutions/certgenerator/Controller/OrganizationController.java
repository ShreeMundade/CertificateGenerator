package com.renocrewsolutions.certgenerator.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.renocrewsolutions.certgenerator.entity.Organization;

@Controller
public class OrganizationController {

	
	@GetMapping("/Organization")
	@ResponseBody
	public String getOrganization()
	{

	 // only checking
	//  	Organization organization = new Organization();
	//	organization.setOrgName("xyz");
	//	organization.setOrgAddress("mumbai");
	//	organization.setOrgContact("123456789");
		
		return "testing";
	
	}
}

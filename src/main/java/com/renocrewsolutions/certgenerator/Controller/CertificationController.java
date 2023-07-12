package com.renocrewsolutions.certgenerator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.renocrewsolutions.certgenerator.entity.Certification;

@Controller
public class CertificationController {
	
	@GetMapping("/certificate")
	@ResponseBody
	public String getCertification()
	{
	
	 // only checking
	//	Certification certification =new Certification();
	//	certification.setCertiName("xyz");
	//	certification.setCertiDescription("This is intership certicate");
	//	certification.setCertiCost(1000);
	
		return "testing";

	}
}
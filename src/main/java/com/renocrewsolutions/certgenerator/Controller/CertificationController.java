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
	
	}
}
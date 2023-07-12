package com.renocrewsolutions.certgenerator.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.renocrewsolutions.certgenerator.entity.Result;

@Controller
public class ResultController {
	
	
	@GetMapping("/result")
	@ResponseBody
	public String getResult()
	{
	// only checking
//	  	Result result=new Result();
	  	
//  	result.setResultScore(133);
//	  	result.setResultDate(null); 
	
		return "testing";


}
}

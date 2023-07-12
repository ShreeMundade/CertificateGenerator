package com.renocrewsolutions.certgenerator.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//import com.renocrewsolutions.certgenerator.entity.Exam;

@Controller
public class ExamController {
	
	@GetMapping("/exam")
	@ResponseBody
	public String getExam()
	{
	
	 // only checking
	//  	Exam exam=new Exam();
	//	exam.setExamName("xyz");
	//	exam.setExamDescrption("	testing");
	//	exam.setExamDuration("120 min");
	//	exam.getExam_attempt_Date();
	
		return "testing";

}

}
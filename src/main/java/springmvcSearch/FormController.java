package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController 
{
	@RequestMapping("/complex")
	public String showForm()
	{
		return "complexform";
	}
//	
//	@RequestMapping(path="/handleform",method=RequestMethod.POST)
//	public String forkHandler(@RequestParam ("name") String name,@RequestParam("id") long id)
//	{
//		
//		System.out.println(name);
//		System.out.println(id);
//		return "success";
//	}

	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String forkHandler(@ModelAttribute("student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complexform";
		}
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
	}
}

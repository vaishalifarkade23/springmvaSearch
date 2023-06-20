package springmvcSearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
	@RequestMapping("/homeintercepter")
	public String home()
	{
		return "homeIntercepter";
	}
	
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name,Model m)
	{
		System.out.println(name);
		m.addAttribute("name", name);
		return "welcome";
	}

}

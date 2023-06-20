package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController
{
	@RequestMapping("/user/{userId}/{userName}")
	public String getUserDetail(@PathVariable("userId") int userId,@PathVariable("userName") String userName)
	{
		System.out.println(userId);
		System.out.println(userName);
		/*to check numberFormatException
		Integer.parseInt(userName);*/
		return "home";
	}
	
	@RequestMapping("/home")
	public String home()
	{
		System.out.println("this is home");
		
		/*  Nullpointer excetion lane ke liye
		String str= null;
		System.out.println(str.length());*/
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query)
	{
		String url="https://www.google.com/search?q="+query;
		
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	
	//to  handle  excetion in spring mvc multiple exception in one mapping
//	@ExceptionHandler({NullPointerException.class,NumberFormatException.class})
//	public String exceptionHander()
//	{
//		return "null_page";
//	}

	
	//to  handle  excetion in spring mvc
	
	/*@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionHanderNull(Model m)
	{
		m.addAttribute("msg", "NullpointerException Has occured");
		return "null_page";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionHanderNumber(Model m)
	{
		m.addAttribute("msg", "NumberFormatException Has occured");
		return "null_page";
	}
	
	//to handle generic/general/all type of Exception
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionHanderGenericException(Model m)
	{
		m.addAttribute("msg", "Exception Has occured");
		return "null_page";
	}*/
	
	
	
}

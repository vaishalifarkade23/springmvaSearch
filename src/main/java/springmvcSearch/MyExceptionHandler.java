package springmvcSearch;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class MyExceptionHandler 
{
	
	//to  handle  excetion in spring mvc genralized exception
	
		@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
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
		}
		

}

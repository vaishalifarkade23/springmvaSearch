package springmvcSearch;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController
{
	@RequestMapping("/fileform")
	public String showfileForm()
	{
		/*exception lane k liye 
		String str= null;
		System.out.println(str.charAt(0));*/
		return "fileForm";
	}
	
@RequestMapping(value="/uploadimage" ,method=RequestMethod.POST)	
public String fileUpload(@RequestParam("image") CommonsMultipartFile img,HttpSession session,Model model)
{
	System.out.println("file upload handler");
	System.out.println(img.getSize());
	System.out.println(img.getContentType());
	System.out.println(img.getName());
	System.out.println(img.getOriginalFilename());
	System.out.println(img.getStorageDescription());
	System.out.println(img.getFileItem());
	System.out.println(img.getBytes());
	
	//get the byte data
	byte[] data=img.getBytes();
	//we have to save this file to server...
	//String path = session.getServletContext().getRealPath("/")+img.getOriginalFilename();
	
	//were we want to upload
	String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resources"+File.separator+"images"+File.separator+img.getOriginalFilename();
	System.out.println(path);
	try
	{
	FileOutputStream fos= new FileOutputStream(path);
	fos.write(data);
	fos.close();
	System.out.println("file uploaded");
	model.addAttribute("msg", "uploaded successfully");
	model.addAttribute("filename", img.getOriginalFilename());
	}
	catch (Exception e) {
		e.printStackTrace();
		System.out.println("uploading error");
		model.addAttribute("msg", "uploaded unsuccessfully");
	}
	return "filesuccess";
}
}

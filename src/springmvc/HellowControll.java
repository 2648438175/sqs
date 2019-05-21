package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HellowControll {
	@RequestMapping("hellow")
	public ModelAndView hellow() {
		ModelAndView mv=new ModelAndView();
		System.out.println("pig");
		System.out.println("mike");
		mv.addObject("msg","hellow springmvc ");
		mv.setViewName("/WEB-INF/jsp/hellow.jsp");
		return mv;
	}
}

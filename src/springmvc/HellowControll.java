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
		mv.addObject("msg","hellow springmvc ");
		mv.setViewName("/WEB-INF/jsp/hellow.jsp");
		return mv;
	}
}

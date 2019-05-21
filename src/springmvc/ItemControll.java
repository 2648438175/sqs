package springmvc;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pojo.Item;

@Controller
public class ItemControll {
	@RequestMapping("list")
	public ModelAndView getList() {
		ModelAndView mv=new ModelAndView();
		List<Item> items=Arrays.asList(new Item(1,"冰箱",999999,new Date(),"能吃的冰箱"),new Item(1,"洗衣机",666666,new Date(),"能跑的洗衣机"));
		mv.addObject("itemlist",items);
		mv.setViewName("item");
		return mv;
	}
}

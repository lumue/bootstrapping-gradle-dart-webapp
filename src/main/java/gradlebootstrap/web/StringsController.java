package gradlebootstrap.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/strings")
public class StringsController {

	@RequestMapping(value = "/revert/{in}", method = RequestMethod.GET)
	public @ResponseBody
	String revert(@PathVariable String in) {
		StringBuilder retBuilder=new StringBuilder();
		int lastCharAt = in.length()-1;
		for(int i=lastCharAt;i>=0;i--)
		{
			retBuilder.append(in.charAt(i));
		}
		return retBuilder.toString();
	}

}
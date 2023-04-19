package localhost.bootcamp_NTTData.SpringBoot.Messages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageRestController {
	
	@Autowired
	/*
	 *  La notación Autowired se encarga de estanciar
	 *   los objetos de la capa de persistencia(Repository)
	 */
	private MessageServiceImpl message;
	
	@GetMapping("/messages")
	@ResponseBody
	public String hola(){
		return message.getMessage();
	}

}

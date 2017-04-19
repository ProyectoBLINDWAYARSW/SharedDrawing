/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;



import edu.eci.arsw.msgbroker.model.Participante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author 2092063
 */

@Controller
public class STOMPMessagesHandler {
    
    @Autowired
    SimpMessagingTemplate msgt;
    
   @MessageMapping("/participante")    
	public void getParticipante(Participante pt) throws Exception {
		System.out.println("Nuevo participante recibido en el servidor!:"+pt);
		msgt.convertAndSend("/topic/participante",pt.getNombre());
	}
        
        @MessageMapping("/ShareDrawing")    
	public void getDibujo(Participante pt) throws Exception {
		System.out.println("Nuevo participante recibido en el servidor!:"+pt);
		msgt.convertAndSend("/topic/ShareDrawing",pt.getNombre());
	}
}

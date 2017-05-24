/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;



import edu.eci.arsw.msgbroker.model.Participante;
import edu.eci.arsw.service.DrawingSub;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author stefany
 */

@Controller
public class STOMPMessagesHandler {
    
    @Autowired
    SimpMessagingTemplate msgt;
    
    DrawingSub dra;
    
    
        @MessageMapping("/participante")    
	public void getParticipante(Participante pt) throws Exception {
		System.out.println("Nuevo participante recibido en el servidor!:"+pt);
		msgt.convertAndSend("/topic/participante",pt.getNombre());
	}
        
        @MessageMapping("/ShareDrawing")    
	public void getDibujo(String color) throws Exception {
		System.out.println("Nuevo participante recibido en el servidor!:"+color);
		//msgt.convertAndSend("/topic/ShareDrawing",dra.getDrawing());
	}
}

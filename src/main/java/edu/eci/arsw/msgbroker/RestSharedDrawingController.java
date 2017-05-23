/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;



import edu.eci.arsw.service.DrawingSub;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping(value = "/drawing")
public class RestSharedDrawingController {
        
        //@Autowired
        DrawingSub b=new DrawingSub();
        
        @Autowired
        SimpMessagingTemplate msgt;
    
        @RequestMapping(path = "/ShareDrawing", method = RequestMethod.GET)
        public ResponseEntity<?> getShareDrawing(){
            try {
               //msgt.convertAndSend("/topic/ShareDrawing",b.getDrawing());
               return new ResponseEntity<>(b.getDrawing(),HttpStatus.ACCEPTED);
            }catch (Exception ex) {
            Logger.getLogger(RestSharedDrawingController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No hay dibujo",HttpStatus.NOT_FOUND);
            }
        }
    
}

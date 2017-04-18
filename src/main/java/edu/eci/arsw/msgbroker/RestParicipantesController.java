/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker;

import edu.eci.arsw.interfaces.ParticipantesService;
import edu.eci.arsw.msgbroker.model.Participante;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
@RequestMapping(value = "/shareddrawing")
public class RestParicipantesController {
    
        @Autowired
        ParticipantesService participantes;
      
      
        @RequestMapping(path = "/participantes",method = RequestMethod.GET)
        public ResponseEntity<?> getParticipantes() {
            try {
                
               return new ResponseEntity<>(participantes.getParticipantes(),HttpStatus.ACCEPTED);
            }  catch (Exception ex) {
            Logger.getLogger(RestParicipantesController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No hay participantes",HttpStatus.NOT_FOUND);
            }
    
        }
    
        @RequestMapping(path = "/participantes",method = RequestMethod.PUT)
        public ResponseEntity<?> addParticipantNum(@RequestBody Participante p) {
        try {  
            participantes.registrarParticipantes(p);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception ex) {
            Logger.getLogger(RestParicipantesController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>("No esposible registrar el participante.",HttpStatus.NOT_FOUND);
            }

        }
        
    
}

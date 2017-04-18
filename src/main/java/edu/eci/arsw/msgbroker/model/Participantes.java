/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.msgbroker.model;

import edu.eci.arsw.interfaces.ParticipantesService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class Participantes implements ParticipantesService{
    
    List<Participante> participantes= new ArrayList<Participante>();
    
    public Participantes(){
        
    }
    @Override
    public void registrarParticipantes(Participante p){
      participantes.add(p);
    }
    
    @Override
    public List<Participante> getParticipantes(){
    return participantes;
    }
    
}

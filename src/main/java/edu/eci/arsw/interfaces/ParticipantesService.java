/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.interfaces;

import edu.eci.arsw.msgbroker.model.Participante;
import java.util.List;

/**
 *
 * @author User
 */
public interface ParticipantesService {
    
    public void registrarParticipantes(Participante p);
    public List<Participante> getParticipantes();
}

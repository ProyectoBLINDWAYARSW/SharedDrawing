/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.interfaces;

import edu.eci.arsw.service.DrawingServiceException;
import edu.eci.arsw.msgbroker.model.Drawing2;
import java.util.Map;

/**
 *
 * @author User
 */
public interface DService {
    public Map<String,Drawing2> getDrawing()throws DrawingServiceException;
}

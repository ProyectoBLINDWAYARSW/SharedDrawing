/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.service;

import edu.eci.arsw.Services.*;
import edu.eci.arsw.msgbroker.model.Drawing;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author User
 */
@Service
public class DrawingSub implements Dservice{
    
    
    public DrawingSub(){   
    }
    
    @Override
    public Map<String,Drawing> getDrawing() throws DrawingServiceException {
        return driwing;
    }
    
    private static final Map<String, Drawing>  driwing = new ConcurrentHashMap<>();
    
    static{
     driwing.put("circuloVerde", new Drawing("rgb(087, 166, 057)",55,50,10));
    }
   
     
 }

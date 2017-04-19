/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(
        
        function () {
            //console.info('loading script!...');
            listaParticipantes();
        }          
);
participantes=[];
function listaParticipantes(){
    $.get('/shareddrawing/participantes', 
    function(data){
    participantes = data;
    function listar(i){
         $('#partSala').prepend('<div>'+"1" +'</div>');
         $('#participante').prepend('<div>'+ i.nombre+'</div>');
    }
    participantes.forEach(listar);
    });
 }



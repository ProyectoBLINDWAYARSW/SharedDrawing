/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
$(document).ready(
        
        function () {
            console.info('loading script!...');
            listaParticipantes();
        }          
);
participantes=[];
function connect() {
        var socket = new SockJS('/stompendpoint');
        stompClient = Stomp.over(socket);
        stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/participantes', function (data) {
            var theObject=JSON.parse(data.body);
            var canvas = document.getElementById("myCanvas2");
            dibujarPoint(canvas,theObject.x, theObject.y);
                //alert("el evento fue recibido");
        });
        
         
    });
}

function listaParticipantes(){
    $.get('/shareddrawing/participantes', 
    function(data){
    participantes = data;
    function listar(i){
         $('#participante').prepend('<div>'+ i.nombre+'</div>');
    }
    participantes.forEach(listar);
    });
 }



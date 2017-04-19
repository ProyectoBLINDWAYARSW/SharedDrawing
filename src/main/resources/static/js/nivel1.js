/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
tiempoLimite = 90000;
$(document).ready(
        
        function () {
            console.info('loading script!...');
            connect();
            nivel1();
            cargarParticipantesSala();
            tressegundos();
            setInterval('carga()', 6000);
        }
           
);
function connect() {
    var socket = new SockJS('/stompendpoint');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        
        stompClient.subscribe("/topic/participante", function (data) {
            var theObject=JSON.parse(data.body);
            $("#participantesSala").append("<div>"+theObject.nombre+"</div>");  
        });
        //stompClient.subscribe('/topic/newpoint', function (data) {
            //var theObject=JSON.parse(data.body);
            //var canvas = document.getElementById("myCanvas2");
            //dibujarPoint(canvas,theObject.x, theObject.y);
                //alert("el evento fue recibido");
        //});
        
         
    });
}
function circuloVerde(){
    var c = document.getElementById("myCanvas2");
    var ctx = c.getContext("2d");
    $.get("/drawing/ShareDrawing",function(data){
        Circuloverde=data;
        ctx.beginPath();
        ctx.fillStyle = Circuloverde.circuloVerde.color;
        ctx.arc(Circuloverde.circuloVerde.x,Circuloverde.circuloVerde.y,Circuloverde.circuloVerde.z,0,2*Math.PI,true);
        ctx.fill();
     } 
     );  
}
function circuloMorado(){
    var c = document.getElementById("myCanvas2");
    var ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.fillStyle = "rgb(160, 052, 114)";
    ctx.arc(80,90,10,0,2*Math.PI,true);
    ctx.fill();
}
function circuloAmarillo(){
    var c = document.getElementById("myCanvas2");
    var ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.fillStyle = "rgb(248, 243, 053)";
    ctx.arc(20,20,10,0,2*Math.PI,true);
    ctx.fill();
}
function circuloRojo(){
    var c = document.getElementById("myCanvas2");
    var ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.fillStyle = "rgb(248, 000, 00)";
    ctx.arc(200,90,10,0,2*Math.PI,true);
    ctx.fill();
}
function circuloAzul(){
    var c = document.getElementById("myCanvas2");
    var ctx = c.getContext("2d");
    ctx.beginPath();
    ctx.fillStyle = "rgb(093, 155, 155)";
    ctx.arc(100,70,10,0,2*Math.PI,true);
    ctx.fill();
}

function trianguloAzul(){
    var c = document.getElementById("myCanvas2");
    var cxt = c.getContext("2d");
    cxt.beginPath();
    cxt.fillStyle="blue";
    cxt.strokeStyle="blue";
    cxt.moveTo(15,5);
    cxt.lineTo(30,30);
    cxt.lineTo(10,30);
    cxt.closePath();
    cxt.stroke();
    cxt.fill();

}

function nivel1(){
    circuloVerde();
    circuloMorado();
    circuloAmarillo();
    circuloRojo();
    circuloAzul(); 
    trianguloAzul();
}

function tressegundos() {
    setTimeout(
            function(){ 
            var c = document.getElementById("myCanvas2");
                c.width = c.width;    
            }, 3000);
}

function cargarParticipantesSala(){
    $.get('/shareddrawing/participantes', 
    function(data){
    participantes = data;
    function listar(i){
         $("#participantesSala").append("<div>"+ i.nombre+"</div>");
    }
    participantes.forEach(listar);
    });
}

function disconnect() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
    
}
function carga(){
var barra = document.getElementById('barra');
barra.value +=5;
}
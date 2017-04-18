participante=[];
var stompClient = null;
sala = 0;

function connect() {
    var socket = new SockJS('/stompendpoint');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        console.log('Connected: ' + frame);
        
        stompClient.subscribe('/topic/Jugar', function (data) {
            
           
        });
    });
}

function registrarParticipantes(){
 participante = {nombre:$("#nick").val()};
 console.info("entro a la lista");
        $.ajax({
        url: "/shareddrawing/participantes",
        type: 'PUT',
        data: JSON.stringify(participante),
        contentType: "application/json"
        }).then(function(){  
                 console.info('lregistrado!!');
            }, function(err){
                alert("err:"+err.responseText);
            });
}

function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}


$(document).ready(
        
        function () {
            console.info('loading script!...');
        }
);
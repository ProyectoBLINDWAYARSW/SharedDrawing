nombresParticipantes=[];
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
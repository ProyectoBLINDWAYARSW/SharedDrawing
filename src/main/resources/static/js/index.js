participante=[];
var stompClient = null;
sala = 0;

function registrarParticipantes(){
 participante = {nombre:$("#nick").val()};
        $.ajax({
        url: "/shareddrawing/participante",
        type: 'PUT',
        data: JSON.stringify(participante),
        contentType: "application/json"
        }).then(function(){  
            }, function(err){
                alert("err:"+err.responseText);
            });
}

$(document).ready(
        
        function () {
            console.info('loading script!...');
        }
);
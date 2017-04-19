participante=[];
var stompClient = null;
sala = 0;

function registrarParticipantes(){
 participante = {nombre:$("#nick").val()};
 console.info("entro a la lista");
        $.ajax({
        url: "/shareddrawing/participante",
        type: 'PUT',
        data: JSON.stringify(participante),
        contentType: "application/json"
        }).then(function(){  
                 console.info('lregistrado!!');
            }, function(err){
                alert("err:"+err.responseText);
            });
}

$(document).ready(
        
        function () {
            console.info('loading script!...');
        }
);
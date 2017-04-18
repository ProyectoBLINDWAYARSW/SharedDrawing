/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function Participante(nombre){
    this.nombre=nombre;
    this.participantes=[];
}
Participante.prototype.agregarParticipante=function(p){
    this.participantes.push(p);
};

Participante.prototype.agregarParticipante=function(p){
    this.participantes.push(p);
};

Participante.prototype.getNombre = function (){
    return this.nombre;
};
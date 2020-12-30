function fechaactual(){
var meses = new Array ("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre");
var diasSemana = new Array("Domingo","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado");
var f=new Date();
document.write(diasSemana[f.getDay()] + ", " + f.getDate() + " de " + meses[f.getMonth()] + " de " + f.getFullYear());
}

function año(){
for(x=2009; x<2050; x++){
document.write("<option>" + parseInt(x+1) + "</option>");
}
}

function selectaño() {
    var min = 2010,
      max = 2050,
      select = document.getElementById('año');
  
    for (var i = min; i <= max; i++) {
      var opt = document.createElement('option');
      opt.value = i;
      opt.innerHTML = i;
      select.appendChild(opt);
    }
  
  /*select.value = new Date().getFullYear();*/
}


function validarpago(){

    var pago = document.getElementById("monto").value;
    var rutcli = document.getElementById("rut").value;
    var mess = document.getElementById("mes").value;
    var ani = document.getElementById("año").value;
    var cont = 0;

    if(isNaN(pago)){
        document.getElementById("monto").style.background="#FF0000";
        document.getElementById("monto").style.borderColor="#000000";
    } else if(pago==null || pago.length==0 || pago.length >=9){
                    
        document.getElementById("monto").style.background="#FF0000";
        document.getElementById("monto").style.borderColor="#000000";
        }else {
        document.getElementById("monto").style.background="#32CD32";
        document.getElementById("monto").style.borderColor="#9A9797";
        cont++;
    }


    if (rutcli==null || rutcli.length==0 || rutcli.length >10){
        document.getElementById("rut").style.background="#FF0000";
        document.getElementById("rut").style.borderColor="#000000";
        }else {
        document.getElementById("rut").style.background="#32CD32";
        document.getElementById("rut").style.borderColor="#9A9797";
        cont++;
    }

    if(mess == "elige"){
        document.getElementById("mes").style.background="#FF0000";
        document.getElementById("mes").style.borderColor="#000000";
        }else {
        document.getElementById("mes").style.background="#32CD32";
        document.getElementById("mes").style.borderColor="#9A9797";
        cont++;
    }

    if(ani == "elige año"){
        document.getElementById("año").style.background="#FF0000";
        document.getElementById("año").style.borderColor="#000000";
        }else {
        document.getElementById("año").style.background="#32CD32";
        document.getElementById("año").style.borderColor="#9A9797";
        cont++;
    }

    if(cont==4){
        alert("Sus Datos Son validos");
    }

    
    

     
}
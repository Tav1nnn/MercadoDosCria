/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
async function logar(event) {
    event.preventDefault();
    
    let data = new FormData(event.target);
      
    let resultado = await fetch('LoginAjax', {
        method: 'post',
        body: data
    });
    
    let resultadoData = await resultado.json();
    
    
    if(resultadoData.status){
       alert(resultadoData.Message);

    }
    else {
        window.location.href = "Compra";
    }
        
}




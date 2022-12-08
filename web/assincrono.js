async function logar(event) {
    event.preventDefault();
    
    let data = new FormData(event.target);
      
    let resultado = await fetch('LoginAjax', {
        method: 'post',
        body: data
    });
    

    
    let resultadoData = await resultado.json();

    console.log(resultadoData);
    
    if(resultadoData.status){
       alert(resultadoData.Message);

    }
    else {
        if(resultadoData.adm){
            window.location.href = "MenuAdm";
        }else{
            window.location.href = "Compra";
        }
        
    }
        
}

    
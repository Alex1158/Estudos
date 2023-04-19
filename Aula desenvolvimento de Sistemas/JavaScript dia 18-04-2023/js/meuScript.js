function displayRadioValue(){
    let elemento = document.getElementsByName('gender');
    for(let i=0; i <elemento.length; i++){
        if(elemento[i].checked){
            document.getElementById('result'). innerHTML = "Genero selecionado é: "+ elemento[i].value;
        }
    }
}

function getCheckBox(){
    let checkBox = document.querySelectorAll('input[type="checkbox"]:checked');
    let text =" ";
    for(let i=0; i < checkBox.length; i++){
        text = text + " , "+checkBox[i].value;
    }
    document.getElementById('pri').innerHTML = text;
}
function getOption(){
    let selectElement = document.querySelector("#select1");
    let output = selectElement.value;
    document.querySelector(".output").textContent = output;
}
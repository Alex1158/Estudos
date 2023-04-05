let click =0; //Escopo global 


function tabuada(){
    let numero = document.getElementById('numero').value;
    let divisoria = document.getElementById('resultado');

    for(let i=1; i<=10; i++){
        let result = i * numero;
        const node = document.createElement("p");
        const text = document.createTextNode(`${numero} x ${i} = ${result}`);
        node.appendChild(text);
        divisoria.appendChild(node);

    }
}


function palavra(){
    let num  = document.getElementById('qtd').value;
    let divisoria = document.getElementById('imprima');

    for(let i=0; i <num; i++){
        let node = document.createElement('h4');
        let text = document.createTextNode ('TEXTO H4');
        node.appendChild(text);
        divisoria.appendChild(node);
    }
}


function contaClique(){
    click++;
    document.getElementById('clique').innerHTML = click;
}

function sorteio(){
    let sorteado = parseInt(Math.random()*100);
    document.getElementById('numSort').innerHTML = `o valor sorteado é ${sorteado}`;
}
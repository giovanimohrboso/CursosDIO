//let dado:string = "Teste";
//console.log(dado);

//decorators
function ExibirNome(target:any){
    console.log(target);
}

@ExibirNome
class Funcionario{}

@ExibirNome
class Teste{}

function apiversion(version:string){
    return (target:any) => {Object.assign(target.prototype,{__version: version});}
}

function tamanhoMinimo(tamanho:number) {
    return (target:any,key:string)=>{
        let _value = target[key];

        const getter = ()=> _value;
        const setter = (valor:string)=> {
            if (valor.length < tamanho){
                throw new Error (`Tamanho menor que ${tamanho}`)  
            }else{
                console.log("Tamanho OK")
                _value = valor;
            }
        };

        Object.defineProperty(target,key,{
            get:getter,
            set:setter,
        });

    }
}

@apiversion("1.10")
class Api{

    @tamanhoMinimo(5)
    nome:string;
    constructor(nome:string){
        this.nome = nome;
    }
}

const api = new Api("teste");
console.log(api.__version);



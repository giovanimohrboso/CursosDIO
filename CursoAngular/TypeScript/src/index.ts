type heroi={
    name: string;
    vulgo:string;

};

function printaObjeto(pessoa:heroi){
    console.log(pessoa);
}

console.log("Ola Mundo");

const pessoa:heroi = {name:"Giovani",vulgo:"teste"};

printaObjeto(pessoa);

//primitivos
let nome:string = "Giovani";
let idade:number = 40;
let altura:number = 1.82;

//especiais

let nulo:null = null;
let indeterminado:undefined = undefined;


let qualqueCoisa:any = 123;
let semRetorno:void;

//objeto
let produto:object = {name:"Giovani",cidade:"Tiete"}

type Produto = {
    nome:string,
    preco:number
}

let meuProduto:Produto;

meuProduto={nome:"Tenis",preco:5}
console.log(meuProduto);


//array
let dados:string[] = ["GIovani","Sandra"];
let dados1:Array<string> = ["teste","Giovani"];

//metodos arrays
console.log(dados)
console.log(dados.length);

let infos:(string|number)[] = ["Giovani",41];
console.log(infos);
console.log(infos[1]);

//tuplas
let boleto:[string,number,number]=["conta Agua",190,3];
console.log(boleto)

let aniversario:Date = new Date("1982-02-26 01:00");
console.log(aniversario.toString());

//funcoes

function adiciona(x:number,y:number):number{
    return x + y;
}

let soma:number = adiciona(1,2);
console.log(`A soma é ${soma}`);

function hello(nome:string){
    return `Olá ${nome}`;
}

console.log(hello("Giovani"));

function telefonar(numero:string | number){
    return numero;
}

console.log(telefonar("1198345587"));
console.log(telefonar(1234252412));

//funcoes assincronas
async function getDatabase(id:number):Promise<string>{
    return "Giovani";
}

console.log(getDatabase(1));

//interface

interface robo{
    id:number
    nome:string
}

let bot:robo;
bot = {id:1,nome:"MegaMan"};
console.log(bot);

interface Pessoa{
    nome:string;
    documento:string;

    getDados():string;
    
}
//classes
class PessoaFisica implements Pessoa{
    nome: string;
    documento: string;

    constructor(nome:string,documento:string){
        this.nome = nome;
        this.documento = documento;
    }

    getDados(): string {
        return (`Nome ${this.nome} Documento ${this.documento}`);
    }
}

let p = new PessoaFisica("Giovani","123");
console.log(p.getDados());

//modifiers access
class Personagem{

    private nome:string;
    protected forca:number;

    constructor(nome:string,forca:number){
        this.nome = nome;
        this.forca = forca;
    }

    getNome():string{
        return this.nome;
    }

    atacar():void{
        console.log(`${this.nome} atacando com força ${this.forca}`);
    }

}

const p1 = new Personagem("Homem de Ferro",10);
p1.atacar();

class Mago extends Personagem{
    private forcaMagia:number;

    constructor(nome:string,forca:number,forcaMagia:number){
        super(nome,forca);
        this.forcaMagia = forcaMagia;
    }

    lancarMagia():void{
        console.log(`${this.getNome()} Magia ${this.forca * this.forcaMagia} `)
    }
}

const p2 = new Mago("Merlin",10,50);
p2.lancarMagia();

//Generics
function concatArray<T>(...itens:T[]):T[]{
    return new Array().concat(...itens);
}

const numArray = concatArray<number[]>([1,5],[3]);
const stgArray = concatArray<string[]>(["Giovani","Sandra"],["Teste"]);

console.log(numArray);
console.log(stgArray);

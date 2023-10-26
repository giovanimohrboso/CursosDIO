"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
function printaObjeto(pessoa) {
    console.log(pessoa);
}
console.log("Ola Mundo");
const pessoa = { name: "Giovani", vulgo: "teste" };
printaObjeto(pessoa);
//primitivos
let nome = "Giovani";
let idade = 40;
let altura = 1.82;
//especiais
let nulo = null;
let indeterminado = undefined;
let qualqueCoisa = 123;
let semRetorno;
//objeto
let produto = { name: "Giovani", cidade: "Tiete" };
let meuProduto;
meuProduto = { nome: "Tenis", preco: 5 };
console.log(meuProduto);
//array
let dados = ["GIovani", "Sandra"];
let dados1 = ["teste", "Giovani"];
//metodos arrays
console.log(dados);
console.log(dados.length);
let infos = ["Giovani", 41];
console.log(infos);
console.log(infos[1]);
//tuplas
let boleto = ["conta Agua", 190, 3];
console.log(boleto);
let aniversario = new Date("1982-02-26 01:00");
console.log(aniversario.toString());
//funcoes
function adiciona(x, y) {
    return x + y;
}
let soma = adiciona(1, 2);
console.log(`A soma é ${soma}`);
function hello(nome) {
    return `Olá ${nome}`;
}
console.log(hello("Giovani"));
function telefonar(numero) {
    return numero;
}
console.log(telefonar("1198345587"));
console.log(telefonar(1234252412));
//funcoes assincronas
function getDatabase(id) {
    return __awaiter(this, void 0, void 0, function* () {
        return "Giovani";
    });
}
console.log(getDatabase(1));
let bot;
bot = { id: 1, nome: "MegaMan" };
console.log(bot);
//classes
class PessoaFisica {
    constructor(nome, documento) {
        this.nome = nome;
        this.documento = documento;
    }
    getDados() {
        return (`Nome ${this.nome} Documento ${this.documento}`);
    }
}
let p = new PessoaFisica("Giovani", "123");
console.log(p.getDados());
//modifiers access
class Personagem {
    constructor(nome, forca) {
        this.nome = nome;
        this.forca = forca;
    }
    getNome() {
        return this.nome;
    }
    atacar() {
        console.log(`${this.nome} atacando com força ${this.forca}`);
    }
}
const p1 = new Personagem("Homem de Ferro", 10);
p1.atacar();
class Mago extends Personagem {
    constructor(nome, forca, forcaMagia) {
        super(nome, forca);
        this.forcaMagia = forcaMagia;
    }
    lancarMagia() {
        console.log(`${this.getNome()} Magia ${this.forca * this.forcaMagia} `);
    }
}
const p2 = new Mago("Merlin", 10, 50);
p2.lancarMagia();
//Generics
function concatArray(...itens) {
    return new Array().concat(...itens);
}
const numArray = concatArray([1, 5], [3]);
const stgArray = concatArray(["Giovani", "Sandra"], ["Teste"]);
console.log(numArray);
console.log(stgArray);

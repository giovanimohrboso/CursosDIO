import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-atributos',
  templateUrl: './comp-atributos.component.html',
  styleUrls: ['./comp-atributos.component.css']
})
export class CompAtributosComponent implements OnInit {
  estilo:string="enable";
  corFundo:string="green";
  item:string ="";
  lista:string[]=[];
  isEnableBloco=true;
  textoBotao:string="Esconde Bloco"

  constructor() { }

  ngOnInit(): void {
  }

  trocar(){
    if (this.estilo == "enable"){
      this.corFundo = "yellow"
      this.estilo = "disable"
    }else{
      this.corFundo = "green"
      this.estilo = "enable"
    }
  }

  adicionarLista(){
    this.lista.push(this.item)
    this.item = ""
  }

  mudaBloco(){
    if (this.isEnableBloco){
      this.isEnableBloco = false
      this.textoBotao = "Aparece Bloco"
    }else{
      this.isEnableBloco = true
      this.textoBotao = "Esconde Bloco"
    }
  }

}

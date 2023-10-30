import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  produtos:string[]=[]
  menu:string="super";

  constructor() {

    this.produtos = ["mouse","teclado","monitor"]
  }

  ngOnInit(): void {
  }

  adicionar(){
    this.produtos.push("Notebook")
  }
  remover(){
    this.produtos.pop()
  }

  mostrar(num:number){
    alert(num)
  }

}

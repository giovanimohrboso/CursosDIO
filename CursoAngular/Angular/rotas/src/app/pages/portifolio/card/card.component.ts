import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  constructor(private parametro: ActivatedRoute,private navegador: Router) {
    this.parametro.params.subscribe(
      res => console.log(res)
    )
    this.parametro.queryParams.subscribe(
      res => console.log(res)
    )
    this.parametro.firstChild?.params.subscribe(
      res => console.log(res)
    )
  }

  ngOnInit(): void {
    setInterval(
      ()=>{this.navegador.navigate(['/'])}
      ,5000)
  }

}

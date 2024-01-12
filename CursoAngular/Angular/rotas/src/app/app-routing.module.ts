import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TituloComponent } from './pages/index/titulo/titulo.component';
import { CardComponent } from './pages/portifolio/card/card.component';

const routes: Routes = [
  {path:'',component: TituloComponent,pathMatch:'full'},
  {path:'portifolio',component: CardComponent,pathMatch:'prefix',children:[
    {path:':id',component: CardComponent}
  ]},
  {path:'**',redirectTo:''}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }

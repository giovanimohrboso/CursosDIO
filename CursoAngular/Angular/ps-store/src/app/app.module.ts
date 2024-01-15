import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './pages/home/home.component';
import { CardComponent } from './componentes/card/card.component';
import { MenuBarComponent } from './componentes/menu-bar/menu-bar.component';
import { CardLabelComponent } from './componentes/card/card-label/card-label.component';
import { CardDetalhesComponent } from './componentes/card/card-detalhes/card-detalhes.component';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CardComponent,
    MenuBarComponent,
    CardLabelComponent,
    CardDetalhesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

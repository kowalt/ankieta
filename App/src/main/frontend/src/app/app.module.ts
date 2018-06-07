import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { TooltipModule } from 'ngx-bootstrap/tooltip';
import { ModalModule } from 'ngx-bootstrap/modal';

//import { AngularFontAwesomeModule } from 'angular-font-awesome';

import { AppComponent } from './app.component';
import { LoginPanelComponent } from './login-panel/login-panel.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './/app-routing.module';
import { MainComponent } from './main/main.component';
import { HelloComponent } from './hello/hello.component';
import { RegisterComponent } from './register/register.component';
import { BannerComponent } from './banner/banner.component';
    
@NgModule({
  declarations: [
    AppComponent,
    LoginPanelComponent,
    MainComponent,
    HelloComponent,
    RegisterComponent,
    BannerComponent
  ],
  imports: [
    BrowserModule,
    BsDropdownModule.forRoot(),
    TooltipModule.forRoot(),
    ModalModule.forRoot(),
    FormsModule,
    HttpClientModule,
    AppRoutingModule
  ],

  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

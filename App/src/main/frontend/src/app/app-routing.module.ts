import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {MainComponent} from './main/main.component';
import {HelloComponent} from './hello/hello.component';
import {LoginPanelComponent} from './login-panel/login-panel.component';
import {RegisterComponent} from './register/register.component';

const routes: Routes = [
  { path: '', component: HelloComponent },
  { path: 'login', component: LoginPanelComponent },
  { path: 'register', component: RegisterComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [ RouterModule ]
})



export class AppRoutingModule { }

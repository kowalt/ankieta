import { Injectable } from '@angular/core';
import { Observable, of } from 'rxjs';

import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class PollsApiServiceService {
  isLoggedUser:Boolean;
  private apiUrl:String="http://localhost:3700/";
  constructor(private http: HttpClient) { }

  loginUser(login:String, password:String)
  {

  }

  logoutUser()
  {

  }

  registerUser()
  {
    
  }
  
}

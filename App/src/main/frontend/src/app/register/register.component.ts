import { Component, OnInit } from '@angular/core';
import { PollsApiServiceService } from '../polls-api-service.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  login:String;
  password1:String;
  password2:String;
  email:String;
  
    constructor(private pollsApiServiceService: PollsApiServiceService) { }


  ngOnInit() {
  }

  registerMe()
  {
    
  }
}

import { Component, OnInit } from '@angular/core';
import {PollsApiServiceService} from '../polls-api-service.service';

@Component({
  selector: 'login-panel',
  templateUrl: './login-panel.component.html',
  styleUrls: ['./login-panel.component.css']
})
export class LoginPanelComponent implements OnInit {

  login:String;
  password:String;
  constructor(private pollsApiServiceService: PollsApiServiceService) { }

  ngOnInit() {
  }

  loginMe()
  {

  }

}

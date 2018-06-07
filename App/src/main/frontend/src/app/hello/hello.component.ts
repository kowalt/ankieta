import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { Router} from '@angular/router';

@Component({
  selector: 'app-hello',
  templateUrl: './hello.component.html',
  styleUrls: ['./hello.component.css']
})
export class HelloComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit() {
  }

  goToLoginPage()
  {
    this.router.navigate(['/login']);
  }

  goToSignUpPage()
  {
    this.router.navigate(['/register']);
  }
}

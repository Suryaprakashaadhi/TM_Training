import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private router: Router) {}

  onSubmit(form: any): void {
    console.log('Login Data:', form);

    // Sample validation (replace with actual validation)
    if (form.value.username === 'admin' && form.value.password === 'password') {
      localStorage.setItem('isLoggedIn', 'true'); // Save login state
      window.alert('Logged in successfully!');
      this.router.navigate(['/home']); // Redirect to home page
    } else {
      window.alert('Invalid username or password');
    }
  }
}

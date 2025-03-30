import { Component } from '@angular/core';

@Component({
  selector: 'app-enquiry',
  templateUrl: './enquiry.component.html',
  styleUrls: ['./enquiry.component.css'],
  standalone: false
})
export class EnquiryComponent {

  onSubmit(form: any): void {
    console.log('Form Data: ', form.value);
    
    // ✅ Show popup
    alert('Enquiry submitted successfully!');

    // ✅ Reset the form after submission
    form.resetForm(); 
  }
}

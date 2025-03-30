// src/app/home/home.component.ts
import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { HomePageContent } from '../app-event/home.model';
import { CartService } from '../cart.service';


@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
  standalone: false
})
export class HomePageComponent implements OnInit {
  homePageContent: HomePageContent[] = [];

  constructor(private productService: ProductService,
    private cartService: CartService
  ) { }

  ngOnInit(): void {
    this.productService.getHomePageContent().subscribe(data => {
      console.log('Fetched HomePageContent:', data); // Debugging line
      this.homePageContent = data.homePageContent; // Access the homePageContent array
    }, error => {
      console.error('Error loading JSON:', error); // Error handling
    });
  }
  addToCart(item: HomePageContent) {
    this.cartService.addToCart(item);
    alert(`${item.name} added to cart!`);
  }
  
  
}


import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../app-event/product.model';
import { CartService } from '../cart.service';
@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css'],
})
export class ProductsComponent implements OnInit {
  products: Product[] = [];
  allProducts: Product[] = [];
  selectedType: string = '';

  constructor(private productService: ProductService,
    private cartService: CartService) {}

  ngOnInit(): void {
    this.productService.getproducts().subscribe(data => {
      this.allProducts = data.products;
      this.products = this.allProducts; // Load all products initially
    }, (error: any) => {
      console.error('Error loading JSON:', error);
    });
  }

  filterProducts(): void {
    if (this.selectedType) {
      this.products = this.allProducts.filter(
        product => product.type.toLowerCase() === this.selectedType.toLowerCase()
      );
    } else {
      this.products = this.allProducts;
    }
  }
  addToCart(product: Product){
    this.cartService.addToCart(product); // Call the service to add the product
    alert(`${product.name} added to cart!`);
  }
}

import { Injectable } from '@angular/core';
import { CartItem } from './app-event/cart.model';
import { Product } from './app-event/product.model';
import { HomePageContent } from './app-event/home.model';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  private cartItems: CartItem[] = [];

  // ✅ Add to cart with all details
  addToCart(item: Product | HomePageContent) {
    const existingItem = this.cartItems.find(cartItem => cartItem.id === item.id);

    if (existingItem) {
      existingItem.quantity++;
    } else {
      const newItem = new CartItem(
        item.id,
        item.name,
        item.type,
        item.brand,
        item.price,
        item.offer,
        item.image,
      );
      this.cartItems.push(newItem);
    }
    console.log('Cart Items:', this.cartItems);
  }

  // ✅ Get all cart items
  getCartItems(): CartItem[] {
    return this.cartItems;
  }

  // ✅ Remove item from cart
  removeFromCart(productId: number) {
    this.cartItems = this.cartItems.filter(item => item.id !== productId);
  }

  // ✅ Clear the cart
  clearCart() {
    this.cartItems = [];
  }
}

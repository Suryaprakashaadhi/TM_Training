import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HomePageContent } from './app-event/home.model';
import { Product } from './app-event/product.model';

@Injectable({
  providedIn: 'root'
})
export class ProductService {
  private apiUrl = 'assets/product.json'; // Path to products.json file

  constructor(private http: HttpClient) { }

  getHomePageContent(): Observable<{ homePageContent: HomePageContent[] }> {
    return this.http.get<{ homePageContent: HomePageContent[] }>(this.apiUrl); // Fetches the entire JSON content
  }

  getproducts(): Observable<{ products: Product[] }> {
    return this.http.get<{ products: Product[] }>(this.apiUrl); // Fetches the entire JSON content
  }
}
import { Pipe, PipeTransform } from '@angular/core';
import { Product } from '../app-event/product.model';

@Pipe({
  name: 'productFilter'
})
export class ProductFilterPipe implements PipeTransform {

  transform(products: Product[], type: string): Product[] {
    if (!products || !type) {
      return products;
    }
    return products.filter(product =>
      product.type.toLowerCase() === type.toLowerCase()
    );
  }
}

export class CartItem {
    id: number;
    name: string;
    type: string;
    brand: string;
    price: number;
    offer: string;
    image: string;
    description?: string; // Optional field
    quantity: number;
  
    constructor(
      id: number,
      name: string,
      type: string,
      brand: string,
      price: number,
      offer: string,
      image: string,
      description?: string,
      quantity: number = 1
    ) {
      this.id = id;
      this.name = name;
      this.type = type;
      this.brand = brand;
      this.price = price;
      this.offer = offer;
      this.image = image;
      this.description = description;
      this.quantity = quantity;
    }
  }
  
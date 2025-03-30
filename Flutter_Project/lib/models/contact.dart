class Contact {
  final String id;
  final String name;
  final String phone;
  final String imageUrl;
  final String language; // ✅ Added language field

  Contact({
    required this.id,
    required this.name,
    required this.phone,
    required this.imageUrl,
    required this.language, // ✅ Required language field
  });
}

// ✅ Sample contacts data with language
List<Contact> contacts = [
  Contact(
    id: '1',
    name: 'BATMAN',
    phone: '+1234567890',
    imageUrl:
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcStAFDW9Ce6c8Opnly5TzfmM5xlTOwXlSvigw&s',
    language: 'en', // ✅ English
  ),
  Contact(
    id: '2',
    name: 'SUPERMAN',
    phone: '+0987654321',
    imageUrl:
        'https://www.shutterstock.com/shutterstock/photos/2392947697/display_1500/stock-vector-superman-art-design-vector-super-hero-fly-flying-template-power-office-team-work-red-eyes-laser-2392947697.jpg',
    language: 'es', // ✅ Spanish
  ),
  Contact(
    id: '3',
    name: 'SPIDERMAN',
    phone: '+1122334455',
    imageUrl:
        'https://artprojectsforkids.org/wp-content/uploads/2024/06/How-to-Draw-Spiderman-web.jpg',
    language: 'fr', // ✅ French
  ),
  Contact(
    id: '4',
    name: 'IRON MAN',
    phone: '+2233445566',
    imageUrl:
        'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ4Q74ZT-aBDtw27rQ4QdcjHd0AXP89U7vYFg&s',
    language: 'de', // ✅ German
  ),
  Contact(
    id: '5',
    name: 'CAPTAIN AMERICA',
    phone: '+3344556677',
    imageUrl:
        'https://www.shutterstock.com/image-vector/captain-america-stand-walk-art-600nw-2291276013.jpg',
    language: 'it', // ✅ Italian
  ),
];

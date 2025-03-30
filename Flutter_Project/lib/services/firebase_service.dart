import 'package:cloud_firestore/cloud_firestore.dart';
import '../models/contact.dart';

class FirebaseService {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  Future<List<Contact>> getContacts() async {
    try {
      final snapshot = await _firestore.collection('contacts').get();

      return snapshot.docs.map((doc) {
        return Contact(
          id: doc.id,
          name: doc['name'],
          phone: doc['phone'],
          imageUrl: doc['imageUrl'],
          language: doc['language']  // ✅ Make sure field names match Firestore
        );
      }).toList();
    } catch (e) {
      print('Error fetching contacts: $e');
      return [];
    }
  }
}



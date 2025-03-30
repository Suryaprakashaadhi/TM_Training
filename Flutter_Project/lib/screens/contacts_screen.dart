import 'package:flutter/material.dart';
import '../models/contact.dart';
import '../utils/localization.dart';

class ContactsScreen extends StatefulWidget {
  const ContactsScreen({super.key});

  @override
  _ContactsScreenState createState() => _ContactsScreenState();
}

class _ContactsScreenState extends State<ContactsScreen> {
  final List<Contact> _contacts = [...contacts];
  final _formKey = GlobalKey<FormState>();

  String _name = '';
  String _phone = '';
  String _imageUrl = '';
  String _language = 'en';

  // ✅ Function to Add New Contact
  void _addContact() {
    if (_formKey.currentState!.validate()) {
      _formKey.currentState!.save();

      final newContact = Contact(
        id: DateTime.now().toString(),
        name: _name,
        phone: _phone,
        imageUrl: _imageUrl,
        language: _language,
      );

      setState(() {
        _contacts.add(newContact);
      });

      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(content: Text('Contact added: $_name')),
      );

      // Reset form
      _formKey.currentState!.reset();
      setState(() {
        _language = 'en';
      });
    }
  }

  // ✅ Function to Show Localized Alert Message
  void _showLocalizedMessage(BuildContext context, String locale, String name) {
    Locale newLocale = Locale(locale);
    AppLocalizations? localized = AppLocalizations(newLocale);

    ScaffoldMessenger.of(context).showSnackBar(
      SnackBar(
        content: Text(localized.alertMessage.replaceAll('{name}', name)),
        duration: const Duration(seconds: 2),
      ),
    );
  }
  

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Contacts')),
      body: Column(
        children: [
          // ➡️ Form to Add New Contact
          Padding(
            padding: const EdgeInsets.all(16.0),
            child: Form(
              key: _formKey,
              child: Column(
                children: [
                  // Name Field
                  TextFormField(
                    decoration: const InputDecoration(labelText: 'Name'),
                    validator: (value) =>
                        value!.isEmpty ? 'Please enter a name' : null,
                    onSaved: (value) => _name = value!,
                  ),
                  // Phone Field
                  TextFormField(
                    decoration: const InputDecoration(labelText: 'Phone'),
                    validator: (value) =>
                        value!.isEmpty ? 'Please enter a phone number' : null,
                    onSaved: (value) => _phone = value!,
                  ),
                  // Image URL Field
                  TextFormField(
                    decoration: const InputDecoration(labelText: 'Image URL'),
                    validator: (value) =>
                        value!.isEmpty ? 'Please enter an image URL' : null,
                    onSaved: (value) => _imageUrl = value!,
                  ),
                  // Language Dropdown
                  DropdownButtonFormField<String>(
                    value: _language,
                    items: const [
                      DropdownMenuItem(value: 'en', child: Text('English')),
                      DropdownMenuItem(value: 'es', child: Text('Spanish')),
                      DropdownMenuItem(value: 'fr', child: Text('French')),
                      DropdownMenuItem(value: 'de', child: Text('German')),
                      DropdownMenuItem(value: 'it', child: Text('Italian')),
                    ],
                    onChanged: (value) => setState(() {
                      _language = value!;
                    }),
                    decoration: const InputDecoration(labelText: 'Language'),
                  ),
                  const SizedBox(height: 10),
                  // Add Contact Button
                  ElevatedButton(
                    onPressed: _addContact,
                    child: const Text('Add Contact'),
                  ),
                ],
              ),
            ),
          ),
          const Divider(),

          // ➡️ Display Contact List
          Expanded(
            child: ListView.builder(
              itemCount: _contacts.length,
              itemBuilder: (context, index) {
                final contact = _contacts[index];
                return ListTile(
                  leading: CircleAvatar(
                    backgroundImage: NetworkImage(contact.imageUrl),
                    onBackgroundImageError: (_, __) {
                      debugPrint('Failed to load image: ${contact.imageUrl}');
                    },
                    radius: 30,
                    backgroundColor: Colors.grey.shade300,
                  ),
                  title: Text(contact.name),
                  subtitle: Text(contact.phone),
                  onTap: () {
                    _showLocalizedMessage(context, contact.language, contact.name);
                  },
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}

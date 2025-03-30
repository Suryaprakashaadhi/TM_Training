import 'dart:convert';
import 'package:flutter/services.dart';
import 'package:flutter/material.dart';

class LocalizationService {
  final Locale locale;
  static Map<String, String>? _localizedStrings;

  LocalizationService(this.locale);

  static Future<LocalizationService> load(Locale locale) async {
    LocalizationService service = LocalizationService(locale);

    String jsonString = await rootBundle
        .loadString('assets/translations/${locale.languageCode}.json');
    Map<String, dynamic> jsonMap = json.decode(jsonString);

    _localizedStrings =
        jsonMap.map((key, value) => MapEntry(key, value.toString()));

    return service;
  }

  String translate(String key) {
    return _localizedStrings?[key] ?? key;
  }

  static LocalizationsDelegate<LocalizationService> delegate =
      _LocalizationServiceDelegate();
}

class _LocalizationServiceDelegate
    extends LocalizationsDelegate<LocalizationService> {
  const _LocalizationServiceDelegate();

  @override
  bool isSupported(Locale locale) {
    return ['en', 'es', 'fr', 'de', 'it'].contains(locale.languageCode);
  }

  @override
  Future<LocalizationService> load(Locale locale) {
    return LocalizationService.load(locale);
  }

  @override
  bool shouldReload(_LocalizationServiceDelegate old) => false;
}

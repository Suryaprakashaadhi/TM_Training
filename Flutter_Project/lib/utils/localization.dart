import 'package:flutter/material.dart';
import 'dart:async';

class AppLocalizations {
  final Locale locale;

  AppLocalizations(this.locale);

  static AppLocalizations? of(BuildContext context) {
    return Localizations.of<AppLocalizations>(context, AppLocalizations);
  }

  static const LocalizationsDelegate<AppLocalizations> delegate =
      _AppLocalizationsDelegate();

  Map<String, Map<String, String>> _localizedValues = {
    'en': {
      'alert_message': 'Emergency alert sent to BATMAN!',
    },
    'es': {
      'alert_message': '¡Alerta de emergencia enviada a SUPERMAN!',
    },
    'fr': {
      'alert_message': 'Alerte d\'urgence envoyée à SPIDERMAN!',
    },
    'de': {
      'alert_message': 'Notfallbenachrichtigung an IRON MAN gesendet!',
    },
    'it': {
      'alert_message': 'Allerta di emergenza inviata a CAPTAIN AMERICA!',
    },
  };

  String get alertMessage {
    return _localizedValues[locale.languageCode]?['alert_message'] ??
        'Emergency alert sent!';
  }
}

class _AppLocalizationsDelegate
    extends LocalizationsDelegate<AppLocalizations> {
  const _AppLocalizationsDelegate();

  @override
  bool isSupported(Locale locale) {
    return ['en', 'es', 'fr', 'de', 'it'].contains(locale.languageCode);
  }

  @override
  Future<AppLocalizations> load(Locale locale) async {
    return AppLocalizations(locale);
  }

  @override
  bool shouldReload(covariant LocalizationsDelegate old) => false;
}

import 'dart:async';

import 'package:flutter/services.dart';

class AccessSettingsMenu {
  static const MethodChannel _channel =
      const MethodChannel('access_settings_menu');

  static Future<bool> openSettings({String settingsType}) async {
    bool result = false;

    try {
      result = await _channel.invokeMethod(settingsType);
    } catch (e) {
      result = false;
    }

    return result;
  }
}

import 'dart:async';

import 'package:flutter/services.dart';

class AccessSettingsMenu {
  static const MethodChannel _channel =
      const MethodChannel('access_settings_menu');

  static Future<bool> openSettings() async {
    bool result = false;

    //{@required String settingsType}
    String settingsType = 'ACTION_LOCATION_SOURCE_SETTINGS';
    try {
      result = await _channel.invokeMethod(settingsType);
    } catch (e) {
      result = false;
    }

    return result;
  }
}

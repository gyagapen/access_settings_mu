import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:access_settings_menu/access_settings_menu.dart';

void main() => runApp(new MyApp());

class MyApp extends StatefulWidget {
  @override
  _MyAppState createState() => new _MyAppState();
}

class _MyAppState extends State<MyApp> {
  var _settingsTypes = <String>[
    'ACTION_ACCESSIBILITY_SETTINGS',
    'ACTION_ADD_ACCOUNT',
    'ACTION_AIRPLANE_MODE_SETTINGS',
    'ACTION_APN_SETTINGS',
    'ACTION_APPLICATION_DETAILS_SETTINGS',
    'ACTION_APPLICATION_DEVELOPMENT_SETTINGS',
    'ACTION_APPLICATION_SETTINGS',
    'ACTION_APP_NOTIFICATION_SETTINGS',
    'ACTION_BATTERY_SAVER_SETTINGS',
    'ACTION_BLUETOOTH_SETTINGS',
    'ACTION_CAPTIONING_SETTINGS',
    'ACTION_CAST_SETTINGS',
    'ACTION_CHANNEL_NOTIFICATION_SETTINGS',
    'ACTION_DATA_ROAMING_SETTINGS',
    'ACTION_DATA_USAGE_SETTINGS',
    'ACTION_DATE_SETTINGS',
    'ACTION_DEVICE_INFO_SETTINGS',
    'ACTION_DISPLAY_SETTINGS',
    'ACTION_DREAM_SETTINGS',
    'ACTION_FINGERPRINT_ENROLL',
    'ACTION_HARD_KEYBOARD_SETTINGS',
    'ACTION_HOME_SETTINGS',
    'ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS',
    'ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS',
    'ACTION_INPUT_METHOD_SETTINGS',
    'ACTION_INPUT_METHOD_SUBTYPE_SETTINGS',
    'ACTION_INTERNAL_STORAGE_SETTINGS',
    'ACTION_LOCALE_SETTINGS',
    'ACTION_LOCATION_SOURCE_SETTINGS',
    'ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS',
    'ACTION_MANAGE_APPLICATIONS_SETTINGS',
    'ACTION_MANAGE_DEFAULT_APPS_SETTINGS',
    'ACTION_MANAGE_OVERLAY_PERMISSION',
    'ACTION_MANAGE_UNKNOWN_APP_SOURCES',
    'ACTION_MANAGE_WRITE_SETTINGS',
    'ACTION_MEMORY_CARD_SETTINGS',
    'ACTION_NETWORK_OPERATOR_SETTINGS',
    'ACTION_NFCSHARING_SETTINGS',
    'ACTION_NFC_PAYMENT_SETTINGS',
    'ACTION_NFC_SETTINGS',
    'ACTION_NIGHT_DISPLAY_SETTINGS',
    'ACTION_NOTIFICATION_LISTENER_SETTINGS',
    'ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS',
    'ACTION_PRINT_SETTINGS',
    'ACTION_PRIVACY_SETTINGS',
    'ACTION_QUICK_LAUNCH_SETTINGS',
    'ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS',
    'ACTION_REQUEST_SET_AUTOFILL_SERVICE',
    'ACTION_SEARCH_SETTINGS',
    'ACTION_SECURITY_SETTINGS',
    'ACTION_SETTINGS',
    'ACTION_SHOW_REGULATORY_INFO',
    'ACTION_SOUND_SETTINGS',
    'ACTION_STORAGE_VOLUME_ACCESS_SETTINGS',
    'ACTION_SYNC_SETTINGS',
    'ACTION_USAGE_ACCESS_SETTINGS',
    'ACTION_USER_DICTIONARY_SETTINGS',
    'ACTION_VOICE_CONTROL_AIRPLANE_MODE',
    'ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE',
    'ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE',
    'ACTION_VOICE_INPUT_SETTINGS',
    'ACTION_VPN_SETTINGS',
    'ACTION_VR_LISTENER_SETTINGS',
    'ACTION_WEBVIEW_SETTINGS',
    'ACTION_WIFI_IP_SETTINGS',
    'ACTION_WIFI_SETTINGS',
    'ACTION_WIRELESS_SETTINGS',
    'ACTION_ZEN_MODE_PRIORITY_SETTINGS',
  ];

  @override
  initState() {
    super.initState();
  }

  openSettingsMenu(settingsName) async {
    var resultSettingsOpening = false;

    try {
      resultSettingsOpening =
          await AccessSettingsMenu.openSettings(settingsType: settingsName);
          //await AccessSettingsMenu.openSettings();
    } catch (e) {
      resultSettingsOpening = false;
    }
  }

  @override
  Widget build(BuildContext context) {
    var dropdown = new ListView(
      children: [
        new Column(
          children: <Widget>[
            new Text('Choose your setting type'),
            new DropdownButton<String>(
              items: _settingsTypes.map((String value) {
                return new DropdownMenuItem<String>(
                  value: value,
                  child: new Text(value),
                );
              }).toList(),
              onChanged: (selectedValue) {
                openSettingsMenu(selectedValue);
              },
            ),
          ],
        ),
      ],
    );

    return new MaterialApp(
      home: new Scaffold(
        appBar: new AppBar(
          title: new Text('Access settings example app'),
        ),
        body: new Center(
          child: dropdown,
        ),
      ),
    );
  }
}

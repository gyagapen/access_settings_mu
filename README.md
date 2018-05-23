# access_settings_menu

A flutter plugin to open Android settings menus programatically.

This plugin in only for Android.

The IOS section has not been implemented.

## Usage

To use this plugin, add access_settings_menu as a dependency in your pubspec.yaml file.

List of Android settings menu can be found at [here](https://developer.android.com/reference/android/provider/Settings).
Please refer to contants variable starting by ACTION (e.g. ACTION_ACCESSIBILITY_SETTINGS refers to accessibility settings menu).

Followin action menus have not been implemented as they are deprecated:
- ACTION_DATA_USAGE_SETTINGS
- ACTION_FINGERPRINT_ENROL
- ACTION_STORAGE_VOLUME_ACCESS_SETTINGS

## Example

``` dart
// Import package
import 'package:access_settings_menu/access_settings_menu.dart';

// create an async void to call the API function with settings name as parameter
openSettingsMenu(settingsName) async {
    var resultSettingsOpening = false;

    try {
      resultSettingsOpening =
          await AccessSettingsMenu.openSettings(settingsType: settingsName);
    } catch (e) {
      resultSettingsOpening = false;
    }
}

//call the function to open the desired Android menu
openSettingsMenu("ACTION_ACCESSIBILITY_SETTINGS");

```

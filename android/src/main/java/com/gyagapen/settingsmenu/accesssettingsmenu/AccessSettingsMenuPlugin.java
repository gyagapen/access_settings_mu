package com.gyagapen.settingsmenu.accesssettingsmenu;

import android.app.Activity;
import android.content.Intent;
import android.provider.Settings;

import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * AccessSettingsMenuPlugin
 */
public class AccessSettingsMenuPlugin implements MethodCallHandler {
  private final Activity activity;

  /**
   * Plugin registration.
   */
  public static void registerWith(Registrar registrar) {
    final MethodChannel channel = new MethodChannel(registrar.messenger(), "access_settings_menu");
    channel.setMethodCallHandler(new AccessSettingsMenuPlugin(registrar.activity()));
  }

  private AccessSettingsMenuPlugin(Activity activity)
  {
    this.activity = activity;
  }

  @Override
  public void onMethodCall(MethodCall call, Result result) {
    String settingsURI = retrieveSettingsURI(call.method);
    if(settingsURI.equals(""))
    {
      result.notImplemented();
    }else
    {
      final Intent intent = new Intent(settingsURI);
      activity.startActivity(intent);
      result.success(true);
    }
  }


  private static String retrieveSettingsURI(String settingsName)
  {
    String settingsURI = "";

    switch (settingsName)
    {

      case "ACTION_ACCESSIBILITY_SETTINGS":settingsURI = Settings.ACTION_ACCESSIBILITY_SETTINGS;break;
      case "ACTION_ADD_ACCOUNT":settingsURI = Settings.ACTION_ADD_ACCOUNT;break;
      case "ACTION_AIRPLANE_MODE_SETTINGS":settingsURI = Settings.ACTION_AIRPLANE_MODE_SETTINGS;break;
      case "ACTION_APN_SETTINGS":settingsURI = Settings.ACTION_APN_SETTINGS;break;
      case "ACTION_APPLICATION_DETAILS_SETTINGS":settingsURI = Settings.ACTION_APPLICATION_DETAILS_SETTINGS;break;
      case "ACTION_APPLICATION_DEVELOPMENT_SETTINGS":settingsURI = Settings.ACTION_APPLICATION_DEVELOPMENT_SETTINGS;break;
      case "ACTION_APPLICATION_SETTINGS":settingsURI = Settings.ACTION_APPLICATION_SETTINGS;break;
      case "ACTION_APP_NOTIFICATION_SETTINGS":settingsURI = Settings.ACTION_APP_NOTIFICATION_SETTINGS;break;
      case "ACTION_BATTERY_SAVER_SETTINGS":settingsURI = Settings.ACTION_BATTERY_SAVER_SETTINGS;break;
      case "ACTION_BLUETOOTH_SETTINGS":settingsURI = Settings.ACTION_BLUETOOTH_SETTINGS;break;
      case "ACTION_CAPTIONING_SETTINGS":settingsURI = Settings.ACTION_CAPTIONING_SETTINGS;break;
      case "ACTION_CAST_SETTINGS":settingsURI = Settings.ACTION_CAST_SETTINGS;break;
      case "ACTION_CHANNEL_NOTIFICATION_SETTINGS":settingsURI = Settings.ACTION_CHANNEL_NOTIFICATION_SETTINGS;break;
      case "ACTION_DATA_ROAMING_SETTINGS":settingsURI = Settings.ACTION_DATA_ROAMING_SETTINGS;break;
      case "ACTION_DATE_SETTINGS":settingsURI = Settings.ACTION_DATE_SETTINGS;break;
      case "ACTION_DEVICE_INFO_SETTINGS":settingsURI = Settings.ACTION_DEVICE_INFO_SETTINGS;break;
      case "ACTION_DISPLAY_SETTINGS":settingsURI = Settings.ACTION_DISPLAY_SETTINGS;break;
      case "ACTION_DREAM_SETTINGS":settingsURI = Settings.ACTION_DREAM_SETTINGS;break;
      case "ACTION_HARD_KEYBOARD_SETTINGS":settingsURI = Settings.ACTION_HARD_KEYBOARD_SETTINGS;break;
      case "ACTION_HOME_SETTINGS":settingsURI = Settings.ACTION_HOME_SETTINGS;break;
      case "ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS":settingsURI = Settings.ACTION_IGNORE_BACKGROUND_DATA_RESTRICTIONS_SETTINGS;break;
      case "ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS":settingsURI = Settings.ACTION_IGNORE_BATTERY_OPTIMIZATION_SETTINGS;break;
      case "ACTION_INPUT_METHOD_SETTINGS":settingsURI = Settings.ACTION_INPUT_METHOD_SETTINGS;break;
      case "ACTION_INPUT_METHOD_SUBTYPE_SETTINGS":settingsURI = Settings.ACTION_INPUT_METHOD_SUBTYPE_SETTINGS;break;
      case "ACTION_INTERNAL_STORAGE_SETTINGS":settingsURI = Settings.ACTION_INTERNAL_STORAGE_SETTINGS;break;
      case "ACTION_LOCALE_SETTINGS":settingsURI = Settings.ACTION_LOCALE_SETTINGS;break;
      case "ACTION_LOCATION_SOURCE_SETTINGS":settingsURI = Settings.ACTION_LOCATION_SOURCE_SETTINGS;break;
      case "ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS":settingsURI = Settings.ACTION_MANAGE_ALL_APPLICATIONS_SETTINGS;break;
      case "ACTION_MANAGE_APPLICATIONS_SETTINGS":settingsURI = Settings.ACTION_MANAGE_APPLICATIONS_SETTINGS;break;
      case "ACTION_MANAGE_DEFAULT_APPS_SETTINGS":settingsURI = Settings.ACTION_MANAGE_DEFAULT_APPS_SETTINGS;break;
      case "ACTION_MANAGE_OVERLAY_PERMISSION":settingsURI = Settings.ACTION_MANAGE_OVERLAY_PERMISSION;break;
      case "ACTION_MANAGE_UNKNOWN_APP_SOURCES":settingsURI = Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES;break;
      case "ACTION_MANAGE_WRITE_SETTINGS":settingsURI = Settings.ACTION_MANAGE_WRITE_SETTINGS;break;
      case "ACTION_MEMORY_CARD_SETTINGS":settingsURI = Settings.ACTION_MEMORY_CARD_SETTINGS;break;
      case "ACTION_NETWORK_OPERATOR_SETTINGS":settingsURI = Settings.ACTION_NETWORK_OPERATOR_SETTINGS;break;
      case "ACTION_NFCSHARING_SETTINGS":settingsURI = Settings.ACTION_NFCSHARING_SETTINGS;break;
      case "ACTION_NFC_PAYMENT_SETTINGS":settingsURI = Settings.ACTION_NFC_PAYMENT_SETTINGS;break;
      case "ACTION_NFC_SETTINGS":settingsURI = Settings.ACTION_NFC_SETTINGS;break;
      case "ACTION_NIGHT_DISPLAY_SETTINGS":settingsURI = Settings.ACTION_NIGHT_DISPLAY_SETTINGS;break;
      case "ACTION_NOTIFICATION_LISTENER_SETTINGS":settingsURI = Settings.ACTION_NOTIFICATION_LISTENER_SETTINGS;break;
      case "ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS":settingsURI = Settings.ACTION_NOTIFICATION_POLICY_ACCESS_SETTINGS;break;
      case "ACTION_PRINT_SETTINGS":settingsURI = Settings.ACTION_PRINT_SETTINGS;break;
      case "ACTION_PRIVACY_SETTINGS":settingsURI = Settings.ACTION_PRIVACY_SETTINGS;break;
      case "ACTION_QUICK_LAUNCH_SETTINGS":settingsURI = Settings.ACTION_QUICK_LAUNCH_SETTINGS;break;
      case "ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS":settingsURI = Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS;break;
      case "ACTION_REQUEST_SET_AUTOFILL_SERVICE":settingsURI = Settings.ACTION_REQUEST_SET_AUTOFILL_SERVICE;break;
      case "ACTION_SEARCH_SETTINGS":settingsURI = Settings.ACTION_SEARCH_SETTINGS;break;
      case "ACTION_SECURITY_SETTINGS":settingsURI = Settings.ACTION_SECURITY_SETTINGS;break;
      case "ACTION_SETTINGS":settingsURI = Settings.ACTION_SETTINGS;break;
      case "ACTION_SHOW_REGULATORY_INFO":settingsURI = Settings.ACTION_SHOW_REGULATORY_INFO;break;
      case "ACTION_SOUND_SETTINGS":settingsURI = Settings.ACTION_SOUND_SETTINGS;break;
      case "ACTION_SYNC_SETTINGS":settingsURI = Settings.ACTION_SYNC_SETTINGS;break;
      case "ACTION_USAGE_ACCESS_SETTINGS":settingsURI = Settings.ACTION_USAGE_ACCESS_SETTINGS;break;
      case "ACTION_USER_DICTIONARY_SETTINGS":settingsURI = Settings.ACTION_USER_DICTIONARY_SETTINGS;break;
      case "ACTION_VOICE_CONTROL_AIRPLANE_MODE":settingsURI = Settings.ACTION_VOICE_CONTROL_AIRPLANE_MODE;break;
      case "ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE":settingsURI = Settings.ACTION_VOICE_CONTROL_BATTERY_SAVER_MODE;break;
      case "ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE":settingsURI = Settings.ACTION_VOICE_CONTROL_DO_NOT_DISTURB_MODE;break;
      case "ACTION_VOICE_INPUT_SETTINGS":settingsURI = Settings.ACTION_VOICE_INPUT_SETTINGS;break;
      case "ACTION_VPN_SETTINGS":settingsURI = Settings.ACTION_VPN_SETTINGS;break;
      case "ACTION_VR_LISTENER_SETTINGS":settingsURI = Settings.ACTION_VR_LISTENER_SETTINGS;break;
      case "ACTION_WEBVIEW_SETTINGS":settingsURI = Settings.ACTION_WEBVIEW_SETTINGS;break;
      case "ACTION_WIFI_IP_SETTINGS":settingsURI = Settings.ACTION_WIFI_IP_SETTINGS;break;
      case "ACTION_WIFI_SETTINGS":settingsURI = Settings.ACTION_WIFI_SETTINGS;break;
      case "ACTION_WIRELESS_SETTINGS":settingsURI = Settings.ACTION_WIRELESS_SETTINGS;break;
      case "ACTION_ZEN_MODE_PRIORITY_SETTINGS":settingsURI = Settings.ACTION_ZEN_MODE_PRIORITY_SETTINGS;break;


      default:
        settingsURI = "";

    }

    return settingsURI;
  }
}

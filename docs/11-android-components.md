# Android component inventory

This inventory comes from `resources/AndroidManifest.xml` for Spotify 9.1.84.2205.

## Counts

| Component | Count |
|---|---:|
| Activities | 90 |
| Activity aliases | 4 |
| Services | 39 |
| Broadcast receivers | 37 |
| Content providers | 10 |

These counts include bundled library/framework components as well as Spotify-owned components.

## Notable activities

- `com.spotify.adsinternal.adscommon.inappbrowser.InAppBrowserLauncherActivity`
- `com.spotify.music.SpotifyMainActivity`
- `com.spotify.music.StsShareTargetActivity`
- `com.spotify.music.SpotifyEntryPointForGoogleMeet`
- `com.spotify.music.main.AppIconEmeraldGreen`
- `com.spotify.music.MainActivity`
- `com.spotify.tome.pageactivity.PageActivity`
- `com.spotify.accountswitching.accountpickerimpl.AccountPickerActivity`
- `com.spotify.ageverification.dialog.view.AgeVerificationDialogActivity`
- `com.spotify.liveevents.ontourdisclosure.OnTourDisclosureActivity`
- `com.spotify.livesharing.controllerimpl.dialogs.LiveSharingRecordingDialogsHostActivity`
- `com.spotify.appauthorization.sso.AuthorizationActivity`
- `com.spotify.appauthorization.sso.externalproxyauth.AuthorizationCommandProxyActivity`
- `com.spotify.appauthorization.sso.internalauth.AuthorizationActivityInternalProxy`
- `com.spotify.appauthorization.sso.util.AfterLoginDummyActivity`
- `com.spotify.accountswitching.switcheruiimpl.AccountSwitcherActivity`
- `com.spotify.adsdisplay.products.cmp.CMPActivity`
- `com.spotify.adsdisplay.browser.inapp.InAppBrowserActivity`
- `com.spotify.adsdisplay.display.DisplayAdActivity`
- `com.spotify.ageverification.ageassurancewebview.AgeAssuranceWebViewActivity`
- `com.spotify.genalphaauthentication.parentalconsentwebview.ParentalConsentWebActivity`
- `com.spotify.mediasession.mediasession.login.AfterLoginDummyActivity`
- `com.spotify.allboarding.allboardingimpl.AllboardingActivity`
- `com.spotify.reporting.reportaction.ReportWebViewActivity`
- `com.spotify.profile.editprofile.pictureselection.PictureSelectionActivity`
- `com.spotify.profile.editprofile.editprofile.kidsprofileavatarpicker.KidsProfileAvatarPickerActivity`
- `com.spotify.connect.mediarouteactivity.jam.OutputSwitcherJamLauncherActivity`
- `com.spotify.connect.mediarouteactivity.permissions.OutputSwitcherPermissionNudgeActivity`
- `com.spotify.nativeadshomeformats.nativeadshomeformats.impl.help.HelpWebViewActivity`
- `com.spotify.jam.features.dialogs.impl.SocialListeningOnboardingActivity`
- `com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity`
- `com.spotify.jam.features.notificationcenter.impl.dialogs.IPLDialogsHostActivity`
- `com.spotify.messaging.messagingplatformimpl.slate.SlateMessageHostActivity`
- `com.spotify.storage.localstorage.DiskAlmostFullActivity`
- `com.spotify.apprater.appraterdialog.AppRaterActivity`
- `com.spotify.blend.tastematch.BlendTasteMatchActivity`
- `com.spotify.blend.tastematch.BlendStoryContainerActivity`
- `com.spotify.carmobile.waze.WazeReturnActivity`
- `com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity`
- `com.spotify.endless.sessionstarter.EndlessActivity`
- `com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity`
- `com.spotify.genalpha.accountselectionimpl.AccountSelectionActivity`
- `com.spotify.genalphagraduation.graduationmessagingimpl.ForcedGraduationLockActivity`
- `com.spotify.login.loginflowimpl.DelegatingLoginActivity`
- `com.spotify.login.loginflowimpl.LoginActivity`
- `com.spotify.login.loginflowimpl.QuickLoginActivity`
- `com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity`
- `com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity`
- `com.spotify.lyrics.fullscreenview.page.LyricsFullscreenPageActivity`
- `com.spotify.marquee.marquee.MarqueeActivity`
- `com.spotify.marquee.marquee.learnmore.LearnMoreWebActivity`
- `com.spotify.musicappplatform.offlineerrors.OfflineDeviceLimitReachedActivity`
- `com.spotify.notifications.permissionsimpl.reinstallprompt.NotificationPermissionRequestActivity`
- `com.spotify.nowplaying.musicinstallation.NowPlayingActivity`
- `com.spotify.partneraccountlinking.partneraccountlinking.PartnerAccountLinkingActivity`
- `com.spotify.premiumaccountmanagement.management.page.PremiumAccountManagementWebviewActivity`
- `com.spotify.profile.completionsheetimpl.activity.ProfileCompletionSheetHostActivity`
- `com.spotify.share.resultactivity.api.ShareResultActivity`
- `com.spotify.wear.pinpairing.PinPairingActivity`
- `com.spotify.widgets.npvwidget.WidgetsProxyActivity`

## Activity aliases

- `com.spotify.music.StsShareTargetActivity`
- `com.spotify.music.SpotifyEntryPointForGoogleMeet`
- `com.spotify.music.main.AppIconEmeraldGreen`
- `com.spotify.music.MainActivity`

The important launcher-facing alias is `com.spotify.music.MainActivity`, which targets `com.spotify.music.SpotifyMainActivity`.

## Services

- `androidx.room.MultiInstanceInvalidationService`
- `com.spotify.mediabrowserservice.mediabrowserservice.SpotifyMediaBrowserService`
- `com.spotify.mediabrowserservice.medialibraryservice.SpotifyMediaLibraryService`
- `com.google.android.gms.metadata.ModuleDependencies`
- `com.spotify.carapplibrary.androidauto.AndroidAutoService`
- `androidx.work.impl.background.systemalarm.SystemAlarmService`
- `androidx.work.impl.background.systemjob.SystemJobService`
- `androidx.work.impl.foreground.SystemForegroundService`
- `com.google.firebase.messaging.FirebaseMessagingService`
- `com.google.firebase.components.ComponentDiscoveryService`
- `com.google.android.datatransport.runtime.backends.TransportBackendDiscovery`
- `com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService`
- `com.google.android.gms.auth.api.signin.RevocationBoundService`
- `com.spotify.connect.mediarouteproviderapi.SpotifyMediaRouteProviderService`
- `com.google.android.gms.cast.framework.ReconnectionService`
- `com.spotify.radio.radio.formatlist.RadioFormatListService`
- `com.spotify.messaging.actionsimpl.email.EmailVerifyDispatcherService`
- `com.spotify.collection.contentimpl.played.PlayedStateService`
- `com.spotify.wear.wearabledatalayer.SpotifyWearableListenerService`
- `com.spotify.widget.widget.WidgetPickerService`
- `com.spotify.widget.widgetpromo.PromoSuccessHandlerService`
- `com.spotify.collection.downloaded.service.OffliningService`
- `com.spotify.music.alarmlauncher.SpotifyAlarmLauncherService`
- `com.spotify.premiumdestination.upsell.activity.dynamicupsell.DynamicUpsellLoggerService`
- `com.spotify.premiumdestination.upsell.activity.upsell.TrialActivationService`
- `androidx.glance.appwidget.GlanceRemoteViewsService`
- `androidx.core.widget.RemoteViewsCompatService`
- `com.spotify.widgets.npvwidget.PlaybackCommandHandlerService`
- `com.spotify.tap.go.service.GoBluetoothService`
- `com.spotify.musicappplatform.state.foregroundkeeperservice.impl.ForegroundKeeperService`
- `androidx.camera.core.impl.MetadataHolderService`
- `androidx.car.app.CarAppMetadataHolderService`
- `com.google.firebase.sessions.SessionLifecycleService`
- `com.spotify.recentlyplayed.recentlyplayed.legacy.RecentlyPlayedService`
- `com.spotify.interapp.service.service.AppProtocolRemoteService`
- `com.spotify.notifications.notifications.firebaseservice.SpotifyFirebaseMessagingService`
- `com.google.mlkit.common.internal.MlKitComponentDiscoveryService`
- `com.ravelin.core.repository.services.DeviceIdService`
- `com.spotify.tap.spoton.SpotOnService`

Notable Spotify-owned services include:

- `SpotifyMediaBrowserService` — legacy Android media browsing.
- `SpotifyMediaLibraryService` — Media3 media library integration.
- `AndroidAutoService` — Android Auto integration.
- `SpotifyMediaRouteProviderService` — routing / Connect-style media route integration.
- `SpotifyWearableListenerService` — wearable data layer.
- `OffliningService` — downloaded/offline collection work.
- `PlaybackCommandHandlerService` — widget playback commands.
- `AppProtocolRemoteService` — inter-app protocol control.
- `SpotifyFirebaseMessagingService` — Spotify push messaging.

## Broadcast receivers

- `androidx.profileinstaller.ProfileInstallReceiver`
- `com.spotify.musicappplatform.state.pendingintentreceiver.PendingIntentBroadcastReceiver`
- `androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver`
- `androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy`
- `androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy`
- `androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy`
- `androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy`
- `androidx.work.impl.background.systemalarm.RescheduleReceiver`
- `androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver`
- `androidx.work.impl.diagnostics.DiagnosticsReceiver`
- `com.google.firebase.iid.FirebaseInstanceIdReceiver`
- `com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver`
- `com.spotify.adsdisplay.browser.inapp.external.ShareSheetCallback`
- `com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver`
- `androidx.mediarouter.media.MediaTransferReceiver`
- `com.google.android.gms.cast.framework.media.MediaIntentReceiver`
- `com.facebook.CurrentAccessTokenExpirationBroadcastReceiver`
- `com.facebook.AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver`
- `com.spotify.widget.widget.widgetimpl.SpotifyWidget`
- `com.spotify.carmobile.wazesdk.navigation.WazeWakeUpReceiver`
- `com.spotify.login.adaptiveauthentication.challenge.whatsapp.WhatsappOtpReceiver`
- `com.spotify.music.alarmlauncher.SpotifyAlarmLauncherReceiver`
- `com.spotify.premiumdestination.upsell.activity.upsell.NotificationsIntentReceiver`
- `com.spotify.share.resultreceiver.api.ShareResultReceiver`
- `com.spotify.proactiveplatforms.npvwidget.CoverScreenWidgetProvider`
- `com.spotify.proactiveplatforms.npvwidget.NpvWidgetProvider`
- `androidx.glance.appwidget.action.ActionCallbackBroadcastReceiver`
- `androidx.glance.appwidget.UnmanagedSessionReceiver`
- `androidx.glance.appwidget.MyPackageReplacedReceiver`
- `com.spotify.widgets.npvwidget.WidgetUpdateCoordinator`
- `com.spotify.collection.offlinesyncnotification.BulkRedownloadCancelReceiver`
- `com.spotify.engagesdk.engagecontinuationcluster.EngageContinuationClusterBroadcastReceiver`
- `com.spotify.engagesdk.engagerecommendationscluster.EngageRecommendationsClusterBroadcastReceiver`
- `com.spotify.widgets.miuidynamicnpvwidget.MiuiDynamicNpvWidgetProvider`
- `com.spotify.widgets.transsioncardwidget.TranssionCardWidgetProvider`
- `com.spotify.bluetooth.deviceconnectionreceiverimpl.BluetoothConnectionStateReceiver`
- `androidx.car.app.notification.CarAppNotificationBroadcastReceiver`

The most important playback receiver is:

`com.spotify.mediasession.mediasession.receiver.MediaButtonReceiver`

which accepts `android.intent.action.MEDIA_BUTTON`.

## Content providers

- `androidx.car.app.connection.provider`
- `androidx.startup.InitializationProvider`
- `com.spotify.externalintegration.service.provider.MediaProvider`
- `androidx.core.content.FileProvider`
- `com.spotify.notifications.pushnotificationsv2.pushnotificationimpl.impl.utils.PushFileProvider`
- `com.spotify.profile.editprofile.editprofile.provider.ProfilePictureProvider`
- `com.spotify.thestage.vtec.upload.VtecFileProvider`
- `com.spotify.carapplibrary.app.imageloading.CalImageProvider`
- `com.spotify.initialization.app.EarlyInitializationProvider`
- `com.spotify.playlistartwork.imagepicker.page.ImagePickerFileProvider`

Of particular interest:

- `com.spotify.externalintegration.service.provider.MediaProvider`
- `com.spotify.initialization.app.EarlyInitializationProvider`

The early-initialization provider suggests some bootstrap work can happen through a provider before the main Activity starts.

## External integrations visible from the manifest

The manifest confirms integration with:

- Android Auto / Car App
- Android MediaBrowser / Media3
- Bluetooth/media buttons
- Chromecast / MediaRouter
- Wear OS
- Firebase messaging
- widgets / Glance
- WorkManager
- Room
- Google Sign-In / Google APIs
- Facebook authentication
- ML Kit
- Android Sharesheet

## Notes

An exported Android component is not automatically unrestricted. Several media/browser components have internal allowlist/denylist or caller-validation logic in the decompiled source.

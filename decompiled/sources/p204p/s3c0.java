package p204p;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import com.spotify.login.adaptiveauthentication.challenge.web.NoAnimLauncherActivity;
import com.spotify.music.R;
import java.util.Collections;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s3c0 extends Activity {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r2.queryIntentServices(r5, 64).size() > 0) goto L16;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m77126a(NoAnimLauncherActivity noAnimLauncherActivity, String str) {
        int i = Build.VERSION.SDK_INT;
        if (i < 25) {
            return;
        }
        PackageManager packageManager = noAnimLauncherActivity.getPackageManager();
        ShortcutManager shortcutManager = (ShortcutManager) noAnimLauncherActivity.getSystemService(ShortcutManager.class);
        if (str != null) {
            if (!(!ebe.f57907a.contains(str) ? false : ebe.m38364a(packageManager, str, 362600000))) {
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
                intent.addCategory("androidx.browser.trusted.category.LaunchSiteSettings");
                intent.setPackage(str);
            }
            ShortcutInfo shortcutInfoBuild = null;
            if (i >= 25) {
                Intent intent2 = new Intent(noAnimLauncherActivity, (Class<?>) s3c0.class);
                intent2.setAction("android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA");
                if (packageManager.queryIntentActivities(intent2, 65536).size() != 0) {
                    int identifier = noAnimLauncherActivity.getResources().getIdentifier("drawable/override_ic_site_settings", "drawable", noAnimLauncherActivity.getPackageName());
                    ShortcutInfo.Builder longLabel = new ShortcutInfo.Builder(noAnimLauncherActivity, "android.support.customtabs.action.SITE_SETTINGS_SHORTCUT").setShortLabel("Site Settings").setLongLabel("Manage website notifications, permissions, etc.");
                    if (identifier == 0) {
                        identifier = R.drawable.ic_site_settings;
                    }
                    shortcutInfoBuild = longLabel.setIcon(Icon.createWithResource(noAnimLauncherActivity, identifier)).setIntent(intent2).build();
                }
            }
            if (shortcutInfoBuild == null) {
                shortcutManager.removeDynamicShortcuts(Collections.singletonList("android.support.customtabs.action.SITE_SETTINGS_SHORTCUT"));
                return;
            } else {
                shortcutManager.addDynamicShortcuts(Collections.singletonList(shortcutInfoBuild));
                return;
            }
        }
        shortcutManager.removeDynamicShortcuts(Collections.singletonList("android.support.customtabs.action.SITE_SETTINGS_SHORTCUT"));
    }
}

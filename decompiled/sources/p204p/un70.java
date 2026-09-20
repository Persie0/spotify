package p204p;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class un70 {

    /* JADX INFO: renamed from: a */
    public final String f232074a;

    /* JADX INFO: renamed from: b */
    public final int f232075b;

    /* JADX INFO: renamed from: c */
    public final int f232076c;

    /* JADX INFO: renamed from: d */
    public final int f232077d;

    /* JADX INFO: renamed from: e */
    public final int f232078e;

    /* JADX INFO: renamed from: f */
    public final int f232079f;

    /* JADX INFO: renamed from: g */
    public final int f232080g;

    /* JADX INFO: renamed from: h */
    public final int f232081h;

    /* JADX INFO: renamed from: i */
    public final int f232082i;

    /* JADX INFO: renamed from: j */
    public final String f232083j;

    /* JADX INFO: renamed from: k */
    public final int f232084k;

    /* JADX INFO: renamed from: l */
    public final List f232085l;

    /* JADX INFO: renamed from: m */
    public final String f232086m;

    /* JADX INFO: renamed from: n */
    public final il91 f232087n;

    /* JADX INFO: renamed from: o */
    public final int f232088o;

    /* JADX INFO: renamed from: p */
    public final String f232089p;

    /* JADX WARN: Code duplicated, block: B:15:0x00ba  */
    public un70(Bundle bundle, Resources resources) {
        il91 mwt0Var;
        this.f232074a = bundle.getString("android.support.customtabs.trusted.DEFAULT_URL");
        int i = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR", R.color.white);
        this.f232075b = i;
        this.f232076c = bundle.getInt("android.support.customtabs.trusted.STATUS_BAR_COLOR_DARK", i);
        int i2 = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR", R.color.white);
        this.f232077d = i2;
        this.f232078e = bundle.getInt("android.support.customtabs.trusted.NAVIGATION_BAR_COLOR_DARK", i2);
        this.f232079f = bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR", R.color.transparent);
        this.f232080g = bundle.getInt("androix.browser.trusted.NAVIGATION_BAR_DIVIDER_COLOR_DARK", i2);
        boolean z = false;
        this.f232081h = bundle.getInt("android.support.customtabs.trusted.SPLASH_IMAGE_DRAWABLE", 0);
        this.f232082i = bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_BACKGROUND_COLOR", R.color.white);
        this.f232083j = bundle.getString("android.support.customtabs.trusted.FILE_PROVIDER_AUTHORITY");
        this.f232084k = bundle.getInt("android.support.customtabs.trusted.SPLASH_SCREEN_FADE_OUT_DURATION", 0);
        if (bundle.containsKey("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")) {
            this.f232085l = Arrays.asList(resources.getStringArray(bundle.getInt("android.support.customtabs.trusted.ADDITIONAL_TRUSTED_ORIGINS")));
        } else {
            this.f232085l = null;
        }
        this.f232086m = bundle.getString("android.support.customtabs.trusted.FALLBACK_STRATEGY");
        String string = bundle.getString("android.support.customtabs.trusted.DISPLAY_MODE");
        int i3 = 11;
        int i4 = 1;
        char c = 1;
        if ("immersive".equals(string)) {
            mwt0Var = new mwt0(z, i3);
        } else {
            mwt0Var = "sticky-immersive".equals(string) ? new mwt0(c == true ? 1 : 0, i3) : new lb5(29);
        }
        this.f232087n = mwt0Var;
        String string2 = bundle.getString("android.support.customtabs.trusted.SCREEN_ORIENTATION");
        if (string2 != null) {
            switch (string2) {
                case "portrait-primary":
                    break;
                case "landscape-secondary":
                    i4 = 4;
                    break;
                case "any":
                    i4 = 5;
                    break;
                case "portrait":
                    i4 = 7;
                    break;
                case "landscape":
                    i4 = 6;
                    break;
                case "natural":
                    i4 = 8;
                    break;
                case "landscape-primary":
                    i4 = 3;
                    break;
                case "portrait-secondary":
                    i4 = 2;
                    break;
                default:
                    i4 = 0;
                    break;
            }
        } else {
            i4 = 0;
        }
        this.f232088o = i4;
        int i5 = bundle.getInt("android.support.customtabs.trusted.METADATA_SHARE_TARGET", 0);
        this.f232089p = i5 != 0 ? resources.getString(i5) : null;
    }

    /* JADX INFO: renamed from: a */
    public static un70 m83535a(Context context) {
        Bundle bundle;
        Resources resources = context.getResources();
        try {
            bundle = context.getPackageManager().getActivityInfo(new ComponentName(context, context.getClass()), 128).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            bundle = null;
        }
        if (bundle == null) {
            bundle = new Bundle();
        }
        return new un70(bundle, resources);
    }
}

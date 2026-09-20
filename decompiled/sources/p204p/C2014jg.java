package p204p;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.view.accessibility.AccessibilityManager;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: p.jg */
/* JADX INFO: loaded from: classes5.dex */
public final class C2014jg {

    /* JADX INFO: renamed from: c */
    public static final Uri f111986c = Settings.Global.getUriFor("animator_duration_scale");

    /* JADX INFO: renamed from: d */
    public static final Uri f111987d = Settings.Secure.getUriFor("enabled_accessibility_services");

    /* JADX INFO: renamed from: a */
    public final Context f111988a;

    /* JADX INFO: renamed from: b */
    public final AccessibilityManager f111989b;

    public C2014jg(Context context) {
        this.f111988a = context;
        Object systemService = context.getSystemService("accessibility");
        this.f111989b = systemService instanceof AccessibilityManager ? (AccessibilityManager) systemService : null;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m53246a(C2014jg c2014jg) {
        AccessibilityManager accessibilityManager = c2014jg.f111989b;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        wj50.m88279p(enabledAccessibilityServiceList);
        if (enabledAccessibilityServiceList.isEmpty()) {
            return false;
        }
        Iterator<T> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            if (wl51.m88496t0(((AccessibilityServiceInfo) it.next()).getId(), "SwitchAccessService", true)) {
                return true;
            }
        }
        return false;
    }
}

package p204p;

import android.app.ActivityOptions;
import android.app.Notification;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: renamed from: p.qf */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2291qf {
    /* JADX INFO: renamed from: a */
    public static int m72676a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getChecked();
    }

    /* JADX INFO: renamed from: b */
    public static int m72677b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExpandedState();
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m72678c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getSupplementalDescription();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m72679d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isFieldRequired();
    }

    /* JADX INFO: renamed from: e */
    public static void m72680e(ActivityOptions activityOptions, boolean z) {
        activityOptions.setAllowPassThroughOnTouchOutside(z);
    }

    /* JADX INFO: renamed from: f */
    public static void m72681f(Notification.Builder builder) {
        builder.setShortCriticalText(null);
    }
}

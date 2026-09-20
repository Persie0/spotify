package p204p;

import android.graphics.Insets;
import android.media.RouteDiscoveryPreference;
import android.util.CloseGuard;
import android.view.WindowInsetsAnimation;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public abstract /* synthetic */ class jt3 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ RouteDiscoveryPreference.Builder m54259a(ArrayList arrayList) {
        return new RouteDiscoveryPreference.Builder(arrayList, false);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ CloseGuard m54260b() {
        return new CloseGuard();
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ WindowInsetsAnimation.Bounds m54261c(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ WindowInsetsAnimation m54262d(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ AccessibilityEvent m54263e() {
        return new AccessibilityEvent();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m54264f() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m54265g() {
    }
}

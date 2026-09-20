package p204p;

import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.ScrollView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class qec1 {
    /* JADX INFO: renamed from: a */
    public static final void m72607a(ScrollView scrollView, m500 m500Var, View view) {
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        int iM92170i = xuf1.m92170i(m500Var);
        if (Build.VERSION.SDK_INT >= 28 && (window = m500Var.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = decorView.getRootWindowInsets()) != null && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
            iM92170i = displayCutout.getSafeInsetTop();
        }
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new dce0(scrollView, view, iM92170i, 1));
    }

    /* JADX INFO: renamed from: b */
    public static int m72608b(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    /* JADX INFO: renamed from: c */
    public static void m72609c(View view) {
        view.resetPivot();
    }

    /* JADX INFO: renamed from: d */
    public static void m72610d(View view, int i) {
        view.setOutlineAmbientShadowColor(i);
    }

    /* JADX INFO: renamed from: e */
    public static void m72611e(View view, int i) {
        view.setOutlineSpotShadowColor(i);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m72612f(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}

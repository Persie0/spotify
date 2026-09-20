package p204p;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class gec1 {
    /* JADX INFO: renamed from: a */
    public static CharSequence m44464a(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* JADX INFO: renamed from: b */
    public static boolean m44465b(View view) {
        return view.isAccessibilityHeading();
    }

    /* JADX INFO: renamed from: c */
    public static boolean m44466c(View view) {
        return view.isScreenReaderFocusable();
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m44467d(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* JADX INFO: renamed from: e */
    public static void m44468e(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: renamed from: f */
    public static void m44469f(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* JADX INFO: renamed from: g */
    public static void m44470g(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}

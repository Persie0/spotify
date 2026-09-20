package p204p;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class cec1 {
    /* JADX INFO: renamed from: a */
    public static void m32537a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    /* JADX INFO: renamed from: b */
    public static swd1 m32538b(View view, swd1 swd1Var, Rect rect) {
        WindowInsets windowInsetsM79541f = swd1Var.m79541f();
        if (windowInsetsM79541f != null) {
            return swd1.m79536g(view, view.computeSystemWindowInsets(windowInsetsM79541f, rect));
        }
        rect.setEmpty();
        return swd1Var;
    }

    /* JADX INFO: renamed from: c */
    public static ColorStateList m32539c(View view) {
        return view.getBackgroundTintList();
    }

    /* JADX INFO: renamed from: d */
    public static PorterDuff.Mode m32540d(View view) {
        return view.getBackgroundTintMode();
    }

    /* JADX INFO: renamed from: e */
    public static float m32541e(View view) {
        return view.getElevation();
    }

    /* JADX INFO: renamed from: f */
    public static String m32542f(View view) {
        return view.getTransitionName();
    }

    /* JADX INFO: renamed from: g */
    public static float m32543g(View view) {
        return view.getZ();
    }

    /* JADX INFO: renamed from: h */
    public static boolean m32544h(View view) {
        return view.isImportantForAccessibility();
    }

    /* JADX INFO: renamed from: i */
    public static boolean m32545i(View view) {
        return view.isNestedScrollingEnabled();
    }

    /* JADX INFO: renamed from: j */
    public static void m32546j(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    /* JADX INFO: renamed from: k */
    public static void m32547k(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    /* JADX INFO: renamed from: l */
    public static void m32548l(View view, float f) {
        view.setElevation(f);
    }

    /* JADX INFO: renamed from: m */
    public static void m32549m(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    /* JADX INFO: renamed from: n */
    public static void m32550n(View view, t6l0 t6l0Var) {
        bec1 bec1Var = t6l0Var != null ? new bec1(view, t6l0Var) : null;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, bec1Var);
        }
        if (view.getTag(R.id.tag_compat_insets_dispatch) != null) {
            return;
        }
        if (bec1Var != null) {
            view.setOnApplyWindowInsetsListener(bec1Var);
        } else {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        }
    }

    /* JADX INFO: renamed from: o */
    public static void m32551o(View view, String str) {
        view.setTransitionName(str);
    }

    /* JADX INFO: renamed from: p */
    public static void m32552p(View view) {
        view.stopNestedScroll();
    }
}

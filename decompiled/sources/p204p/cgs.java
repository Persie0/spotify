package p204p;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class cgs {

    /* JADX INFO: renamed from: a */
    public static final int[] f37782a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b */
    public static final int[] f37783b = new int[0];

    /* JADX INFO: renamed from: c */
    public static final Rect f37784c = new Rect();

    /* JADX INFO: renamed from: a */
    public static void m32734a(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i < 29 || i >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f37782a);
        } else {
            drawable.setState(f37783b);
        }
        drawable.setState(state);
    }

    /* JADX INFO: renamed from: b */
    public static Rect m32735b(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return ags.m25883a(svg1.m79464R(drawable));
        }
        Insets insetsM29146a = bgs.m29146a(drawable);
        return new Rect(insetsM29146a.left, insetsM29146a.top, insetsM29146a.right, insetsM29146a.bottom);
    }

    /* JADX INFO: renamed from: c */
    public static PorterDuff.Mode m32736c(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}

package p204p;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg71 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f59237a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f59238b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f59239c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f59240d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f59241e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f59242f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f59243g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m38806a(Context context, View view) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(h3u0.f87330j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m38807b(Context context, int i) {
        ColorStateList colorStateListM38809d = m38809d(context, i);
        if (colorStateListM38809d != null && colorStateListM38809d.isStateful()) {
            return colorStateListM38809d.getColorForState(f59238b, colorStateListM38809d.getDefaultColor());
        }
        ThreadLocal threadLocal = f59237a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM38808c = m38808c(context, i);
        return m9f.m61224l(iM38808c, Math.round(Color.alpha(iM38808c) * f));
    }

    /* JADX INFO: renamed from: c */
    public static int m38808c(Context context, int i) {
        int[] iArr = f59243g;
        iArr[0] = i;
        cx21 cx21VarM34177I = cx21.m34177I(context, null, iArr);
        try {
            return cx21VarM34177I.m34197f();
        } finally {
            cx21VarM34177I.m34189K();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m38809d(Context context, int i) {
        int[] iArr = f59243g;
        iArr[0] = i;
        cx21 cx21VarM34177I = cx21.m34177I(context, null, iArr);
        try {
            return cx21VarM34177I.m34198g(0);
        } finally {
            cx21VarM34177I.m34189K();
        }
    }
}

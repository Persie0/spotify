package p204p;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class bpc1 {

    /* JADX INFO: renamed from: a */
    public static final dpc1 f29411a;

    /* JADX INFO: renamed from: b */
    public static final apc1 f29412b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f29411a = new epc1();
        } else {
            f29411a = new dpc1();
        }
        f29412b = new apc1(Float.class, "translationAlpha");
        new tjc(12);
    }

    /* JADX INFO: renamed from: a */
    public static void m30114a(View view, int i, int i2, int i3, int i4) {
        f29411a.mo36567l0(view, i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: b */
    public static void m30115b(View view, int i) {
        f29411a.mo36566Y(view, i);
    }
}

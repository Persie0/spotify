package p204p;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bmx0 extends Drawable {

    /* JADX INFO: renamed from: a */
    public static final double f28649a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: a */
    public static float m29922a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f28649a) * ((double) f2)) + ((double) f));
    }

    /* JADX INFO: renamed from: b */
    public static float m29923b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f28649a) * ((double) f2)) + ((double) (f * 1.5f)));
    }
}

package p204p;

import android.graphics.Paint;
import android.graphics.Rect;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u0b1 {

    /* JADX INFO: renamed from: a */
    public static DisplayMetrics f225435a = null;

    /* JADX INFO: renamed from: b */
    public static int f225436b = 50;

    /* JADX INFO: renamed from: c */
    public static int f225437c = 8000;

    /* JADX INFO: renamed from: d */
    public static final Rect f225438d;

    /* JADX INFO: renamed from: e */
    public static final Paint.FontMetrics f225439e;

    /* JADX INFO: renamed from: f */
    public static final Rect f225440f;

    /* JADX INFO: renamed from: g */
    public static final t5p f225441g;

    /* JADX INFO: renamed from: h */
    public static final Rect f225442h;

    /* JADX INFO: renamed from: i */
    public static final Paint.FontMetrics f225443i;

    static {
        Double.longBitsToDouble(1L);
        Float.intBitsToFloat(1);
        f225438d = new Rect();
        f225439e = new Paint.FontMetrics();
        f225440f = new Rect();
        f225441g = new t5p(1);
        new Rect();
        f225442h = new Rect();
        f225443i = new Paint.FontMetrics();
    }

    /* JADX INFO: renamed from: a */
    public static int m82120a(Paint paint, String str) {
        Rect rect = f225438d;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    /* JADX INFO: renamed from: b */
    public static p5y m82121b(Paint paint, String str) {
        p5y p5yVar = (p5y) p5y.f174252d.m45274b();
        p5yVar.f174253b = 0.0f;
        p5yVar.f174254c = 0.0f;
        Rect rect = f225440f;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        p5yVar.f174253b = rect.width();
        p5yVar.f174254c = rect.height();
        return p5yVar;
    }

    /* JADX INFO: renamed from: c */
    public static float m82122c(float f) {
        DisplayMetrics displayMetrics = f225435a;
        return displayMetrics == null ? f : f * displayMetrics.density;
    }

    /* JADX INFO: renamed from: d */
    public static float m82123d(double d) {
        if (Double.isInfinite(d) || Double.isNaN(d) || d == 0.0d) {
            return 0.0f;
        }
        float fPow = (float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d < 0.0d ? -d : d))));
        return Math.round(d * ((double) fPow)) / fPow;
    }
}

package p204p;

import android.content.Context;
import android.graphics.Color;
import com.spotify.music.R;

/* JADX INFO: loaded from: classes.dex */
public final class eyt {

    /* JADX INFO: renamed from: f */
    public static final int f64160f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f64161a;

    /* JADX INFO: renamed from: b */
    public final int f64162b;

    /* JADX INFO: renamed from: c */
    public final int f64163c;

    /* JADX INFO: renamed from: d */
    public final int f64164d;

    /* JADX INFO: renamed from: e */
    public final float f64165e;

    public eyt(Context context) {
        boolean zM81522q = ttg1.m81522q(context, R.attr.elevationOverlayEnabled, false);
        int iM86386m = vtg1.m86386m(context, R.attr.elevationOverlayColor, 0);
        int iM86386m2 = vtg1.m86386m(context, R.attr.elevationOverlayAccentColor, 0);
        int iM86386m3 = vtg1.m86386m(context, R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f64161a = zM81522q;
        this.f64162b = iM86386m;
        this.f64163c = iM86386m2;
        this.f64164d = iM86386m3;
        this.f64165e = f;
    }

    /* JADX INFO: renamed from: a */
    public final int m40323a(float f, int i) {
        int i2;
        if (!this.f64161a || m9f.m61224l(i, 255) != this.f64164d) {
            return i;
        }
        float f2 = this.f64165e;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM86393t = vtg1.m86393t(m9f.m61224l(i, 255), this.f64162b, fMin);
        if (fMin > 0.0f && (i2 = this.f64163c) != 0) {
            iM86393t = vtg1.m86392s(iM86393t, m9f.m61224l(i2, f64160f));
        }
        return m9f.m61224l(iM86393t, iAlpha);
    }
}

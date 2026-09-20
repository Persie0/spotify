package p204p;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: loaded from: classes.dex */
public final class yg01 {

    /* JADX INFO: renamed from: i */
    public static final int[] f272406i = new int[3];

    /* JADX INFO: renamed from: j */
    public static final float[] f272407j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k */
    public static final int[] f272408k = new int[4];

    /* JADX INFO: renamed from: l */
    public static final float[] f272409l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a */
    public final Paint f272410a;

    /* JADX INFO: renamed from: b */
    public final Paint f272411b;

    /* JADX INFO: renamed from: c */
    public final Paint f272412c;

    /* JADX INFO: renamed from: d */
    public int f272413d;

    /* JADX INFO: renamed from: e */
    public int f272414e;

    /* JADX INFO: renamed from: f */
    public int f272415f;

    /* JADX INFO: renamed from: g */
    public final Path f272416g = new Path();

    /* JADX INFO: renamed from: h */
    public final Paint f272417h;

    public yg01() {
        Paint paint = new Paint();
        this.f272417h = paint;
        this.f272410a = new Paint();
        m93580a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f272411b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f272412c = new Paint(paint2);
    }

    /* JADX INFO: renamed from: a */
    public final void m93580a(int i) {
        this.f272413d = m9f.m61224l(i, 68);
        this.f272414e = m9f.m61224l(i, 20);
        this.f272415f = m9f.m61224l(i, 0);
        this.f272410a.setColor(this.f272413d);
    }
}

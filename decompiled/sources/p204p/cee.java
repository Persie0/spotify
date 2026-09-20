package p204p;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class cee {

    /* JADX INFO: renamed from: a */
    public final RectF f37091a = new RectF();

    /* JADX INFO: renamed from: b */
    public final Paint f37092b;

    /* JADX INFO: renamed from: c */
    public final Paint f37093c;

    /* JADX INFO: renamed from: d */
    public final Paint f37094d;

    /* JADX INFO: renamed from: e */
    public float f37095e;

    /* JADX INFO: renamed from: f */
    public float f37096f;

    /* JADX INFO: renamed from: g */
    public float f37097g;

    /* JADX INFO: renamed from: h */
    public float f37098h;

    /* JADX INFO: renamed from: i */
    public int[] f37099i;

    /* JADX INFO: renamed from: j */
    public int f37100j;

    /* JADX INFO: renamed from: k */
    public float f37101k;

    /* JADX INFO: renamed from: l */
    public float f37102l;

    /* JADX INFO: renamed from: m */
    public float f37103m;

    /* JADX INFO: renamed from: n */
    public boolean f37104n;

    /* JADX INFO: renamed from: o */
    public Path f37105o;

    /* JADX INFO: renamed from: p */
    public float f37106p;

    /* JADX INFO: renamed from: q */
    public float f37107q;

    /* JADX INFO: renamed from: r */
    public int f37108r;

    /* JADX INFO: renamed from: s */
    public int f37109s;

    /* JADX INFO: renamed from: t */
    public int f37110t;

    /* JADX INFO: renamed from: u */
    public int f37111u;

    public cee() {
        Paint paint = new Paint();
        this.f37092b = paint;
        Paint paint2 = new Paint();
        this.f37093c = paint2;
        Paint paint3 = new Paint();
        this.f37094d = paint3;
        this.f37095e = 0.0f;
        this.f37096f = 0.0f;
        this.f37097g = 0.0f;
        this.f37098h = 5.0f;
        this.f37106p = 1.0f;
        this.f37110t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    /* JADX INFO: renamed from: a */
    public final void m32555a(int i) {
        this.f37100j = i;
        this.f37111u = this.f37099i[i];
    }
}

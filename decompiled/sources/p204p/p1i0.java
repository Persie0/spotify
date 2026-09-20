package p204p;

import androidx.constraintlayout.motion.widget.C0043a;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class p1i0 implements Comparable {

    /* JADX INFO: renamed from: P0 */
    public static final String[] f173091P0 = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: a */
    public aqs f173099a;

    /* JADX INFO: renamed from: c */
    public float f173101c;

    /* JADX INFO: renamed from: d */
    public float f173102d;

    /* JADX INFO: renamed from: e */
    public float f173103e;

    /* JADX INFO: renamed from: f */
    public float f173104f;

    /* JADX INFO: renamed from: g */
    public float f173105g;

    /* JADX INFO: renamed from: h */
    public float f173106h;

    /* JADX INFO: renamed from: b */
    public int f173100b = 0;

    /* JADX INFO: renamed from: i */
    public float f173107i = Float.NaN;

    /* JADX INFO: renamed from: t */
    public int f173108t = -1;

    /* JADX INFO: renamed from: X */
    public int f173096X = -1;

    /* JADX INFO: renamed from: Y */
    public float f173097Y = Float.NaN;

    /* JADX INFO: renamed from: Z */
    public C0043a f173098Z = null;

    /* JADX INFO: renamed from: L0 */
    public LinkedHashMap f173092L0 = new LinkedHashMap();

    /* JADX INFO: renamed from: M0 */
    public int f173093M0 = 0;

    /* JADX INFO: renamed from: N0 */
    public double[] f173094N0 = new double[18];

    /* JADX INFO: renamed from: O0 */
    public double[] f173095O0 = new double[18];

    /* JADX INFO: renamed from: b */
    public static boolean m68814b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return Float.isNaN(f) != Float.isNaN(f2);
        }
        return Math.abs(f - f2) > 1.0E-6f;
    }

    /* JADX INFO: renamed from: e */
    public static void m68815e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f7;
            } else if (i2 == 2) {
                f5 = f7;
            } else if (i2 == 3) {
                f4 = f7;
            } else if (i2 == 4) {
                f6 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (((f4 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + 0.0f;
        fArr[1] = (((f6 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + 0.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m68816a(x6j x6jVar) {
        int iM38547C;
        this.f173099a = aqs.m26892e(x6jVar.f258685d.f279929d);
        z6j z6jVar = x6jVar.f258685d;
        this.f173108t = z6jVar.f279930e;
        this.f173096X = z6jVar.f279927b;
        this.f173107i = z6jVar.f279933h;
        this.f173100b = z6jVar.f279931f;
        this.f173097Y = x6jVar.f258686e.f269797C;
        for (String str : x6jVar.f258688g.keySet()) {
            d6j d6jVar = (d6j) x6jVar.f258688g.get(str);
            if (d6jVar != null && (iM38547C = edb.m38547C(d6jVar.f45706c)) != 4 && iM38547C != 5 && iM38547C != 7) {
                this.f173092L0.put(str, d6jVar);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m68817c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        float fSin = this.f173103e;
        float fCos = this.f173104f;
        float f = this.f173105g;
        float f2 = this.f173106h;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 == 1) {
                fSin = f3;
            } else if (i3 == 2) {
                fCos = f3;
            } else if (i3 == 3) {
                f = f3;
            } else if (i3 == 4) {
                f2 = f3;
            }
        }
        C0043a c0043a = this.f173098Z;
        if (c0043a != null) {
            float[] fArr2 = new float[2];
            c0043a.m348b(d, fArr2, new float[2]);
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            double d2 = f4;
            double d3 = fSin;
            double d4 = fCos;
            fSin = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f / 2.0f)));
            fCos = (float) ((((double) f5) - (Math.cos(d4) * d3)) - ((double) (f2 / 2.0f)));
        }
        fArr[i] = (f / 2.0f) + fSin + 0.0f;
        fArr[i + 1] = (f2 / 2.0f) + fCos + 0.0f;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Float.compare(this.f173102d, ((p1i0) obj).f173102d);
    }

    /* JADX INFO: renamed from: d */
    public final void m68818d(float f, float f2, float f3, float f4) {
        this.f173103e = f;
        this.f173104f = f2;
        this.f173105g = f3;
        this.f173106h = f4;
    }

    /* JADX INFO: renamed from: f */
    public final void m68819f(C0043a c0043a, p1i0 p1i0Var) {
        double d = (((this.f173105g / 2.0f) + this.f173103e) - p1i0Var.f173103e) - (p1i0Var.f173105g / 2.0f);
        double d2 = (((this.f173106h / 2.0f) + this.f173104f) - p1i0Var.f173104f) - (p1i0Var.f173106h / 2.0f);
        this.f173098Z = c0043a;
        this.f173103e = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f173097Y)) {
            this.f173104f = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f173104f = (float) Math.toRadians(this.f173097Y);
        }
    }
}

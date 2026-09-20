package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ji5 {

    /* JADX INFO: renamed from: a */
    public final float f112643a;

    /* JADX INFO: renamed from: b */
    public final float f112644b;

    /* JADX INFO: renamed from: c */
    public final float f112645c;

    /* JADX INFO: renamed from: d */
    public final float f112646d;

    /* JADX INFO: renamed from: e */
    public final float f112647e;

    /* JADX INFO: renamed from: f */
    public final float f112648f;

    /* JADX INFO: renamed from: g */
    public final float f112649g;

    /* JADX INFO: renamed from: h */
    public float f112650h;

    /* JADX INFO: renamed from: i */
    public float f112651i;

    /* JADX INFO: renamed from: j */
    public final float[] f112652j;

    /* JADX INFO: renamed from: k */
    public final float f112653k;

    /* JADX INFO: renamed from: l */
    public final float f112654l;

    /* JADX INFO: renamed from: m */
    public final float f112655m;

    /* JADX INFO: renamed from: n */
    public final float f112656n;

    /* JADX INFO: renamed from: o */
    public final float f112657o;

    /* JADX INFO: renamed from: p */
    public final boolean f112658p;

    /* JADX INFO: renamed from: q */
    public final float f112659q;

    /* JADX INFO: renamed from: r */
    public final float f112660r;

    public ji5(int i, float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        int i2;
        float[] fArr;
        float f7 = f3;
        this.f112643a = f;
        this.f112644b = f2;
        this.f112645c = f7;
        this.f112646d = f4;
        this.f112647e = f5;
        this.f112648f = f6;
        float f8 = f5 - f7;
        float f9 = f6 - f4;
        int i3 = 1;
        boolean z2 = i == 1 || (i == 4 ? f9 > 0.0f : !(i != 5 || f9 >= 0.0f));
        float f10 = z2 ? -1.0f : 1.0f;
        this.f112655m = f10;
        float f11 = 1 / (f2 - f);
        this.f112653k = f11;
        float[] fArr2 = new float[101];
        this.f112652j = fArr2;
        boolean z3 = i == 3;
        if (z3 || Math.abs(f8) < 0.001f || Math.abs(f9) < 0.001f) {
            float fHypot = (float) Math.hypot(f9, f8);
            this.f112649g = fHypot;
            this.f112654l = fHypot * f11;
            this.f112659q = f8 * f11;
            this.f112660r = f9 * f11;
            this.f112656n = Float.NaN;
            this.f112657o = Float.NaN;
            z = true;
        } else {
            this.f112656n = f8 * f10;
            this.f112657o = f9 * (-f10);
            this.f112659q = z2 ? f5 : f7;
            this.f112660r = z2 ? f4 : f6;
            float f12 = f4 - f6;
            float[] fArr3 = y85.f270202a;
            float f13 = 90;
            float f14 = f12;
            int i4 = 1;
            float fHypot2 = 0.0f;
            float f15 = 0.0f;
            while (true) {
                i2 = i3;
                fArr = fArr2;
                double d = (float) (((((double) i4) * 90.0d) / ((double) 90)) * 0.017453292519943295d);
                float fSin = ((float) Math.sin(d)) * f8;
                float fCos = ((float) Math.cos(d)) * f12;
                fHypot2 += (float) Math.hypot(fSin - f15, fCos - f14);
                fArr3[i4] = fHypot2;
                if (i4 == 90) {
                    break;
                }
                i4++;
                f14 = fCos;
                f15 = fSin;
                fArr2 = fArr;
                i3 = i2;
            }
            this.f112649g = fHypot2;
            int i5 = i2;
            while (true) {
                fArr3[i5] = fArr3[i5] / fHypot2;
                if (i5 == 90) {
                    break;
                } else {
                    i5++;
                }
            }
            for (int i6 = 0; i6 < 101; i6++) {
                float f16 = i6 / 100.0f;
                int iM29615i0 = bk5.m29615i0(f16, fArr3);
                if (iM29615i0 >= 0) {
                    fArr[i6] = iM29615i0 / f13;
                } else if (iM29615i0 == -1) {
                    fArr[i6] = 0.0f;
                } else {
                    int i7 = -iM29615i0;
                    int i8 = i7 - 2;
                    float f17 = i8;
                    float f18 = fArr3[i8];
                    fArr[i6] = (((f16 - f18) / (fArr3[i7 - 1] - f18)) + f17) / f13;
                }
            }
            this.f112654l = this.f112649g * this.f112653k;
            z = z3;
        }
        this.f112658p = z;
    }

    /* JADX INFO: renamed from: a */
    public final float m53443a() {
        float f = this.f112656n * this.f112651i;
        return f * this.f112655m * (this.f112654l / ((float) Math.hypot(f, (-this.f112657o) * this.f112650h)));
    }

    /* JADX INFO: renamed from: b */
    public final float m53444b() {
        float f = this.f112656n * this.f112651i;
        float f2 = (-this.f112657o) * this.f112650h;
        return f2 * this.f112655m * (this.f112654l / ((float) Math.hypot(f, f2)));
    }

    /* JADX INFO: renamed from: c */
    public final void m53445c(float f) {
        float f2 = (this.f112655m == -1.0f ? this.f112644b - f : f - this.f112643a) * this.f112653k;
        float fM38555d = 0.0f;
        if (f2 > 0.0f) {
            fM38555d = 1.0f;
            if (f2 < 1.0f) {
                float f3 = f2 * 100;
                int i = (int) f3;
                float[] fArr = this.f112652j;
                float f4 = fArr[i];
                fM38555d = edb.m38555d(fArr[i + 1], f4, f3 - i, f4);
            }
        }
        double d = fM38555d * 1.5707964f;
        this.f112650h = (float) Math.sin(d);
        this.f112651i = (float) Math.cos(d);
    }
}

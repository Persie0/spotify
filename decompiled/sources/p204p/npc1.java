package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class npc1 {

    /* JADX INFO: renamed from: k */
    public static final npc1 f156936k;

    /* JADX INFO: renamed from: a */
    public final float f156937a;

    /* JADX INFO: renamed from: b */
    public final float f156938b;

    /* JADX INFO: renamed from: c */
    public final float f156939c;

    /* JADX INFO: renamed from: d */
    public final float f156940d;

    /* JADX INFO: renamed from: e */
    public final float f156941e;

    /* JADX INFO: renamed from: f */
    public final float f156942f;

    /* JADX INFO: renamed from: g */
    public final float[] f156943g;

    /* JADX INFO: renamed from: h */
    public final float f156944h;

    /* JADX INFO: renamed from: i */
    public final float f156945i;

    /* JADX INFO: renamed from: j */
    public final float f156946j;

    static {
        float fM31836c0 = (float) ((((double) c95.m31836c0()) * 63.66197723675813d) / 100.0d);
        float[] fArr = c95.f35400c;
        float f = fArr[0];
        float[][] fArr2 = c95.f35398a;
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0] * f;
        float f3 = fArr[1];
        float f4 = (fArr3[1] * f3) + f2;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4;
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[2] * f5) + (fArr4[1] * f3) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f8 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f * fArr5[0]);
        float f9 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float fM66394h = o7t0.m66394h((float) Math.exp(((-fM31836c0) - 42.0f) / 92.0f), 0.2777778f, 1.0f, 1.0f);
        double d = fM66394h;
        if (d > 1.0d) {
            fM66394h = 1.0f;
        } else if (d < 0.0d) {
            fM66394h = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * fM66394h) + 1.0f) - fM66394h, (((100.0f / f7) * fM66394h) + 1.0f) - fM66394h, (((100.0f / f8) * fM66394h) + 1.0f) - fM66394h};
        float f10 = 1.0f / ((5.0f * fM31836c0) + 1.0f);
        float f11 = f10 * f10 * f10 * f10;
        float f12 = 1.0f - f11;
        float fCbrt = (0.1f * f12 * f12 * ((float) Math.cbrt(((double) fM31836c0) * 5.0d))) + (f11 * fM31836c0);
        float fM31836c1 = c95.m31836c0() / fArr[1];
        double d2 = fM31836c1;
        float fSqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float fPow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) Math.pow(((double) ((fArr6[0] * fCbrt) * f6)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[1] * fCbrt) * f7)) / 100.0d, 0.42d), (float) Math.pow(((double) ((fArr6[2] * fCbrt) * f8)) / 100.0d, 0.42d)};
        float f13 = fArr7[0];
        float f14 = (f13 * 400.0f) / (f13 + 27.13f);
        float f15 = fArr7[1];
        float f16 = (f15 * 400.0f) / (f15 + 27.13f);
        float f17 = fArr7[2];
        float[] fArr8 = {f14, f16, (400.0f * f17) / (f17 + 27.13f)};
        f156936k = new npc1(fM31836c1, ms2.m62680e(fArr8[2], 0.05f, (fArr8[0] * 2.0f) + fArr8[1], fPow), fPow, fPow, f9, 1.0f, fArr6, fCbrt, (float) Math.pow(fCbrt, 0.25d), fSqrt);
    }

    public npc1(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f156942f = f;
        this.f156937a = f2;
        this.f156938b = f3;
        this.f156939c = f4;
        this.f156940d = f5;
        this.f156941e = f6;
        this.f156943g = fArr;
        this.f156944h = f7;
        this.f156945i = f8;
        this.f156946j = f9;
    }
}

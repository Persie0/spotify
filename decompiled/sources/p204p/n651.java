package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class n651 implements k651 {

    /* JADX INFO: renamed from: a */
    public float f150702a;

    /* JADX INFO: renamed from: b */
    public float f150703b;

    /* JADX INFO: renamed from: c */
    public float f150704c;

    /* JADX INFO: renamed from: d */
    public float f150705d;

    /* JADX INFO: renamed from: e */
    public float f150706e;

    /* JADX INFO: renamed from: f */
    public float f150707f;

    /* JADX INFO: renamed from: g */
    public float f150708g;

    /* JADX INFO: renamed from: h */
    public float f150709h;

    /* JADX INFO: renamed from: i */
    public float f150710i;

    /* JADX INFO: renamed from: j */
    public int f150711j;

    /* JADX INFO: renamed from: k */
    public boolean f150712k;

    /* JADX INFO: renamed from: l */
    public float f150713l;

    /* JADX INFO: renamed from: m */
    public float f150714m;

    @Override // p204p.k651
    /* JADX INFO: renamed from: a */
    public final float mo55583a() {
        return this.f150712k ? -m63759c(this.f150714m) : m63759c(this.f150714m);
    }

    @Override // p204p.k651
    /* JADX INFO: renamed from: b */
    public final boolean mo55584b() {
        return mo55583a() < 1.0E-5f && Math.abs(this.f150710i - this.f150714m) < 1.0E-5f;
    }

    /* JADX INFO: renamed from: c */
    public final float m63759c(float f) {
        float f2;
        float f3;
        float f4 = this.f150705d;
        if (f <= f4) {
            f2 = this.f150702a;
            f3 = this.f150703b;
        } else {
            int i = this.f150711j;
            if (i == 1) {
                return 0.0f;
            }
            f -= f4;
            f4 = this.f150706e;
            if (f >= f4) {
                if (i == 2) {
                    return this.f150709h;
                }
                float f5 = f - f4;
                float f6 = this.f150707f;
                if (f5 >= f6) {
                    return this.f150710i;
                }
                float f7 = this.f150704c;
                return f7 - ((f5 * f7) / f6);
            }
            f2 = this.f150703b;
            f3 = this.f150704c;
        }
        return (((f3 - f2) * f) / f4) + f2;
    }

    /* JADX INFO: renamed from: d */
    public final void m63760d(float f, float f2, float f3, float f4, float f5) {
        if (f == 0.0f) {
            f = 1.0E-4f;
        }
        this.f150702a = f;
        float f6 = f / f3;
        float f7 = (f6 * f) / 2.0f;
        if (f < 0.0f) {
            float fSqrt = (float) Math.sqrt((f2 - ((((-f) / f3) * f) / 2.0f)) * f3);
            if (fSqrt < f4) {
                this.f150711j = 2;
                this.f150702a = f;
                this.f150703b = fSqrt;
                this.f150704c = 0.0f;
                float f8 = (fSqrt - f) / f3;
                this.f150705d = f8;
                this.f150706e = fSqrt / f3;
                this.f150708g = ((f + fSqrt) * f8) / 2.0f;
                this.f150709h = f2;
                this.f150710i = f2;
                return;
            }
            this.f150711j = 3;
            this.f150702a = f;
            this.f150703b = f4;
            this.f150704c = f4;
            float f9 = (f4 - f) / f3;
            this.f150705d = f9;
            float f10 = f4 / f3;
            this.f150707f = f10;
            float f11 = ((f + f4) * f9) / 2.0f;
            float f12 = (f10 * f4) / 2.0f;
            this.f150706e = ((f2 - f11) - f12) / f4;
            this.f150708g = f11;
            this.f150709h = f2 - f12;
            this.f150710i = f2;
            return;
        }
        if (f7 >= f2) {
            this.f150711j = 1;
            this.f150702a = f;
            this.f150703b = 0.0f;
            this.f150708g = f2;
            this.f150705d = (2.0f * f2) / f;
            return;
        }
        float f13 = f2 - f7;
        float f14 = f13 / f;
        if (f14 + f6 < f5) {
            this.f150711j = 2;
            this.f150702a = f;
            this.f150703b = f;
            this.f150704c = 0.0f;
            this.f150708g = f13;
            this.f150709h = f2;
            this.f150705d = f14;
            this.f150706e = f6;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f * f) / 2.0f) + (f3 * f2));
        float f15 = (fSqrt2 - f) / f3;
        this.f150705d = f15;
        float f16 = fSqrt2 / f3;
        this.f150706e = f16;
        if (fSqrt2 < f4) {
            this.f150711j = 2;
            this.f150702a = f;
            this.f150703b = fSqrt2;
            this.f150704c = 0.0f;
            this.f150705d = f15;
            this.f150706e = f16;
            this.f150708g = ((f + fSqrt2) * f15) / 2.0f;
            this.f150709h = f2;
            return;
        }
        this.f150711j = 3;
        this.f150702a = f;
        this.f150703b = f4;
        this.f150704c = f4;
        float f17 = (f4 - f) / f3;
        this.f150705d = f17;
        float f18 = f4 / f3;
        this.f150707f = f18;
        float f19 = ((f + f4) * f17) / 2.0f;
        float f20 = (f18 * f4) / 2.0f;
        this.f150706e = ((f2 - f19) - f20) / f4;
        this.f150708g = f19;
        this.f150709h = f2 - f20;
        this.f150710i = f2;
    }

    @Override // p204p.k651
    public final float getInterpolation(float f) {
        float f2;
        float f3 = this.f150705d;
        if (f <= f3) {
            float f4 = this.f150702a;
            f2 = ((((this.f150703b - f4) * f) * f) / (f3 * 2.0f)) + (f4 * f);
        } else {
            int i = this.f150711j;
            if (i == 1) {
                f2 = this.f150708g;
            } else {
                float f5 = f - f3;
                float f6 = this.f150706e;
                if (f5 < f6) {
                    float f7 = this.f150708g;
                    float f8 = this.f150703b;
                    f2 = ((((this.f150704c - f8) * f5) * f5) / (f6 * 2.0f)) + (f8 * f5) + f7;
                } else if (i == 2) {
                    f2 = this.f150709h;
                } else {
                    float f9 = f5 - f6;
                    float f10 = this.f150707f;
                    if (f9 <= f10) {
                        float f11 = this.f150709h;
                        float f12 = this.f150704c * f9;
                        f2 = (f11 + f12) - ((f12 * f9) / (f10 * 2.0f));
                    } else {
                        f2 = this.f150710i;
                    }
                }
            }
        }
        this.f150714m = f;
        return this.f150712k ? this.f150713l - f2 : this.f150713l + f2;
    }
}

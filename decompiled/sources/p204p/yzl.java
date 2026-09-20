package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class yzl implements bqs {

    /* JADX INFO: renamed from: a */
    public final float f277846a;

    /* JADX INFO: renamed from: b */
    public final float f277847b;

    /* JADX INFO: renamed from: c */
    public final float f277848c;

    /* JADX INFO: renamed from: d */
    public final float f277849d;

    /* JADX INFO: renamed from: e */
    public final float f277850e;

    /* JADX INFO: renamed from: f */
    public final float f277851f;

    public yzl(float f, float f2, float f3, float f4) {
        this.f277846a = f;
        this.f277847b = f2;
        this.f277848c = f3;
        this.f277849d = f4;
        if (Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) {
            nfq0.m64362a("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: " + f + ", " + f2 + ", " + f3 + ", " + f4 + '.');
        }
        long jM45497l = grg1.m45497l(f2, f4, new float[5]);
        this.f277850e = Float.intBitsToFloat((int) (jM45497l >> 32));
        this.f277851f = Float.intBitsToFloat((int) (jM45497l & 4294967295L));
    }

    @Override // p204p.bqs
    /* JADX INFO: renamed from: a */
    public final float mo30276a(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f2 = this.f277846a;
        float f3 = this.f277848c;
        float fM45500o = grg1.m45500o(0.0f - fMax, f2 - fMax, f3 - fMax, 1.0f - fMax);
        boolean zIsNaN = Float.isNaN(fM45500o);
        float f4 = this.f277849d;
        float f5 = this.f277847b;
        if (!zIsNaN) {
            float fM45499n = grg1.m45499n(f5, f4, fM45500o);
            float f6 = this.f277850e;
            if (fM45499n < f6) {
                fM45499n = f6;
            }
            float f7 = this.f277851f;
            return fM45499n > f7 ? f7 : fM45499n;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f2 + ", " + f5 + ", " + f3 + ", " + f4 + ") has no solution at " + f);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yzl)) {
            return false;
        }
        yzl yzlVar = (yzl) obj;
        return this.f277846a == yzlVar.f277846a && this.f277847b == yzlVar.f277847b && this.f277848c == yzlVar.f277848c && this.f277849d == yzlVar.f277849d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f277849d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f277846a) * 31, 31, this.f277847b), 31, this.f277848c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CubicBezierEasing(a=");
        sb.append(this.f277846a);
        sb.append(", b=");
        sb.append(this.f277847b);
        sb.append(", c=");
        sb.append(this.f277848c);
        sb.append(", d=");
        return ms2.m62684i(sb, this.f277849d, ')');
    }
}

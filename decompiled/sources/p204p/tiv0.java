package p204p;

import p000.AbstractC0000a;

/* JADX INFO: loaded from: classes.dex */
public final class tiv0 {

    /* JADX INFO: renamed from: e */
    public static final tiv0 f220750e = new tiv0(0.0f, 0.0f, 0.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f220751a;

    /* JADX INFO: renamed from: b */
    public final float f220752b;

    /* JADX INFO: renamed from: c */
    public final float f220753c;

    /* JADX INFO: renamed from: d */
    public final float f220754d;

    public tiv0(float f, float f2, float f3, float f4) {
        this.f220751a = f;
        this.f220752b = f2;
        this.f220753c = f3;
        this.f220754d = f4;
    }

    /* JADX INFO: renamed from: b */
    public static tiv0 m80929b(tiv0 tiv0Var, float f, float f2, float f3, int i) {
        if ((i & 1) != 0) {
            f = tiv0Var.f220751a;
        }
        if ((i & 2) != 0) {
            f2 = tiv0Var.f220752b;
        }
        if ((i & 4) != 0) {
            f3 = tiv0Var.f220753c;
        }
        float f4 = (i & 8) != 0 ? tiv0Var.f220754d : Float.POSITIVE_INFINITY;
        tiv0Var.getClass();
        return new tiv0(f, f2, f3, f4);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m80930a(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return (fIntBitsToFloat >= this.f220751a) & (fIntBitsToFloat < this.f220753c) & (fIntBitsToFloat2 >= this.f220752b) & (fIntBitsToFloat2 < this.f220754d);
    }

    /* JADX INFO: renamed from: c */
    public final long m80931c() {
        float f = this.f220753c;
        float f2 = this.f220751a;
        return (((long) Float.floatToRawIntBits(((f - f2) / 2.0f) + f2)) << 32) | (((long) Float.floatToRawIntBits(this.f220754d)) & 4294967295L);
    }

    /* JADX INFO: renamed from: d */
    public final long m80932d() {
        return (((long) Float.floatToRawIntBits(this.f220751a)) << 32) | (((long) Float.floatToRawIntBits(this.f220754d)) & 4294967295L);
    }

    /* JADX INFO: renamed from: e */
    public final long m80933e() {
        return (((long) Float.floatToRawIntBits(this.f220753c)) << 32) | (((long) Float.floatToRawIntBits(this.f220754d)) & 4294967295L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tiv0)) {
            return false;
        }
        tiv0 tiv0Var = (tiv0) obj;
        return Float.compare(this.f220751a, tiv0Var.f220751a) == 0 && Float.compare(this.f220752b, tiv0Var.f220752b) == 0 && Float.compare(this.f220753c, tiv0Var.f220753c) == 0 && Float.compare(this.f220754d, tiv0Var.f220754d) == 0;
    }

    /* JADX INFO: renamed from: f */
    public final long m80934f() {
        float f = this.f220753c;
        float f2 = this.f220751a;
        float f3 = ((f - f2) / 2.0f) + f2;
        float f4 = this.f220754d;
        float f5 = this.f220752b;
        return (((long) Float.floatToRawIntBits(((f4 - f5) / 2.0f) + f5)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX INFO: renamed from: g */
    public final long m80935g() {
        float f = this.f220753c - this.f220751a;
        return (((long) Float.floatToRawIntBits(this.f220754d - this.f220752b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: h */
    public final long m80936h() {
        return (((long) Float.floatToRawIntBits(this.f220751a)) << 32) | (((long) Float.floatToRawIntBits(this.f220752b)) & 4294967295L);
    }

    public final int hashCode() {
        return Float.hashCode(this.f220754d) + AbstractC0000a.m8g(AbstractC0000a.m8g(Float.hashCode(this.f220751a) * 31, 31, this.f220752b), 31, this.f220753c);
    }

    /* JADX INFO: renamed from: i */
    public final tiv0 m80937i(tiv0 tiv0Var) {
        return new tiv0(Math.max(this.f220751a, tiv0Var.f220751a), Math.max(this.f220752b, tiv0Var.f220752b), Math.min(this.f220753c, tiv0Var.f220753c), Math.min(this.f220754d, tiv0Var.f220754d));
    }

    /* JADX INFO: renamed from: j */
    public final boolean m80938j() {
        return (this.f220751a >= this.f220753c) | (this.f220752b >= this.f220754d);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m80939k(tiv0 tiv0Var) {
        return (this.f220751a < tiv0Var.f220753c) & (tiv0Var.f220751a < this.f220753c) & (this.f220752b < tiv0Var.f220754d) & (tiv0Var.f220752b < this.f220754d);
    }

    /* JADX INFO: renamed from: l */
    public final tiv0 m80940l(float f, float f2) {
        return new tiv0(this.f220751a + f, this.f220752b + f2, this.f220753c + f, this.f220754d + f2);
    }

    /* JADX INFO: renamed from: m */
    public final tiv0 m80941m(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new tiv0(Float.intBitsToFloat(i) + this.f220751a, Float.intBitsToFloat(i2) + this.f220752b, Float.intBitsToFloat(i) + this.f220753c, Float.intBitsToFloat(i2) + this.f220754d);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + spg1.m78891A(this.f220751a) + ", " + spg1.m78891A(this.f220752b) + ", " + spg1.m78891A(this.f220753c) + ", " + spg1.m78891A(this.f220754d) + ')';
    }
}

package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class wdx0 extends z8f {

    /* JADX INFO: renamed from: r */
    public static final mjr0 f250362r;

    /* JADX INFO: renamed from: d */
    public final zsd1 f250363d;

    /* JADX INFO: renamed from: e */
    public final float f250364e;

    /* JADX INFO: renamed from: f */
    public final float f250365f;

    /* JADX INFO: renamed from: g */
    public final y491 f250366g;

    /* JADX INFO: renamed from: h */
    public final float[] f250367h;

    /* JADX INFO: renamed from: i */
    public final float[] f250368i;

    /* JADX INFO: renamed from: j */
    public final float[] f250369j;

    /* JADX INFO: renamed from: k */
    public final d2s f250370k;

    /* JADX INFO: renamed from: l */
    public final gnv0 f250371l;

    /* JADX INFO: renamed from: m */
    public final tdx0 f250372m;

    /* JADX INFO: renamed from: n */
    public final d2s f250373n;

    /* JADX INFO: renamed from: o */
    public final ono0 f250374o;

    /* JADX INFO: renamed from: p */
    public final tdx0 f250375p;

    /* JADX INFO: renamed from: q */
    public final boolean f250376q;

    static {
        new iq3(24);
        f250362r = new mjr0(1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wdx0(String str, float[] fArr, zsd1 zsd1Var, float[] fArr2, d2s d2sVar, d2s d2sVar2, float f, float f2, y491 y491Var, int i) {
        super(v7f.f238171a, i, str);
        int i2 = v7f.f238175e;
        ufg1.m83016r();
        this.f250363d = zsd1Var;
        this.f250364e = f;
        this.f250365f = f2;
        this.f250366g = y491Var;
        this.f250370k = d2sVar;
        this.f250371l = new gnv0(this, 26);
        this.f250372m = new tdx0(this, 1);
        this.f250373n = d2sVar2;
        this.f250374o = new ono0(this, 14);
        this.f250375p = new tdx0(this, 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f >= f2) {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
        float[] fArrM51328l = iq3.m51328l(fArr);
        this.f250367h = fArrM51328l;
        if (fArr2 == null) {
            this.f250368i = iq3.m51319c(fArrM51328l, zsd1Var);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.f250368i = fArr2;
        }
        this.f250369j = fgg1.m41606u(this.f250368i);
        iq3.m51324h(f, f2, fArrM51328l);
        this.f250376q = iq3.m51323g(fArrM51328l, zsd1Var, d2sVar, d2sVar2, f, f2, i);
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: a */
    public final float mo25696a(int i) {
        return this.f250365f;
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: b */
    public final float mo25697b(int i) {
        return this.f250364e;
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: c */
    public final boolean mo87851c() {
        return this.f250376q;
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: d */
    public final long mo25698d(float f, float f2, float f3) {
        double d = f;
        tdx0 tdx0Var = this.f250375p;
        float fMo34792b = (float) tdx0Var.mo34792b(d);
        float fMo34792b2 = (float) tdx0Var.mo34792b(f2);
        float fMo34792b3 = (float) tdx0Var.mo34792b(f3);
        float[] fArr = this.f250368i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fMo34792b3) + (fArr[3] * fMo34792b2) + (fArr[0] * fMo34792b);
        return (((long) Float.floatToRawIntBits((fArr[7] * fMo34792b3) + (fArr[4] * fMo34792b2) + (fArr[1] * fMo34792b))) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: e */
    public final float mo25699e(float f, float f2, float f3) {
        double d = f;
        tdx0 tdx0Var = this.f250375p;
        float fMo34792b = (float) tdx0Var.mo34792b(d);
        float fMo34792b2 = (float) tdx0Var.mo34792b(f2);
        float fMo34792b3 = (float) tdx0Var.mo34792b(f3);
        float[] fArr = this.f250368i;
        return (fArr[8] * fMo34792b3) + (fArr[5] * fMo34792b2) + (fArr[2] * fMo34792b);
    }

    @Override // p204p.z8f
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wdx0.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        wdx0 wdx0Var = (wdx0) obj;
        y491 y491Var = wdx0Var.f250366g;
        if (Float.compare(wdx0Var.f250364e, this.f250364e) != 0 || Float.compare(wdx0Var.f250365f, this.f250365f) != 0 || !wj50.m88271j(this.f250363d, wdx0Var.f250363d) || !Arrays.equals(this.f250367h, wdx0Var.f250367h)) {
            return false;
        }
        y491 y491Var2 = this.f250366g;
        if (y491Var2 != null) {
            return wj50.m88271j(y491Var2, y491Var);
        }
        if (y491Var == null) {
            return true;
        }
        if (wj50.m88271j(this.f250370k, wdx0Var.f250370k)) {
            return wj50.m88271j(this.f250373n, wdx0Var.f250373n);
        }
        return false;
    }

    @Override // p204p.z8f
    /* JADX INFO: renamed from: f */
    public final long mo25700f(float f, float f2, float f3, float f4, z8f z8fVar) {
        float[] fArr = this.f250369j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        tdx0 tdx0Var = this.f250372m;
        return rfg1.m75431a((float) tdx0Var.mo34792b(f5), (float) tdx0Var.mo34792b(f6), (float) tdx0Var.mo34792b(f7), f4, z8fVar);
    }

    @Override // p204p.z8f
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.f250367h) + ((this.f250363d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.f250364e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f250365f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        y491 y491Var = this.f250366g;
        int iHashCode2 = iFloatToIntBits2 + (y491Var != null ? y491Var.hashCode() : 0);
        if (y491Var == null) {
            return this.f250373n.hashCode() + ((this.f250370k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    public wdx0(String str, float[] fArr, zsd1 zsd1Var, y491 y491Var, int i) {
        this(str, fArr, zsd1Var, null, iq3.m51321e(y491Var), iq3.m51320d(y491Var), 0.0f, 1.0f, y491Var, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public wdx0(String str, float[] fArr, zsd1 zsd1Var, final double d, float f, float f2, int i) {
        d2s d2sVar;
        d2s d2sVar2 = f250362r;
        if (d == 1.0d) {
            d2sVar = d2sVar2;
        } else {
            final int i2 = 0;
            d2sVar = new d2s() { // from class: p.udx0
                @Override // p204p.d2s
                /* JADX INFO: renamed from: b */
                public final double mo34792b(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            d2sVar2 = new d2s() { // from class: p.udx0
                @Override // p204p.d2s
                /* JADX INFO: renamed from: b */
                public final double mo34792b(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        d2s d2sVar3 = d2sVar2;
        this(str, fArr, zsd1Var, null, d2sVar, d2sVar3, f, f2, new y491(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}

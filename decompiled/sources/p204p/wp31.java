package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wp31 {

    /* JADX INFO: renamed from: a */
    public final int f253649a;

    /* JADX INFO: renamed from: b */
    public final int f253650b;

    /* JADX INFO: renamed from: c */
    public final float f253651c;

    /* JADX INFO: renamed from: d */
    public final float f253652d;

    /* JADX INFO: renamed from: e */
    public final float f253653e;

    /* JADX INFO: renamed from: f */
    public final int f253654f;

    /* JADX INFO: renamed from: g */
    public final int f253655g;

    /* JADX INFO: renamed from: h */
    public final int f253656h;

    /* JADX INFO: renamed from: i */
    public final vp31 f253657i;

    /* JADX INFO: renamed from: j */
    public int f253658j;

    /* JADX INFO: renamed from: k */
    public int f253659k;

    /* JADX INFO: renamed from: l */
    public int f253660l;

    /* JADX INFO: renamed from: m */
    public int f253661m;

    /* JADX INFO: renamed from: n */
    public int f253662n;

    /* JADX INFO: renamed from: o */
    public int f253663o;

    /* JADX INFO: renamed from: p */
    public int f253664p;

    /* JADX INFO: renamed from: q */
    public double f253665q;

    public wp31(int i, int i2, float f, float f2, int i3, boolean z) {
        this.f253649a = i;
        this.f253650b = i2;
        this.f253651c = f;
        this.f253652d = f2;
        this.f253653e = i / i3;
        this.f253654f = i / 400;
        int i4 = i / 65;
        this.f253655g = i4;
        this.f253656h = i4 * 2;
        this.f253657i = z ? new up31(this) : new pd11(this);
    }

    /* JADX INFO: renamed from: a */
    public final void m88674a(int i, int i2) {
        vp31 vp31Var = this.f253657i;
        vp31Var.mo69615e(i2);
        Object objMo69614d = vp31Var.mo69614d();
        int i3 = this.f253650b;
        System.arraycopy(objMo69614d, i * i3, vp31Var.mo69622l(), this.f253659k * i3, i3 * i2);
        this.f253659k += i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final void m88675b() {
        float f;
        int iMo69619i;
        double d;
        int i;
        int i2;
        int i3;
        int iRound;
        int i4;
        int i5;
        long j;
        long j2;
        int i6 = this.f253659k;
        float f2 = this.f253651c;
        float f3 = this.f253652d;
        double d2 = f2 / f3;
        float f4 = this.f253653e * f3;
        int i7 = this.f253649a;
        int i8 = 1;
        vp31 vp31Var = this.f253657i;
        int i9 = this.f253650b;
        if (d2 > 1.0000100135803223d || d2 < 0.9999899864196777d) {
            int i10 = this.f253658j;
            int i11 = this.f253656h;
            if (i10 >= i11) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f253663o;
                    if (i13 > 0) {
                        int iMin = Math.min(i11, i13);
                        m88674a(i12, iMin);
                        this.f253663o -= iMin;
                        i12 += iMin;
                        f = f4;
                        d = d2;
                        i3 = i8;
                        i = i11;
                    } else {
                        int i14 = i7 > 4000 ? i7 / 4000 : i8;
                        int i15 = this.f253655g;
                        int i16 = this.f253654f;
                        if (i9 == i8 && i14 == i8) {
                            iMo69619i = vp31Var.mo69613c(i12, i16, i15);
                            f = f4;
                        } else {
                            vp31Var.mo69612b(i12, i14);
                            f = f4;
                            int iMo69619i2 = vp31Var.mo69619i(i16 / i14, i15 / i14);
                            if (i14 != i8) {
                                int i17 = iMo69619i2 * i14;
                                int i18 = i14 * 4;
                                int i19 = i17 - i18;
                                int i20 = i17 + i18;
                                if (i19 >= i16) {
                                    i16 = i19;
                                }
                                if (i20 <= i15) {
                                    i15 = i20;
                                }
                                if (i9 == i8) {
                                    iMo69619i = vp31Var.mo69613c(i12, i16, i15);
                                } else {
                                    vp31Var.mo69612b(i12, i8);
                                    iMo69619i = vp31Var.mo69619i(i16, i15);
                                }
                            } else {
                                iMo69619i = iMo69619i2;
                            }
                        }
                        int i21 = vp31Var.mo69616f() ? this.f253664p : iMo69619i;
                        vp31Var.mo69621k();
                        this.f253664p = iMo69619i;
                        if (d2 > 1.0d) {
                            if (d2 >= 2.0d) {
                                double d3 = (((double) i21) / (d2 - 1.0d)) + this.f253665q;
                                iRound = (int) Math.round(d3);
                                d = d2;
                                this.f253665q = d3 - ((double) iRound);
                                vp31Var = vp31Var;
                            } else {
                                d = d2;
                                double d4 = (((2.0d - d) * ((double) i21)) / (d - 1.0d)) + this.f253665q;
                                int iRound2 = (int) Math.round(d4);
                                this.f253663o = iRound2;
                                this.f253665q = d4 - ((double) iRound2);
                                iRound = i21;
                            }
                            vp31Var.mo69615e(iRound);
                            int i22 = i11;
                            int i23 = iRound;
                            vp31Var.mo69617g(i23, this.f253650b, this.f253659k, i12, i12 + i21);
                            this.f253659k += i23;
                            i12 = i21 + i23 + i12;
                            i = i22;
                            i3 = i8;
                        } else {
                            d = d2;
                            int i24 = i8;
                            i = i11;
                            if (d < 0.5d) {
                                double d5 = ((((double) i21) * d) / (1.0d - d)) + this.f253665q;
                                int iRound3 = (int) Math.round(d5);
                                this.f253665q = d5 - ((double) iRound3);
                                i2 = iRound3;
                            } else {
                                double d6 = ((((d * 2.0d) - 1.0d) * ((double) i21)) / (1.0d - d)) + this.f253665q;
                                int iRound4 = (int) Math.round(d6);
                                this.f253663o = iRound4;
                                this.f253665q = d6 - ((double) iRound4);
                                i2 = i21;
                            }
                            int i25 = i21 + i2;
                            vp31Var.mo69615e(i25);
                            i3 = i24;
                            System.arraycopy(vp31Var.mo69614d(), i12 * i9, vp31Var.mo69622l(), this.f253659k * i9, i21 * i9);
                            int i26 = i12;
                            vp31Var.mo69617g(i2, this.f253650b, this.f253659k + i21, i21 + i12, i26);
                            this.f253659k += i25;
                            i12 = i26 + i2;
                        }
                    }
                    if (i12 + i > i10) {
                        break;
                    }
                    i11 = i;
                    f4 = f;
                    i8 = i3;
                    d2 = d;
                }
                int i27 = this.f253658j - i12;
                System.arraycopy(vp31Var.mo69614d(), i12 * i9, vp31Var.mo69614d(), 0, i27 * i9);
                this.f253658j = i27;
            }
            if (f != 1.0f || this.f253659k == i6) {
            }
            long j3 = (long) (i7 / f);
            long j4 = i7;
            while (j3 != 0 && j4 != 0 && j3 % 2 == 0 && j4 % 2 == 0) {
                j3 /= 2;
                j4 /= 2;
            }
            int i28 = this.f253659k - i6;
            vp31Var.mo69625o(i28);
            System.arraycopy(vp31Var.mo69622l(), i6 * i9, vp31Var.mo69623m(), this.f253660l * i9, i28 * i9);
            this.f253659k = i6;
            this.f253660l += i28;
            int i29 = 0;
            while (true) {
                i4 = this.f253660l - 1;
                if (i29 >= i4) {
                    break;
                }
                while (true) {
                    i5 = this.f253661m + 1;
                    j = i5;
                    long j5 = j * j3;
                    j2 = this.f253662n;
                    if (j5 <= j2 * j4) {
                        break;
                    }
                    int i30 = i3;
                    vp31Var.mo69615e(i30);
                    vp31Var.mo69620j(i29, j4, j3);
                    this.f253662n += i30;
                    this.f253659k += i30;
                }
                int i31 = i3;
                this.f253661m = i5;
                if (j == j4) {
                    this.f253661m = 0;
                    c95.m31855u(j2 == j3 ? i31 : 0);
                    this.f253662n = 0;
                }
                i29++;
                i3 = i31;
            }
            if (i4 == 0) {
                return;
            }
            System.arraycopy(vp31Var.mo69623m(), i4 * i9, vp31Var.mo69623m(), 0, (this.f253660l - i4) * i9);
            this.f253660l -= i4;
            return;
        }
        m88674a(0, this.f253658j);
        this.f253658j = 0;
        f = f4;
        i3 = 1;
        if (f != 1.0f) {
        }
    }
}

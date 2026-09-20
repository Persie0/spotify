package p204p;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class ii5 extends hkf1 {

    /* JADX INFO: renamed from: g */
    public final double[] f102447g;

    /* JADX INFO: renamed from: h */
    public final hi5[] f102448h;

    /* JADX WARN: Code duplicated, block: B:20:0x0037  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.ii5] */
    public ii5(int[] iArr, double[] dArr, double[][] dArr2) {
        boolean z;
        int i;
        double[] dArr3;
        double d;
        double[] dArr4 = dArr;
        ?? obj = new Object();
        obj.f102447g = dArr4;
        int i2 = 1;
        obj.f102448h = new hi5[dArr4.length - 1];
        char c = 0;
        int i3 = 0;
        int i4 = 1;
        int i5 = 1;
        ii5 ii5Var = obj;
        while (true) {
            hi5[] hi5VarArr = ii5Var.f102448h;
            if (i3 >= hi5VarArr.length) {
                return;
            }
            int i6 = iArr[i3];
            if (i6 == 0) {
                i5 = 3;
            } else if (i6 == i2) {
                i4 = i2;
                i5 = i4;
            } else {
                if (i6 != 2) {
                    if (i6 == 3) {
                        if (i4 != i2) {
                            i4 = i2;
                        }
                        i5 = i4;
                    } else if (i6 == 4) {
                        i5 = 4;
                    } else if (i6 == 5) {
                        i5 = 5;
                    }
                }
                i4 = 2;
                i5 = i4;
            }
            double d2 = dArr4[i3];
            int i7 = i3 + 1;
            double d3 = dArr4[i7];
            double[] dArr5 = dArr2[i3];
            double d4 = dArr5[c];
            int i8 = i2;
            int i9 = i3;
            double d5 = dArr5[i8];
            double[] dArr6 = dArr2[i7];
            boolean z2 = c;
            double d6 = dArr6[z2 ? 1 : 0];
            double d7 = dArr6[i8];
            hi5 hi5Var = new hi5();
            hi5Var.f91719r = z2;
            int i10 = i4;
            double d8 = d6 - d4;
            double d9 = d7 - d5;
            boolean z3 = i8;
            if (i5 != z3) {
                if (i5 == 4) {
                    hi5Var.f91718q = d9 > 0.0d;
                } else if (i5 != 5) {
                    hi5Var.f91718q = false;
                } else {
                    hi5Var.f91718q = d9 < 0.0d;
                }
                z = true;
            } else {
                hi5Var.f91718q = z3;
                z = z3;
            }
            hi5Var.f91704c = r16;
            hi5Var.f91705d = d3;
            double d10 = d3 - d2;
            double d11 = 1.0d / d10;
            hi5Var.f91710i = d11;
            if (3 == i5) {
                hi5Var.f91719r = z;
            }
            if (hi5Var.f91719r || Math.abs(d8) < 0.001d || Math.abs(d9) < 0.001d) {
                i = 1;
                hi5Var.f91719r = true;
                hi5Var.f91706e = d4;
                hi5Var.f91707f = d6;
                hi5Var.f91708g = d5;
                hi5Var.f91709h = d7;
                double dHypot = Math.hypot(d9, d8);
                hi5Var.f91703b = dHypot;
                hi5Var.f91715n = dHypot * d11;
                hi5Var.f91713l = d8 / d10;
                hi5Var.f91714m = d9 / d10;
            } else {
                double[] dArr7 = new double[101];
                hi5Var.f91702a = dArr7;
                boolean z4 = hi5Var.f91718q;
                hi5Var.f91711j = ((double) (z4 ? -1 : 1)) * d8;
                hi5Var.f91712k = ((double) (z4 ? 1 : -1)) * d9;
                hi5Var.f91713l = z4 ? d6 : d4;
                hi5Var.f91714m = z4 ? d5 : d7;
                double d12 = d5 - d7;
                double dHypot2 = 0.0d;
                double d13 = 0.0d;
                double d14 = 0.0d;
                int i11 = 0;
                while (true) {
                    dArr3 = hi5.f91701s;
                    if (i11 >= 91) {
                        break;
                    }
                    double[] dArr8 = dArr7;
                    double d15 = d12;
                    double radians = Math.toRadians((((double) i11) * 90.0d) / ((double) 90));
                    double dSin = d8 * Math.sin(radians);
                    double dCos = Math.cos(radians) * d15;
                    if (i11 > 0) {
                        d = dCos;
                        dHypot2 += Math.hypot(dSin - d13, d - d14);
                        dArr3[i11] = dHypot2;
                    } else {
                        d = dCos;
                    }
                    i11++;
                    d13 = dSin;
                    d12 = d15;
                    d14 = d;
                    dArr7 = dArr8;
                }
                double[] dArr9 = dArr7;
                hi5Var.f91703b = dHypot2;
                for (int i12 = 0; i12 < 91; i12++) {
                    dArr3[i12] = dArr3[i12] / dHypot2;
                }
                for (int i13 = 0; i13 < 101; i13++) {
                    double d16 = ((double) i13) / ((double) 100);
                    int iBinarySearch = Arrays.binarySearch(dArr3, d16);
                    if (iBinarySearch >= 0) {
                        dArr9[i13] = ((double) iBinarySearch) / ((double) 90);
                    } else if (iBinarySearch == -1) {
                        dArr9[i13] = 0.0d;
                    } else {
                        int i14 = -iBinarySearch;
                        int i15 = i14 - 2;
                        double d17 = dArr3[i15];
                        dArr9[i13] = (((d16 - d17) / (dArr3[i14 - 1] - d17)) + ((double) i15)) / ((double) 90);
                    }
                }
                hi5Var.f91715n = hi5Var.f91703b * hi5Var.f91710i;
                i = 1;
            }
            hi5VarArr[i9] = hi5Var;
            ii5Var = this;
            dArr4 = dArr;
            i2 = i;
            i3 = i7;
            i4 = i10;
            c = 0;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: q */
    public final double mo25150q(double d) {
        hi5[] hi5VarArr = this.f102448h;
        hi5 hi5Var = hi5VarArr[0];
        double d2 = hi5Var.f91704c;
        if (d < d2) {
            double d3 = d - d2;
            if (hi5Var.f91719r) {
                return (d3 * hi5VarArr[0].f91713l) + hi5Var.m47622c(d2);
            }
            hi5Var.m47626g(d2);
            return (hi5VarArr[0].m47620a() * d3) + hi5VarArr[0].m47624e();
        }
        if (d > hi5VarArr[hi5VarArr.length - 1].f91705d) {
            double d4 = hi5VarArr[hi5VarArr.length - 1].f91705d;
            double d5 = d - d4;
            int length = hi5VarArr.length - 1;
            return (d5 * hi5VarArr[length].f91713l) + hi5VarArr[length].m47622c(d4);
        }
        for (int i = 0; i < hi5VarArr.length; i++) {
            hi5 hi5Var2 = hi5VarArr[i];
            if (d <= hi5Var2.f91705d) {
                if (hi5Var2.f91719r) {
                    return hi5Var2.m47622c(d);
                }
                hi5Var2.m47626g(d);
                return hi5VarArr[i].m47624e();
            }
        }
        return Double.NaN;
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: r */
    public final void mo25151r(double d, double[] dArr) {
        hi5[] hi5VarArr = this.f102448h;
        hi5 hi5Var = hi5VarArr[0];
        double d2 = hi5Var.f91704c;
        if (d < d2) {
            double d3 = d - d2;
            if (hi5Var.f91719r) {
                double dM47622c = hi5Var.m47622c(d2);
                hi5 hi5Var2 = hi5VarArr[0];
                dArr[0] = (hi5Var2.f91713l * d3) + dM47622c;
                dArr[1] = (d3 * hi5VarArr[0].f91714m) + hi5Var2.m47623d(d2);
                return;
            }
            hi5Var.m47626g(d2);
            dArr[0] = (hi5VarArr[0].m47620a() * d3) + hi5VarArr[0].m47624e();
            dArr[1] = (hi5VarArr[0].m47621b() * d3) + hi5VarArr[0].m47625f();
            return;
        }
        if (d <= hi5VarArr[hi5VarArr.length - 1].f91705d) {
            for (int i = 0; i < hi5VarArr.length; i++) {
                hi5 hi5Var3 = hi5VarArr[i];
                if (d <= hi5Var3.f91705d) {
                    if (hi5Var3.f91719r) {
                        dArr[0] = hi5Var3.m47622c(d);
                        dArr[1] = hi5VarArr[i].m47623d(d);
                        return;
                    } else {
                        hi5Var3.m47626g(d);
                        dArr[0] = hi5VarArr[i].m47624e();
                        dArr[1] = hi5VarArr[i].m47625f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = hi5VarArr[hi5VarArr.length - 1].f91705d;
        double d5 = d - d4;
        int length = hi5VarArr.length - 1;
        hi5 hi5Var4 = hi5VarArr[length];
        if (hi5Var4.f91719r) {
            double dM47622c2 = hi5Var4.m47622c(d4);
            hi5 hi5Var5 = hi5VarArr[length];
            dArr[0] = (hi5Var5.f91713l * d5) + dM47622c2;
            dArr[1] = (d5 * hi5VarArr[length].f91714m) + hi5Var5.m47623d(d4);
            return;
        }
        hi5Var4.m47626g(d);
        dArr[0] = (hi5VarArr[length].m47620a() * d5) + hi5VarArr[length].m47624e();
        dArr[1] = (hi5VarArr[length].m47621b() * d5) + hi5VarArr[length].m47625f();
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: s */
    public final void mo25152s(double d, float[] fArr) {
        hi5[] hi5VarArr = this.f102448h;
        hi5 hi5Var = hi5VarArr[0];
        double d2 = hi5Var.f91704c;
        if (d < d2) {
            double d3 = d - d2;
            if (hi5Var.f91719r) {
                double dM47622c = hi5Var.m47622c(d2);
                hi5 hi5Var2 = hi5VarArr[0];
                fArr[0] = (float) ((hi5Var2.f91713l * d3) + dM47622c);
                fArr[1] = (float) ((d3 * hi5VarArr[0].f91714m) + hi5Var2.m47623d(d2));
                return;
            }
            hi5Var.m47626g(d2);
            fArr[0] = (float) ((hi5VarArr[0].m47620a() * d3) + hi5VarArr[0].m47624e());
            fArr[1] = (float) ((hi5VarArr[0].m47621b() * d3) + hi5VarArr[0].m47625f());
            return;
        }
        if (d <= hi5VarArr[hi5VarArr.length - 1].f91705d) {
            for (int i = 0; i < hi5VarArr.length; i++) {
                hi5 hi5Var3 = hi5VarArr[i];
                if (d <= hi5Var3.f91705d) {
                    if (hi5Var3.f91719r) {
                        fArr[0] = (float) hi5Var3.m47622c(d);
                        fArr[1] = (float) hi5VarArr[i].m47623d(d);
                        return;
                    } else {
                        hi5Var3.m47626g(d);
                        fArr[0] = (float) hi5VarArr[i].m47624e();
                        fArr[1] = (float) hi5VarArr[i].m47625f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = hi5VarArr[hi5VarArr.length - 1].f91705d;
        double d5 = d - d4;
        int length = hi5VarArr.length - 1;
        hi5 hi5Var4 = hi5VarArr[length];
        if (!hi5Var4.f91719r) {
            hi5Var4.m47626g(d);
            fArr[0] = (float) hi5VarArr[length].m47624e();
            fArr[1] = (float) hi5VarArr[length].m47625f();
        } else {
            double dM47622c2 = hi5Var4.m47622c(d4);
            hi5 hi5Var5 = hi5VarArr[length];
            fArr[0] = (float) ((hi5Var5.f91713l * d5) + dM47622c2);
            fArr[1] = (float) ((d5 * hi5VarArr[length].f91714m) + hi5Var5.m47623d(d4));
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: t */
    public final void mo25153t(double d, double[] dArr) {
        hi5[] hi5VarArr = this.f102448h;
        double d2 = hi5VarArr[0].f91704c;
        if (d < d2) {
            d = d2;
        } else if (d > hi5VarArr[hi5VarArr.length - 1].f91705d) {
            d = hi5VarArr[hi5VarArr.length - 1].f91705d;
        }
        for (int i = 0; i < hi5VarArr.length; i++) {
            hi5 hi5Var = hi5VarArr[i];
            if (d <= hi5Var.f91705d) {
                if (hi5Var.f91719r) {
                    dArr[0] = hi5Var.f91713l;
                    dArr[1] = hi5Var.f91714m;
                    return;
                } else {
                    hi5Var.m47626g(d);
                    dArr[0] = hi5VarArr[i].m47620a();
                    dArr[1] = hi5VarArr[i].m47621b();
                    return;
                }
            }
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: u */
    public final double[] mo25154u() {
        return this.f102447g;
    }
}

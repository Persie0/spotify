package p204p;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public final class byh0 extends hkf1 {

    /* JADX INFO: renamed from: g */
    public final double[] f32236g;

    /* JADX INFO: renamed from: h */
    public final double[][] f32237h;

    /* JADX INFO: renamed from: i */
    public final double[][] f32238i;

    /* JADX INFO: renamed from: j */
    public final double[] f32239j;

    public byh0(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f32239j = new double[length2];
        int i = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i2 = 0; i2 < length2; i2++) {
            int i3 = 0;
            while (i3 < i) {
                int i4 = i3 + 1;
                double d = dArr[i4] - dArr[i3];
                double[] dArr5 = dArr3[i3];
                double d2 = (dArr2[i4][i2] - dArr2[i3][i2]) / d;
                dArr5[i2] = d2;
                if (i3 == 0) {
                    dArr4[i3][i2] = d2;
                } else {
                    dArr4[i3][i2] = (dArr3[i3 - 1][i2] + d2) * 0.5d;
                }
                i3 = i4;
            }
            dArr4[i][i2] = dArr3[length - 2][i2];
        }
        for (int i5 = 0; i5 < i; i5++) {
            for (int i6 = 0; i6 < length2; i6++) {
                double d3 = dArr3[i5][i6];
                if (d3 == 0.0d) {
                    dArr4[i5][i6] = 0.0d;
                    dArr4[i5 + 1][i6] = 0.0d;
                } else {
                    double d4 = dArr4[i5][i6] / d3;
                    int i7 = i5 + 1;
                    double d5 = dArr4[i7][i6] / d3;
                    double dHypot = Math.hypot(d4, d5);
                    if (dHypot > 9.0d) {
                        double d6 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i5];
                        double[] dArr7 = dArr3[i5];
                        dArr6[i6] = d4 * d6 * dArr7[i6];
                        dArr4[i7][i6] = d6 * d5 * dArr7[i6];
                    }
                }
            }
        }
        this.f32236g = dArr;
        this.f32237h = dArr2;
        this.f32238i = dArr4;
    }

    /* JADX INFO: renamed from: J */
    public static double m30891J(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d2 * 6.0d;
        double d9 = 6.0d * d7 * d3;
        double d10 = (d9 + ((d8 * d4) + (((-6.0d) * d7) * d4))) - (d8 * d3);
        double d11 = 3.0d * d;
        return (d * d5) + (((((d11 * d5) * d7) + (((d11 * d6) * d7) + d10)) - (((2.0d * d) * d6) * d2)) - (((4.0d * d) * d5) * d2));
    }

    /* JADX INFO: renamed from: L */
    public static double m30892L(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d2 * d2;
        double d8 = d7 * d2;
        double d9 = 3.0d * d7;
        double d10 = d8 * 2.0d * d3;
        double d11 = ((d10 + ((d9 * d4) + (((-2.0d) * d8) * d4))) - (d9 * d3)) + d3;
        double d12 = d * d6;
        double d13 = (d12 * d8) + d11;
        double d14 = d * d5;
        return (d14 * d2) + ((((d8 * d14) + d13) - (d12 * d7)) - (((d * 2.0d) * d5) * d7));
    }

    /* JADX INFO: renamed from: K */
    public final double m30893K(double d) {
        double[] dArr = this.f32236g;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d >= d2) {
            d2 = dArr[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d2 <= d3) {
                double d4 = dArr[i];
                double d5 = d3 - d4;
                double[][] dArr2 = this.f32237h;
                double d6 = dArr2[i][0];
                double d7 = dArr2[i2][0];
                double[][] dArr3 = this.f32238i;
                return m30891J(d5, (d2 - d4) / d5, d6, d7, dArr3[i][0], dArr3[i2][0]) / d5;
            }
            i = i2;
        }
        return 0.0d;
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: q */
    public final double mo25150q(double d) {
        double d2;
        double d3;
        double dM30893K;
        double[] dArr = this.f32236g;
        int length = dArr.length;
        double d4 = dArr[0];
        double[][] dArr2 = this.f32237h;
        if (d <= d4) {
            d2 = dArr2[0][0];
            d3 = d - d4;
            dM30893K = m30893K(d4);
        } else {
            int i = length - 1;
            double d5 = dArr[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr[i2];
                    if (d == d6) {
                        return dArr2[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr[i3];
                    if (d < d7) {
                        double d8 = d7 - d6;
                        double d9 = (d - d6) / d8;
                        double d10 = dArr2[i2][0];
                        double d11 = dArr2[i3][0];
                        double[][] dArr3 = this.f32238i;
                        return m30892L(d8, d9, d10, d11, dArr3[i2][0], dArr3[i3][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr2[i][0];
            d3 = d - d5;
            dM30893K = m30893K(d5);
        }
        return (dM30893K * d3) + d2;
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: r */
    public final void mo25151r(double d, double[] dArr) {
        double[] dArr2 = this.f32236g;
        int length = dArr2.length;
        double[][] dArr3 = this.f32237h;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        double[] dArr4 = this.f32239j;
        if (d <= d2) {
            mo25153t(d2, dArr4);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr2[0]) * dArr4[i2]) + dArr3[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            mo25153t(d3, dArr4);
            while (i < length2) {
                dArr[i] = ((d - dArr2[i3]) * dArr4[i]) + dArr3[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double d8 = dArr3[i4][i];
                    double d9 = dArr3[i6][i];
                    double[][] dArr5 = this.f32238i;
                    dArr[i] = m30892L(d6, d7, d8, d9, dArr5[i4][i], dArr5[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: s */
    public final void mo25152s(double d, float[] fArr) {
        double[] dArr = this.f32236g;
        int length = dArr.length;
        double[][] dArr2 = this.f32237h;
        int i = 0;
        int length2 = dArr2[0].length;
        double d2 = dArr[0];
        double[] dArr3 = this.f32239j;
        if (d <= d2) {
            mo25153t(d2, dArr3);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr[0]) * dArr3[i2]) + dArr2[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr[i3];
        if (d >= d3) {
            mo25153t(d3, dArr3);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr[i3]) * dArr3[i]) + dArr2[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr2[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr[i6];
            if (d < d4) {
                double d5 = dArr[i4];
                double d6 = d4 - d5;
                double d7 = (d - d5) / d6;
                while (i < length2) {
                    double d8 = dArr2[i4][i];
                    double d9 = dArr2[i6][i];
                    double[][] dArr4 = this.f32238i;
                    fArr[i] = (float) m30892L(d6, d7, d8, d9, dArr4[i4][i], dArr4[i6][i]);
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: t */
    public final void mo25153t(double d, double[] dArr) {
        double[] dArr2 = this.f32236g;
        int length = dArr2.length;
        double[][] dArr3 = this.f32237h;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d > d2) {
            d2 = dArr2[length - 1];
            if (d < d2) {
                d2 = d;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d2 <= d3) {
                double d4 = dArr2[i];
                double d5 = d3 - d4;
                double d6 = (d2 - d4) / d5;
                for (int i3 = 0; i3 < length2; i3++) {
                    double d7 = dArr3[i][i3];
                    double d8 = dArr3[i2][i3];
                    double[][] dArr4 = this.f32238i;
                    dArr[i3] = m30891J(d5, d6, d7, d8, dArr4[i][i3], dArr4[i2][i3]) / d5;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: u */
    public final double[] mo25154u() {
        return this.f32236g;
    }
}

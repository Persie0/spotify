package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class uk80 extends hkf1 {

    /* JADX INFO: renamed from: g */
    public double[] f231257g;

    /* JADX INFO: renamed from: h */
    public double[][] f231258h;

    /* JADX INFO: renamed from: i */
    public double[] f231259i;

    /* JADX WARN: Code duplicated, block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v6 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: J */
    public final double m83316J(double d) {
        double[] dArr = this.f231257g;
        int length = dArr.length;
        double d2 = dArr[0];
        if (d < d2) {
            d = d2;
        } else {
            d2 = dArr[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr[i2];
            if (d <= d3) {
                double d4 = d3 - dArr[i];
                double[][] dArr2 = this.f231258h;
                return (dArr2[i2][0] - dArr2[i][0]) / d4;
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
        double dM83316J;
        double[][] dArr = this.f231258h;
        double[] dArr2 = this.f231257g;
        int length = dArr2.length;
        double d4 = dArr2[0];
        if (d <= d4) {
            d2 = dArr[0][0];
            d3 = d - d4;
            dM83316J = m83316J(d4);
        } else {
            int i = length - 1;
            double d5 = dArr2[i];
            if (d < d5) {
                int i2 = 0;
                while (i2 < i) {
                    double d6 = dArr2[i2];
                    if (d == d6) {
                        return dArr[i2][0];
                    }
                    int i3 = i2 + 1;
                    double d7 = dArr2[i3];
                    if (d < d7) {
                        double d8 = (d - d6) / (d7 - d6);
                        return (dArr[i3][0] * d8) + ((1.0d - d8) * dArr[i2][0]);
                    }
                    i2 = i3;
                }
                return 0.0d;
            }
            d2 = dArr[i][0];
            d3 = d - d5;
            dM83316J = m83316J(d5);
        }
        return (dM83316J * d3) + d2;
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: r */
    public final void mo25151r(double d, double[] dArr) {
        double[] dArr2 = this.f231259i;
        double[] dArr3 = this.f231257g;
        int length = dArr3.length;
        double[][] dArr4 = this.f231258h;
        int i = 0;
        int length2 = dArr4[0].length;
        double d2 = dArr3[0];
        if (d <= d2) {
            mo25153t(d2, dArr2);
            for (int i2 = 0; i2 < length2; i2++) {
                dArr[i2] = ((d - dArr3[0]) * dArr2[i2]) + dArr4[0][i2];
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr3[i3];
        if (d >= d3) {
            mo25153t(d3, dArr2);
            while (i < length2) {
                dArr[i] = ((d - dArr3[i3]) * dArr2[i]) + dArr4[i3][i];
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr3[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = dArr4[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr3[i6];
            if (d < d4) {
                double d5 = dArr3[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    dArr[i] = (dArr4[i6][i] * d6) + ((1.0d - d6) * dArr4[i4][i]);
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
        double[] dArr = this.f231259i;
        double[] dArr2 = this.f231257g;
        int length = dArr2.length;
        double[][] dArr3 = this.f231258h;
        int i = 0;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            mo25153t(d2, dArr);
            for (int i2 = 0; i2 < length2; i2++) {
                fArr[i2] = (float) (((d - dArr2[0]) * dArr[i2]) + dArr3[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        double d3 = dArr2[i3];
        if (d >= d3) {
            mo25153t(d3, dArr);
            while (i < length2) {
                fArr[i] = (float) (((d - dArr2[i3]) * dArr[i]) + dArr3[i3][i]);
                i++;
            }
            return;
        }
        int i4 = 0;
        while (i4 < length - 1) {
            if (d == dArr2[i4]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) dArr3[i4][i5];
                }
            }
            int i6 = i4 + 1;
            double d4 = dArr2[i6];
            if (d < d4) {
                double d5 = dArr2[i4];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    fArr[i] = (float) ((dArr3[i6][i] * d6) + ((1.0d - d6) * dArr3[i4][i]));
                    i++;
                }
                return;
            }
            i4 = i6;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000f A[PHI: r5
      0x000f: PHI (r5v6 double) = (r5v0 double), (r5v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p204p.hkf1
    /* JADX INFO: renamed from: t */
    public final void mo25153t(double d, double[] dArr) {
        double[] dArr2 = this.f231257g;
        int length = dArr2.length;
        double[][] dArr3 = this.f231258h;
        int length2 = dArr3[0].length;
        double d2 = dArr2[0];
        if (d <= d2) {
            d = d2;
        } else {
            d2 = dArr2[length - 1];
            if (d >= d2) {
                d = d2;
            }
        }
        int i = 0;
        while (i < length - 1) {
            int i2 = i + 1;
            double d3 = dArr2[i2];
            if (d <= d3) {
                double d4 = d3 - dArr2[i];
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = (dArr3[i2][i3] - dArr3[i][i3]) / d4;
                }
                return;
            }
            i = i2;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: u */
    public final double[] mo25154u() {
        return this.f231257g;
    }
}

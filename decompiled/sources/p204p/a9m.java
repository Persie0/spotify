package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class a9m extends hkf1 {

    /* JADX INFO: renamed from: g */
    public double f13598g;

    /* JADX INFO: renamed from: h */
    public double[] f13599h;

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: q */
    public final double mo25150q(double d) {
        return this.f13599h[0];
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: r */
    public final void mo25151r(double d, double[] dArr) {
        double[] dArr2 = this.f13599h;
        System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: s */
    public final void mo25152s(double d, float[] fArr) {
        int i = 0;
        while (true) {
            double[] dArr = this.f13599h;
            if (i >= dArr.length) {
                return;
            }
            fArr[i] = (float) dArr[i];
            i++;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: t */
    public final void mo25153t(double d, double[] dArr) {
        for (int i = 0; i < this.f13599h.length; i++) {
            dArr[i] = 0.0d;
        }
    }

    @Override // p204p.hkf1
    /* JADX INFO: renamed from: u */
    public final double[] mo25154u() {
        return new double[]{this.f13598g};
    }
}

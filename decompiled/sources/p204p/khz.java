package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class khz {

    /* JADX INFO: renamed from: a */
    public final float f122744a;

    /* JADX INFO: renamed from: b */
    public final float f122745b;

    public khz(float f, yqq yqqVar) {
        this.f122744a = f;
        float fMo24619j = yqqVar.mo24619j();
        float f2 = lhz.f133674a;
        this.f122745b = fMo24619j * 386.0878f * 160.0f * 0.84f;
    }

    /* JADX INFO: renamed from: a */
    public final jhz m56467a(float f) {
        float[] fArr = h84.f88615a;
        float f2 = this.f122744a;
        float f3 = this.f122745b;
        double dM46825a = h84.m46825a(f, f2 * f3);
        double d = lhz.f133674a;
        double d2 = d - 1.0d;
        return new jhz(f, (float) (Math.exp((d / d2) * dM46825a) * ((double) (f2 * f3))), (long) (Math.exp(dM46825a / d2) * 1000.0d));
    }
}

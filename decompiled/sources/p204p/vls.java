package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class vls implements vhz {

    /* JADX INFO: renamed from: a */
    public float f242586a;

    /* JADX INFO: renamed from: b */
    public float f242587b;

    public vls(float f, float f2) {
        this.f242586a = Math.max(1.0E-7f, Math.abs(f2));
        this.f242587b = Math.max(1.0E-4f, f) * (-4.2f);
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: a */
    public float mo39758a(float f, float f2, long j) {
        float f3 = this.f242587b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: l */
    public float mo39763l() {
        return this.f242586a;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: n */
    public long mo39764n(float f) {
        return ((long) ((((float) Math.log(this.f242586a / Math.abs(f))) * 1000.0f) / this.f242587b)) * 1000000;
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: o */
    public float mo39765o(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.f242586a;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.f242587b;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * ((double) 1000))) / ((double) 1000.0f)))) + (f - (f2 / f4));
    }

    @Override // p204p.vhz
    /* JADX INFO: renamed from: q */
    public float mo39767q(long j, float f) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.f242587b));
    }
}

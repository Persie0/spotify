package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class tze1 {

    /* JADX INFO: renamed from: a */
    public float f225232a;

    /* JADX INFO: renamed from: b */
    public final float f225233b;

    /* JADX INFO: renamed from: c */
    public final float f225234c;

    /* JADX INFO: renamed from: d */
    public float f225235d;

    public tze1(float f, float f2) {
        this.f225233b = f;
        this.f225234c = f2;
    }

    /* JADX INFO: renamed from: a */
    public final float m82068a() {
        return this.f225235d;
    }

    /* JADX INFO: renamed from: b */
    public final float m82069b() {
        return this.f225233b;
    }

    /* JADX INFO: renamed from: c */
    public final float m82070c() {
        return this.f225234c;
    }

    /* JADX INFO: renamed from: d */
    public final float m82071d() {
        return this.f225232a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    /* JADX INFO: renamed from: e */
    public final void m82072e() {
        float f = 1.0f;
        float f2 = this.f225233b;
        float f3 = this.f225234c;
        if (1.0f > f2 || 1.0f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio 1.0 is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.f225232a = 1.0f;
        if (f2 == f3) {
            f = 0.0f;
        } else if (1.0f != f2) {
            if (1.0f == f3) {
                f = 0.0f;
            } else {
                float f4 = 1.0f / f3;
                f = (1.0f - f4) / ((1.0f / f2) - f4);
            }
        }
        this.f225235d = f;
    }
}

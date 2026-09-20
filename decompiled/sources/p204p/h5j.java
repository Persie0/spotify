package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class h5j {

    /* JADX INFO: renamed from: a */
    public final float f87858a;

    /* JADX INFO: renamed from: b */
    public final double f87859b;

    /* JADX INFO: renamed from: c */
    public final int f87860c;

    /* JADX INFO: renamed from: d */
    public final long f87861d;

    /* JADX INFO: renamed from: e */
    public int f87862e;

    public h5j(long j, float f, int i) {
        c95.m31843i(j > 0);
        c95.m31843i(f > 0.0f);
        c95.m31843i(0 < j);
        this.f87861d = j;
        this.f87858a = f;
        this.f87860c = Math.max(Math.round((j / 1000000.0f) * f), 1);
        this.f87859b = 1000000.0f / f;
    }

    /* JADX INFO: renamed from: a */
    public final h5j m46688a() {
        return new h5j(this.f87861d, this.f87858a, 0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m46689b() {
        return this.f87862e < this.f87860c;
    }
}

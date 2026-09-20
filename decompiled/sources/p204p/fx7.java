package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fx7 {

    /* JADX INFO: renamed from: a */
    public int f74277a;

    /* JADX INFO: renamed from: b */
    public int f74278b;

    /* JADX INFO: renamed from: c */
    public float f74279c;

    /* JADX INFO: renamed from: d */
    public float f74280d;

    /* JADX INFO: renamed from: e */
    public long f74281e;

    /* JADX INFO: renamed from: f */
    public long f74282f;

    /* JADX INFO: renamed from: g */
    public long f74283g;

    /* JADX INFO: renamed from: h */
    public float f74284h;

    /* JADX INFO: renamed from: i */
    public int f74285i;

    /* JADX INFO: renamed from: a */
    public final float m42996a(long j) {
        long j2 = this.f74281e;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f74283g;
        if (j3 < 0 || j < j3) {
            return r690.m74847b((j - j2) / this.f74277a, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f74284h;
        return (r690.m74847b((j - j3) / this.f74285i, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}

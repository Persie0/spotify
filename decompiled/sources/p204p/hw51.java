package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hw51 {

    /* JADX INFO: renamed from: c */
    public static final hw51 f95862c = new hw51(-9223372036854775807L, false);

    /* JADX INFO: renamed from: a */
    public boolean f95863a;

    /* JADX INFO: renamed from: b */
    public long f95864b;

    public hw51(long j, boolean z) {
        this.f95864b = j;
        this.f95863a = z;
    }

    /* JADX INFO: renamed from: a */
    public long m48920a() {
        if (this.f95863a) {
            return Long.MAX_VALUE;
        }
        return Math.max(0L, this.f95864b - System.nanoTime());
    }

    /* JADX INFO: renamed from: b */
    public boolean m48921b() {
        return this.f95863a;
    }

    /* JADX INFO: renamed from: c */
    public void m48922c(boolean z) {
        this.f95863a = z;
    }

    /* JADX INFO: renamed from: d */
    public void m48923d(long j) {
        this.f95864b = j;
    }

    public hw51() {
    }
}

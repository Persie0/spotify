package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class dhx {

    /* JADX INFO: renamed from: a */
    public final long f49185a;

    /* JADX INFO: renamed from: b */
    public final long f49186b;

    public dhx(double d) {
        this((long) (d * 10000.0d), 10000L);
    }

    /* JADX INFO: renamed from: a */
    public final double m36060a() {
        return this.f49185a / this.f49186b;
    }

    public final String toString() {
        return this.f49185a + "/" + this.f49186b;
    }

    public dhx(long j, long j2) {
        if (j2 == 0) {
            this.f49185a = 0L;
            this.f49186b = 1L;
        } else {
            this.f49185a = j;
            this.f49186b = j2;
        }
    }
}

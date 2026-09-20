package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class et81 {

    /* JADX INFO: renamed from: a */
    public final xre f62665a;

    /* JADX INFO: renamed from: b */
    public boolean f62666b;

    /* JADX INFO: renamed from: c */
    public long f62667c = -1;

    public et81(xre xreVar) {
        this.f62665a = xreVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m39932a(Long l) {
        long jCurrentTimeMillis;
        if (l != null) {
            jCurrentTimeMillis = l.longValue();
        } else {
            ((wy3) this.f62665a).getClass();
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        this.f62667c = jCurrentTimeMillis;
    }
}

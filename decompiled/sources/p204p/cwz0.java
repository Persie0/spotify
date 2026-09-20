package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class cwz0 implements ewz0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Long f42864a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ u4l0 f42865b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f42866c;

    public cwz0(Long l, u4l0 u4l0Var, long j) {
        this.f42864a = l;
        this.f42865b = u4l0Var;
        this.f42866c = j;
    }

    @Override // p204p.ewz0
    public final xul0 call() {
        Long l = this.f42864a;
        if (l == null || l.longValue() <= 0) {
            return C2244p5.f174033a;
        }
        ((wy3) ((xre) this.f42865b.f226773c)).getClass();
        return new hzq0(Long.valueOf(((System.currentTimeMillis() - this.f42866c) / ((long) 1000)) + l.longValue()));
    }
}

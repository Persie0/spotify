package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class z9r0 {

    /* JADX INFO: renamed from: a */
    public final am71 f280865a;

    /* JADX INFO: renamed from: b */
    public final Object f280866b = new Object();

    /* JADX INFO: renamed from: c */
    public y9r0 f280867c;

    public z9r0(am71 am71Var) {
        this.f280865a = am71Var;
    }

    /* JADX INFO: renamed from: a */
    public final y9r0 m95720a(String str) {
        synchronized (this.f280866b) {
            try {
                y9r0 y9r0Var = this.f280867c;
                try {
                    y9r0 y9r0Var2 = new y9r0(this.f280865a, str, new hmm0(1, this, z9r0.class, "clear", "clear(Lcom/spotify/campaigns/rivevideo/preview/impl/domain/PreviewPerformanceTracker$Attempt;)V", 0, 0, 19));
                    this.f280867c = y9r0Var2;
                    if (y9r0Var != null) {
                        y9r0Var.m93159b(3);
                    }
                    return y9r0Var2;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }
}

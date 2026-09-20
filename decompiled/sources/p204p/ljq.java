package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ljq implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f134126a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mjq f134127b;

    public /* synthetic */ ljq(String str, mjq mjqVar) {
        this.f134126a = 0;
        this.f134127b = mjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f134126a) {
            case 0:
                mjq mjqVar = this.f134127b;
                try {
                    mjqVar.f144309e.get();
                    mjqVar.m61987e(mjq.f144304n.decrementAndGet(), mjq.f144303m.get(), "Surface terminated");
                    return;
                } catch (Exception e) {
                    mjqVar.toString();
                    vie1.m85626h("DeferrableSurface");
                    synchronized (mjqVar.f144305a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", mjqVar, Boolean.valueOf(mjqVar.f144307c), Integer.valueOf(mjqVar.f144306b)), e);
                    }
                }
            case 1:
                this.f134127b.mo61983a();
                return;
            default:
                this.f134127b.m61984b();
                return;
        }
    }

    public /* synthetic */ ljq(mjq mjqVar, int i) {
        this.f134126a = i;
        this.f134127b = mjqVar;
    }
}

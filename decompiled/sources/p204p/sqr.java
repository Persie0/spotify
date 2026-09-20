package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class sqr implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final qqr f213136a;

    /* JADX INFO: renamed from: b */
    public boolean f213137b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ xqr f213138c;

    public sqr(xqr xqrVar, qqr qqrVar) {
        this.f213138c = xqrVar;
        this.f213136a = qqrVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f213137b) {
            return;
        }
        this.f213137b = true;
        xqr xqrVar = this.f213138c;
        synchronized (xqrVar.f265103h) {
            qqr qqrVar = this.f213136a;
            int i = qqrVar.f191643h - 1;
            qqrVar.f191643h = i;
            if (i == 0 && qqrVar.f191641f) {
                xqrVar.m91891B(qqrVar);
            }
        }
    }
}

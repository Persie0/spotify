package p204p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u400 implements ai21 {

    /* JADX INFO: renamed from: a */
    private final ai21 f226524a;

    public u400(ai21 ai21Var) {
        this.f226524a = ai21Var;
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: U0 */
    public void mo25160U0(npa npaVar, long j) {
        this.f226524a.mo25160U0(npaVar, j);
    }

    @Override // p204p.ai21, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f226524a.close();
    }

    @Override // p204p.ai21, java.io.Flushable
    public void flush() {
        this.f226524a.flush();
    }

    @Override // p204p.ai21
    /* JADX INFO: renamed from: m */
    public au71 mo25161m() {
        return this.f226524a.mo25161m();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f226524a + ')';
    }
}

package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v400 implements wt31 {

    /* JADX INFO: renamed from: a */
    public final wt31 f237013a;

    public v400(wt31 wt31Var) {
        this.f237013a = wt31Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f237013a.close();
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public long mo27348g1(npa npaVar, long j) {
        return this.f237013a.mo27348g1(npaVar, j);
    }

    @Override // p204p.wt31
    /* JADX INFO: renamed from: m */
    public final au71 mo27349m() {
        return this.f237013a.mo27349m();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.f237013a + ')';
    }
}

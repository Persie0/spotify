package p204p;

import java.io.IOException;

/* JADX INFO: loaded from: classes11.dex */
public final class sf30 extends of30 {

    /* JADX INFO: renamed from: e */
    public boolean f208456e;

    public sf30(tf30 tf30Var, ph30 ph30Var) {
        super(tf30Var, ph30Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f164630c) {
            return;
        }
        if (!this.f208456e) {
            m66811a(tf30.f219838f);
        }
        this.f164630c = true;
    }

    @Override // p204p.of30, p204p.wt31
    /* JADX INFO: renamed from: g1 */
    public final long mo27348g1(npa npaVar, long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException(edb.m38561j(j, "byteCount < 0: ").toString());
        }
        if (this.f164630c) {
            throw new IllegalStateException("closed");
        }
        if (this.f208456e) {
            return -1L;
        }
        long jMo27348g1 = super.mo27348g1(npaVar, j);
        if (jMo27348g1 != -1) {
            return jMo27348g1;
        }
        this.f208456e = true;
        m66811a(sn20.f210780b);
        return -1L;
    }
}

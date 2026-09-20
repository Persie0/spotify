package p204p;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class lg30 extends ln6 {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ mg30 f133063n;

    public lg30(mg30 mg30Var) {
        this.f133063n = mg30Var;
    }

    @Override // p204p.ln6
    /* JADX INFO: renamed from: k */
    public final IOException mo39258k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // p204p.ln6
    /* JADX INFO: renamed from: l */
    public final void mo39259l() {
        this.f133063n.m61683e(9);
        fg30 fg30Var = this.f133063n.f143294b;
        synchronized (fg30Var) {
            long j = fg30Var.f69187M0;
            long j2 = fg30Var.f69186L0;
            if (j < j2) {
                return;
            }
            fg30Var.f69186L0 = j2 + 1;
            fg30Var.f69188N0 = System.nanoTime() + ((long) 1000000000);
            kv61.m57439c(fg30Var.f69209h, dq60.m36616p(fg30Var.f69204c, " ping", new StringBuilder()), 0L, new mo4(fg30Var, 27), 6);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m58934m() {
        if (m59474j()) {
            throw mo39258k(null);
        }
    }
}

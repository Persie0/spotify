package p204p;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class sxz0 implements txz0 {

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f215074a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b */
    public final txz0 f215075b;

    public sxz0(txz0 txz0Var) {
        this.f215075b = txz0Var;
    }

    @Override // p204p.txz0
    /* JADX INFO: renamed from: a */
    public final void mo64589a(vxz0 vxz0Var) {
        if (this.f215074a.get()) {
            return;
        }
        this.f215075b.mo64589a(vxz0Var);
    }

    /* JADX INFO: renamed from: b */
    public final void m79672b() {
        this.f215074a.set(true);
    }
}

package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class to90 implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final u1b0 f222205a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference f222206b = new AtomicReference(null);

    public to90(u1b0 u1b0Var) {
        this.f222205a = u1b0Var;
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f222205a.m82201a(new t790(this, 9));
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}

package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a500 extends hg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f12362a;

    public a500(AtomicReference atomicReference) {
        this.f12362a = atomicReference;
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: a */
    public final void mo24737a(Object obj) {
        hg0 hg0Var = (hg0) this.f12362a.get();
        if (hg0Var == null) {
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }
        hg0Var.mo24737a(obj);
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: b */
    public final void mo24738b() {
        hg0 hg0Var = (hg0) this.f12362a.getAndSet(null);
        if (hg0Var != null) {
            hg0Var.mo24738b();
        }
    }
}

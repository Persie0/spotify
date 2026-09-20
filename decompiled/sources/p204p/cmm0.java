package p204p;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
public final class cmm0 extends hg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicReference f39730a;

    public cmm0(AtomicReference atomicReference) {
        this.f39730a = atomicReference;
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: a */
    public final void mo24737a(Object obj) {
        hg0 hg0Var = (hg0) this.f39730a.get();
        if (hg0Var != null) {
            hg0Var.mo24737a(obj);
        }
    }

    @Override // p204p.hg0
    /* JADX INFO: renamed from: b */
    public final void mo24738b() {
        hg0 hg0Var = (hg0) this.f39730a.getAndSet(null);
        if (hg0Var != null) {
            hg0Var.mo24738b();
        }
    }
}

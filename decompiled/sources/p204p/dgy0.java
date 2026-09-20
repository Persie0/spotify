package p204p;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dgy0 extends sgx {

    /* JADX INFO: renamed from: c */
    public wuk f48918c;

    @Override // p204p.luk
    /* JADX INFO: renamed from: M */
    public final void mo35948M(juk jukVar, Runnable runnable) {
        wuk.m89053e(this.f48918c, runnable, 2);
    }

    @Override // p204p.sgx
    /* JADX INFO: renamed from: U */
    public final Executor mo35949U() {
        return this.f48918c;
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        wuk.m89053e(this.f48918c, runnable, 6);
    }
}

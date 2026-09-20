package p204p;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class xjq extends luk {

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f262187e = AtomicIntegerFieldUpdater.newUpdater(xjq.class, "d");

    /* JADX INFO: renamed from: c */
    public final luk f262188c;

    /* JADX INFO: renamed from: d */
    public volatile /* synthetic */ int f262189d = 1;

    public xjq(luk lukVar) {
        this.f262188c = lukVar;
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: M */
    public final void mo35948M(juk jukVar, Runnable runnable) {
        m91250U().mo35948M(jukVar, runnable);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: P */
    public final boolean mo30645P(juk jukVar) {
        return m91250U().mo30645P(jukVar);
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: Q */
    public final luk mo40637Q(int i) {
        return m91250U().mo40637Q(i);
    }

    /* JADX INFO: renamed from: U */
    public final luk m91250U() {
        return f262187e.get(this) == 1 ? xsr.f265652b : this.f262188c;
    }

    @Override // p204p.luk
    /* JADX INFO: renamed from: r */
    public final void mo30646r(juk jukVar, Runnable runnable) {
        m91250U().mo30646r(jukVar, runnable);
    }

    @Override // p204p.luk
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.f262188c + ")";
    }
}

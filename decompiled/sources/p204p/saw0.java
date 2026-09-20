package p204p;

import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class saw0 implements fwz0, wy91 {

    /* JADX INFO: renamed from: a */
    public final u0x0 f207285a;

    /* JADX INFO: renamed from: b */
    public final paw0 f207286b;

    /* JADX INFO: renamed from: c */
    public final CompositeDisposable f207287c;

    public saw0(u0x0 u0x0Var, xre xreVar, paw0 paw0Var) {
        this.f207285a = u0x0Var;
        this.f207286b = paw0Var;
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f207287c = compositeDisposable;
        u0x0Var.mo30985d();
        compositeDisposable.mo23393b(u0x0Var.mo30982a().onErrorResumeWith(new qaw0(this)).flatMapCompletable(new prv0(this, 2)).subscribe(raw0.f197397b, u9w0.f228298e));
    }

    @Override // p204p.bji
    /* JADX INFO: renamed from: e */
    public final iys0 mo29483e(sys0 sys0Var) {
        return this.f207285a.mo29483e(sys0Var);
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f207287c.dispose();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}

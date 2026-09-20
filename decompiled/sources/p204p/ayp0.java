package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class ayp0 implements wxp0, fwz0 {

    /* JADX INFO: renamed from: a */
    public final dk4 f21336a;

    /* JADX INFO: renamed from: b */
    public final wkb0 f21337b;

    /* JADX INFO: renamed from: c */
    public final cjb0 f21338c;

    /* JADX INFO: renamed from: d */
    public final ajb0 f21339d;

    /* JADX INFO: renamed from: e */
    public final e3e1 f21340e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f21341f;

    /* JADX INFO: renamed from: g */
    public final CompositeDisposable f21342g = new CompositeDisposable();

    public ayp0(dk4 dk4Var, wkb0 wkb0Var, cjb0 cjb0Var, ajb0 ajb0Var, e3e1 e3e1Var, Scheduler scheduler) {
        this.f21336a = dk4Var;
        this.f21337b = wkb0Var;
        this.f21338c = cjb0Var;
        this.f21339d = ajb0Var;
        this.f21340e = e3e1Var;
        this.f21341f = scheduler;
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }

    @Override // p204p.hgm
    public final void shutdown() {
    }
}

package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: classes2.dex */
public final class wft0 implements uft0 {

    /* JADX INFO: renamed from: b */
    public final xft0 f250892b;

    /* JADX INFO: renamed from: c */
    public final CompositeDisposable f250893c = new CompositeDisposable();

    /* JADX INFO: renamed from: d */
    public final aaq0 f250894d;

    /* JADX INFO: renamed from: e */
    public final hv31 f250895e;

    /* JADX INFO: renamed from: f */
    public final Scheduler f250896f;

    public wft0(xft0 xft0Var, aaq0 aaq0Var, hv31 hv31Var, Scheduler scheduler) {
        this.f250892b = xft0Var;
        this.f250894d = aaq0Var;
        this.f250895e = hv31Var;
        this.f250896f = scheduler;
    }
}

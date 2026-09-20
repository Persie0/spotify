package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* JADX INFO: loaded from: classes.dex */
public final class d3l implements c3l {

    /* JADX INFO: renamed from: b */
    public final hv31 f44927b;

    /* JADX INFO: renamed from: c */
    public final i4t0 f44928c;

    /* JADX INFO: renamed from: d */
    public final Scheduler f44929d;

    /* JADX INFO: renamed from: e */
    public final Scheduler f44930e;

    /* JADX INFO: renamed from: f */
    public Disposable f44931f = EmptyDisposable.f7220a;

    public d3l(hv31 hv31Var, i4t0 i4t0Var, Scheduler scheduler, Scheduler scheduler2) {
        this.f44927b = hv31Var;
        this.f44928c = i4t0Var;
        this.f44929d = scheduler;
        this.f44930e = scheduler2;
    }
}

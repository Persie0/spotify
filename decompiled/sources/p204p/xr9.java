package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class xr9 {

    /* JADX INFO: renamed from: a */
    public final z5f f265292a;

    /* JADX INFO: renamed from: b */
    public final qwx0 f265293b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f265294c;

    public xr9(z5f z5fVar, qwx0 qwx0Var, Scheduler scheduler) {
        this.f265292a = z5fVar;
        this.f265293b = qwx0Var;
        this.f265294c = scheduler;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m91918a(List list) {
        return ((rwx0) this.f265293b).m76590a("disable-blocked-content", "0").firstOrError().map(new0.f153119L0).doOnError(C2234p.f172414g).onErrorReturnItem(Boolean.FALSE).flatMapObservable(new fw7(7, list, this));
    }
}

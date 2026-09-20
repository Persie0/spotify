package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes9.dex */
public final class i7p0 implements t5q0 {

    /* JADX INFO: renamed from: a */
    public final Flowable f99600a;

    /* JADX INFO: renamed from: b */
    public final CompositeDisposable f99601b = new CompositeDisposable();

    /* JADX INFO: renamed from: c */
    public final BehaviorSubject f99602c = BehaviorSubject.m23796g(v5q0.f237569d);

    public i7p0(Flowable flowable, xre xreVar, String str, j7p0 j7p0Var) {
        this.f99600a = flowable;
    }
}

package p204p;

import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class jf61 {

    /* JADX INFO: renamed from: a */
    public final wt3 f111830a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f111831b = BehaviorSubject.m23796g(xt41.f265749b);

    public jf61(wt3 wt3Var) {
        this.f111830a = wt3Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m53152a(mv41 mv41Var) {
        this.f111831b.onNext(mv41Var);
    }
}

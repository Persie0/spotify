package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class hzb implements gzb {

    /* JADX INFO: renamed from: a */
    public final BehaviorSubject f96880a;

    /* JADX INFO: renamed from: b */
    public final Observable f96881b;

    /* JADX INFO: renamed from: c */
    public final Observable f96882c;

    public hzb() {
        BehaviorSubject behaviorSubjectM23796g = BehaviorSubject.m23796g(pft0.m69840u(Boolean.FALSE, "default"));
        this.f96880a = behaviorSubjectM23796g;
        Observable<T> observableDistinctUntilChanged = behaviorSubjectM23796g.distinctUntilChanged();
        this.f96881b = observableDistinctUntilChanged;
        this.f96882c = observableDistinctUntilChanged.map(r101.f194678t).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m49260a() {
        pqm0 pqm0Var = (pqm0) this.f96880a.m23798h();
        if (pqm0Var != null) {
            return ((Boolean) pqm0Var.f180350a).booleanValue();
        }
        return false;
    }
}

package p204p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableTake;
import io.reactivex.rxjava3.internal.operators.observable.ObservableFromPublisher;

/* JADX INFO: loaded from: classes8.dex */
public final class tzz0 {

    /* JADX INFO: renamed from: a */
    public final se41 f225329a;

    /* JADX INFO: renamed from: b */
    public final gcu0 f225330b;

    /* JADX INFO: renamed from: c */
    public final Observable f225331c;

    public tzz0(Flowable flowable, Scheduler scheduler, se41 se41Var, gcu0 gcu0Var) {
        this.f225329a = se41Var;
        this.f225330b = gcu0Var;
        this.f225331c = new ObservableFromPublisher(new FlowableTake(flowable.m23360y(qgr0.f188535X))).switchMap(new frv0(this, 16)).observeOn(scheduler).doOnNext(new l2s0(this, 27));
    }
}

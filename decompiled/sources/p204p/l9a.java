package p204p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes2.dex */
public final class l9a implements fwz0 {

    /* JADX INFO: renamed from: a */
    public final CompositeDisposable f131041a;

    /* JADX INFO: renamed from: b */
    public final BehaviorSubject f131042b;

    public l9a(zkr0 zkr0Var, m9a m9aVar, Scheduler scheduler) {
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        this.f131041a = compositeDisposable;
        BehaviorSubject behaviorSubjectM23796g = BehaviorSubject.m23796g(j9a.f110130a);
        this.f131042b = behaviorSubjectM23796g;
        compositeDisposable.mo23393b(behaviorSubjectM23796g.doOnNext(C2234p.f172416i).subscribe());
        compositeDisposable.mo23393b(Single.fromCallable(new ic9(zkr0Var, 17)).onErrorReturn(hvi0.f95740t).subscribeOn(zkr0Var.f283839b).flatMap(new px0(m9aVar, 13)).subscribeOn(scheduler).doOnSuccess(new C2428tu(this, 15)).doOnError(new cf8(this, 12)).onErrorComplete().subscribe());
    }

    @Override // p204p.hgm
    public final void shutdown() {
        this.f131041a.m23396g();
    }

    @Override // p204p.fwz0
    public final Object getApi() {
        return this;
    }
}

package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.schedulers.Schedulers;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class jmn0 {

    /* JADX INFO: renamed from: a */
    public final wra0 f113910a;

    /* JADX INFO: renamed from: b */
    public final Runnable f113911b;

    /* JADX INFO: renamed from: c */
    public final Observable f113912c;

    /* JADX INFO: renamed from: d */
    public final hke f113913d;

    /* JADX INFO: renamed from: e */
    public volatile Disposable f113914e = EmptyDisposable.f7220a;

    /* JADX INFO: renamed from: f */
    public final PublishSubject f113915f = new PublishSubject();

    public jmn0(wra0 wra0Var, h7x h7xVar, Observable observable, hke hkeVar) {
        this.f113910a = wra0Var;
        this.f113911b = h7xVar;
        this.f113912c = observable;
        this.f113913d = hkeVar;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m53789a() {
        this.f113915f.onNext(new hzq0(w2a1.f247311a));
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m53790b() {
        if (this.f113914e.isDisposed()) {
            Integer numM67507b = ooi0.m67507b(((ooi0) ((rpi0) this.f113913d.f92426b).get()).f167631a);
            long jIntValue = numM67507b != null ? numM67507b.intValue() : 30;
            Observable<R> map = Observable.interval(jIntValue, jIntValue, TimeUnit.SECONDS).map(gaz.f78135V0);
            C2244p5 c2244p5 = C2244p5.f174033a;
            this.f113914e = Observable.combineLatest(Observable.combineLatest(map.startWithItem(c2244p5), this.f113915f.startWithItem(c2244p5), j5z.f109149T0).filter(y8z.f270428V0), this.f113912c.distinctUntilChanged().onErrorReturnItem(Boolean.FALSE), zhi0.f282940g).filter(r4z.f195887V0).observeOn(Schedulers.f10370c).concatMapCompletable(new ezk0(this, 9)).subscribe(new jo10(this, 22), new o4n0(this, 4));
        }
    }
}

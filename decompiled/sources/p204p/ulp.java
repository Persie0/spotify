package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

/* JADX INFO: loaded from: classes.dex */
public final class ulp implements ssi {

    /* JADX INFO: renamed from: a */
    public final voi f231602a;

    /* JADX INFO: renamed from: b */
    public final wop f231603b;

    /* JADX INFO: renamed from: c */
    public final Scheduler f231604c;

    /* JADX INFO: renamed from: d */
    public final gfz f231605d;

    /* JADX INFO: renamed from: e */
    public final BehaviorSubject f231606e = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: f */
    public final BehaviorSubject f231607f = BehaviorSubject.m23795f();

    /* JADX INFO: renamed from: g */
    public final lwr f231608g = new lwr();

    public ulp(voi voiVar, wop wopVar, Scheduler scheduler, gfz gfzVar) {
        this.f231602a = voiVar;
        this.f231603b = wopVar;
        this.f231604c = scheduler;
        this.f231605d = gfzVar;
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: a */
    public final void mo24869a() {
        this.f231608g.m60129c();
    }

    @Override // p204p.ssi
    /* JADX INFO: renamed from: b */
    public final void mo24870b() {
        Observable observableCombineLatest;
        Observable map = ((s5p) this.f231602a).m77297d().map(oet.f164537V0);
        if (this.f231605d.isEnabled()) {
            observableCombineLatest = Observable.combineLatest(map, this.f231603b.f253526a.doOnNext(C2234p.f172388L0), b5v.f23714V0);
            wj50.m88279p(observableCombineLatest);
        } else {
            observableCombineLatest = map;
        }
        Scheduler scheduler = this.f231604c;
        Disposable disposableSubscribe = observableCombineLatest.observeOn(scheduler).subscribe(new ir5(this.f231606e, 5));
        lwr lwrVar = this.f231608g;
        lwrVar.m60127a(disposableSubscribe);
        lwrVar.m60127a(map.observeOn(scheduler).subscribe(new ir5(this.f231607f, 6)));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m83401c() {
        Boolean bool = (Boolean) this.f231606e.m23798h();
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}

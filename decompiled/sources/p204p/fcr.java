package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class fcr {

    /* JADX INFO: renamed from: a */
    public final Observable f68239a;

    /* JADX INFO: renamed from: b */
    public final gmx f68240b;

    /* JADX INFO: renamed from: c */
    public final qwx0 f68241c;

    /* JADX INFO: renamed from: d */
    public final prb f68242d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC2609yd f68243e;

    /* JADX INFO: renamed from: f */
    public final dii0 f68244f;

    /* JADX INFO: renamed from: g */
    public final Observable f68245g;

    public fcr(Observable observable, Observable observable2, gmx gmxVar, qwx0 qwx0Var, prb prbVar, InterfaceC2609yd interfaceC2609yd, dii0 dii0Var) {
        this.f68239a = observable2;
        this.f68240b = gmxVar;
        this.f68241c = qwx0Var;
        this.f68242d = prbVar;
        this.f68243e = interfaceC2609yd;
        this.f68244f = dii0Var;
        this.f68245g = Observable.combineLatest(observable, ((rwx0) qwx0Var).f203428a.map(new m95(this, 9)).distinctUntilChanged(), tp20.f222392U0);
    }

    /* JADX INFO: renamed from: a */
    public final fiz m41340a() {
        return mvl0.m62953p(new nmp(17, new fiz[]{this.f68240b.f81493a, k0e1.m54985d(this.f68245g), this.f68242d.m70708b(), k0e1.m54985d(this.f68239a), mvl0.m62953p(k0e1.m54985d(((rwx0) this.f68241c).f203428a.map(new zhi0(this)))), this.f68244f.m36121z()}, this));
    }
}

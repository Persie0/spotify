package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class h2q {

    /* JADX INFO: renamed from: a */
    public final ksk f87050a;

    public h2q(ksk kskVar) {
        this.f87050a = kskVar;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m46501a(Observable observable, gh00 gh00Var, gh00 gh00Var2) {
        Observable observableSwitchMap = observable.switchMap(new p7o(this, gh00Var, gh00Var2));
        ksk kskVar = this.f87050a;
        kskVar.getClass();
        return observableSwitchMap.compose(new lsk(cmk.f39724t, jcg1.m53000t(new adk(kskVar, 6)))).compose(hc3.f89679e);
    }
}

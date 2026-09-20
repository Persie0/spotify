package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class gkr0 {

    /* JADX INFO: renamed from: a */
    public final Observable f80897a;

    public gkr0(gmx gmxVar, nc2 nc2Var) {
        this.f80897a = Observable.combineLatest(k0e1.m54988g(gmxVar.f81493a, dau.f47107a), nc2Var.m64106a(), fkr0.f70604b);
    }
}

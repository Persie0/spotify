package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes10.dex */
public final class uwx0 {

    /* JADX INFO: renamed from: a */
    public final rz40 f234746a;

    public uwx0(rz40 rz40Var) {
        this.f234746a = rz40Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m84116a(String str) {
        return this.f234746a.m76777a(str).toObservable().map(new x4t0(14));
    }
}

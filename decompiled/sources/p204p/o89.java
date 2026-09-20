package p204p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes.dex */
public final class o89 {

    /* JADX INFO: renamed from: a */
    public final Single f162737a;

    /* JADX INFO: renamed from: b */
    public final n89 f162738b;

    /* JADX INFO: renamed from: c */
    public n89 f162739c;

    /* JADX INFO: renamed from: d */
    public Disposable f162740d;

    public o89(Single single, n89 n89Var) {
        this.f162737a = single;
        this.f162738b = n89Var;
    }

    /* JADX INFO: renamed from: a */
    public final n89 m66420a() {
        n89 n89Var = this.f162739c;
        return n89Var == null ? this.f162738b : n89Var;
    }
}

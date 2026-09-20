package p204p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: classes2.dex */
public final class my00 {

    /* JADX INFO: renamed from: a */
    public final qwx0 f148245a;

    /* JADX INFO: renamed from: b */
    public final z84 f148246b;

    public my00(qwx0 qwx0Var, z84 z84Var) {
        this.f148245a = qwx0Var;
        this.f148246b = z84Var;
    }

    /* JADX INFO: renamed from: a */
    public final yab m63119a() {
        Observable observableJust;
        z84 z84Var = this.f148246b;
        if (z84Var.f280356g != null) {
            observableJust = ((Observable) z84Var.f280358i.getValue()).map(wow0.f253603g).distinctUntilChanged();
            wj50.m88279p(observableJust);
        } else {
            observableJust = Observable.just(Boolean.valueOf(z84Var.f280350a));
            wj50.m88279p(observableJust);
        }
        return k0e1.m54985d(observableJust);
    }

    /* JADX INFO: renamed from: b */
    public final Observable m63120b() {
        return ((rwx0) this.f148245a).m76590a("can-block-content", "0").map(r4z.f195900d).onErrorReturnItem(kob.f124746d);
    }
}

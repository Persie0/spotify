package p204p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: classes8.dex */
public final class nij0 {

    /* JADX INFO: renamed from: a */
    public final oij0 f154273a;

    /* JADX INFO: renamed from: b */
    public final PublishSubject f154274b = new PublishSubject();

    public nij0(oij0 oij0Var) {
        this.f154273a = oij0Var;
    }

    /* JADX INFO: renamed from: a */
    public final Observable m64579a(String str) {
        return this.f154274b.filter(new aqs(str, 12)).map(j5z.f109143N0).startWith(this.f154273a.m67053d(str)).distinctUntilChanged();
    }

    /* JADX INFO: renamed from: b */
    public final CompletablePeek m64580b(String str) {
        return this.f154273a.m67051b(str).m23295g(new mij0(this, str, 1));
    }
}

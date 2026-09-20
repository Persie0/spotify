package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.completable.CompletablePeek;
import io.reactivex.rxjava3.internal.operators.observable.ObservableRefCount;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class cgm {

    /* JADX INFO: renamed from: a */
    public final zfm f37744a;

    /* JADX INFO: renamed from: b */
    public final ObservableRefCount f37745b;

    /* JADX INFO: renamed from: c */
    public final BehaviorSubject f37746c = BehaviorSubject.m23795f();

    public cgm(qwx0 qwx0Var, zfm zfmVar) {
        this.f37744a = zfmVar;
        this.f37745b = ((rwx0) qwx0Var).m76590a("dsa-mode-enabled", "0").map(new agm(this)).onErrorReturn(xzk.f267680N0).distinctUntilChanged().doOnNext(new g8f(this, 16)).replay(1).m23778f();
    }

    /* JADX INFO: renamed from: a */
    public final Observable m32730a(boolean z) {
        return this.f37745b.switchMap(new rc9(this, 23)).distinctUntilChanged().skip(z ? 0L : 1L);
    }

    /* JADX INFO: renamed from: b */
    public final CompletablePeek m32731b(boolean z) {
        Completable completableM96032a = this.f37744a.m96032a(new yfm(new fgm(z ? "1" : "0")));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return completableM96032a.m23304u(30L, Completable.m23286j(new TimeoutException())).m23295g(new bgm(this, z, 0));
    }
}

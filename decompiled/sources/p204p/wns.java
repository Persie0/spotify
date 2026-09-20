package p204p;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class wns implements m6n0 {

    /* JADX INFO: renamed from: a */
    public final i4t0 f253273a;

    /* JADX INFO: renamed from: b */
    public final a741 f253274b;

    public wns(i4t0 i4t0Var, a741 a741Var) {
        this.f253273a = i4t0Var;
        this.f253274b = a741Var;
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: a */
    public final Observable mo61021a(int i, String str, String str2) {
        return m88612e(str2).m23293d(Observable.fromCallable(new uns(this, str, str2, i, 1))).flatMap(zp7.f284980Y0);
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: b */
    public final Observable mo61022b(int i, String str, String str2) {
        return m88612e(str2).m23293d(Observable.fromCallable(new uns(this, str, str2, i, 0))).flatMap(o5h1.f161988Y0);
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: c */
    public final Observable mo61023c(String str, String str2) {
        return m88612e(str2).m23293d(Observable.defer(new vns(this, str, str2, 0)));
    }

    @Override // p204p.m6n0
    /* JADX INFO: renamed from: d */
    public final Observable mo61024d(String str, String str2) {
        return m88612e(str2).m23293d(Observable.fromCallable(new mc9(this, str, str2, 2))).flatMap(z9h1.f280793W0);
    }

    /* JADX INFO: renamed from: e */
    public final Completable m88612e(String str) {
        a741 a741Var = this.f253274b;
        Set setMo24903a = a741Var.mo24903a();
        hms hmsVar = hms.LISTENING_PARTY_MESSAGE_SOURCE;
        return !setMo24903a.contains(hmsVar) ? k0e1.m54988g(a741Var.mo24904b(hmsVar), dau.f47107a).timeout(10L, TimeUnit.SECONDS, Observable.create(p4h1.f173939Y0)).doOnError(new e03(str, 4)).ignoreElements() : CompletableEmpty.f7437a;
    }
}

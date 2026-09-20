package p204p;

import android.content.Context;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: renamed from: p.sv */
/* JADX INFO: loaded from: classes18.dex */
public final class C2390sv {

    /* JADX INFO: renamed from: a */
    public final qre0 f214251a;

    /* JADX INFO: renamed from: b */
    public final voi f214252b;

    /* JADX INFO: renamed from: c */
    public final Context f214253c;

    /* JADX INFO: renamed from: d */
    public n9r f214254d;

    /* JADX INFO: renamed from: e */
    public final Single f214255e;

    public C2390sv(qre0 qre0Var, voi voiVar, Context context) {
        Single singleJust;
        this.f214251a = qre0Var;
        this.f214252b = voiVar;
        this.f214253c = context;
        n9r n9rVar = this.f214254d;
        this.f214255e = (n9rVar == null || (singleJust = Single.just(n9rVar)) == null) ? ((s5p) voiVar).m77302l().filter(C2315qv.f192846a).flatMap(new C2229ov(this, 1)).map(C2100lr.f136177i).firstOrError().map(new C2229ov(this, 0)).doOnSuccess(new C2270pv(this)) : singleJust;
    }

    /* JADX INFO: renamed from: a */
    public final Completable m79420a(j41 j41Var) {
        return this.f214255e.flatMapCompletable(new C1952hr(4, this, j41Var));
    }

    /* JADX INFO: renamed from: b */
    public final Completable m79421b(igw0 igw0Var) {
        return this.f214255e.flatMapCompletable(new C1952hr(5, this, igw0Var));
    }
}

package p204p;

import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;

/* JADX INFO: loaded from: classes9.dex */
public final class xx41 implements p8p0 {

    /* JADX INFO: renamed from: a */
    public final hrw f266857a;

    /* JADX INFO: renamed from: b */
    public final dy41 f266858b;

    public xx41(hrw hrwVar, dy41 dy41Var) {
        this.f266857a = hrwVar;
        this.f266858b = dy41Var;
    }

    @Override // p204p.p8p0
    /* JADX INFO: renamed from: a */
    public final Single mo48412a(h8p0 h8p0Var) {
        return new CompletableFromAction(new yf41(2, h8p0Var, this)).m23294e(this.f266857a.mo48412a(h8p0Var));
    }
}

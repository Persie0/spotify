package p204p;

import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: classes.dex */
public final class gvk {

    /* JADX INFO: renamed from: a */
    public final m0c1 f84773a;

    /* JADX INFO: renamed from: b */
    public final n6t0 f84774b = new n6t0();

    /* JADX INFO: renamed from: c */
    public Disposable f84775c;

    public gvk(m0c1 m0c1Var) {
        this.f84773a = m0c1Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m45895a() {
        Disposable disposable = this.f84775c;
        return (disposable == null || disposable.isDisposed()) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final void m45896b(h0c1 h0c1Var) {
        this.f84774b.accept(this.f84773a.m60463d(h0c1Var));
    }
}

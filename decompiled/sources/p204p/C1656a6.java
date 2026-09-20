package p204p;

/* JADX INFO: renamed from: p.a6 */
/* JADX INFO: loaded from: classes4.dex */
public final class C1656a6 extends AbstractRunnableC1730c6 {
    @Override // p204p.AbstractRunnableC1730c6
    /* JADX INFO: renamed from: A */
    public final Object mo24824A(Object obj, Throwable th) {
        hm6 hm6Var = (hm6) obj;
        u790 u790VarApply = hm6Var.apply(th);
        c95.m31849o("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", u790VarApply, hm6Var);
        return u790VarApply;
    }

    @Override // p204p.AbstractRunnableC1730c6
    /* JADX INFO: renamed from: B */
    public final void mo24825B(Object obj) {
        m28332w((u790) obj);
    }
}

package p204p;

/* JADX INFO: renamed from: p.w9 */
/* JADX INFO: loaded from: classes4.dex */
public final class C2525w9 extends AbstractRunnableC2605y9 {
    @Override // p204p.AbstractRunnableC2605y9
    /* JADX INFO: renamed from: A */
    public final Object mo87478A(Object obj, Object obj2) {
        hm6 hm6Var = (hm6) obj;
        u790 u790VarApply = hm6Var.apply(obj2);
        c95.m31849o("AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", u790VarApply, hm6Var);
        return u790VarApply;
    }

    @Override // p204p.AbstractRunnableC2605y9
    /* JADX INFO: renamed from: B */
    public final void mo87479B(Object obj) {
        m28332w((u790) obj);
    }
}

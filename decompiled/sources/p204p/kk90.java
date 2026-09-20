package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class kk90 implements i7t0 {

    /* JADX INFO: renamed from: a */
    public final ck90 f123544a;

    public kk90(ck90 ck90Var) {
        this.f123544a = ck90Var;
    }

    @Override // p204p.i7t0
    public final void subscribe(ft51 ft51Var) {
        ft51Var.onSubscribe(new ik90(ft51Var, this.f123544a));
    }
}

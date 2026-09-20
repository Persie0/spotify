package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class lk90 implements i7t0 {

    /* JADX INFO: renamed from: a */
    public final hc80 f134292a;

    /* JADX INFO: renamed from: b */
    public final ck90 f134293b;

    public lk90(hc80 hc80Var, ck90 ck90Var) {
        this.f134292a = hc80Var;
        this.f134293b = ck90Var;
    }

    @Override // p204p.i7t0
    public final void subscribe(ft51 ft51Var) {
        ft51Var.onSubscribe(new jk90(ft51Var, this.f134292a, this.f134293b));
    }
}

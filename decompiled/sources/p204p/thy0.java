package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class thy0 implements hc80 {

    /* JADX INFO: renamed from: a */
    public final hc80 f220517a;

    /* JADX INFO: renamed from: b */
    public final oc80 f220518b;

    /* JADX INFO: renamed from: c */
    public final ne2 f220519c;

    public thy0(hc80 hc80Var) {
        this.f220517a = hc80Var;
        oc80 oc80Var = new oc80(this, true);
        this.f220518b = oc80Var;
        ne2 ne2Var = new ne2(this, 17);
        this.f220519c = ne2Var;
        oc80Var.m66678i(hc80Var.getLifecycle().mo31987b());
        hc80Var.getLifecycle().mo31986a(ne2Var);
    }

    @Override // p204p.hc80
    public final gb80 getLifecycle() {
        return this.f220518b;
    }
}

package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class wbc0 implements eoe0 {

    /* JADX INFO: renamed from: a */
    public eoe0[] f249732a;

    @Override // p204p.eoe0
    /* JADX INFO: renamed from: a */
    public final bbu0 mo39566a(Class cls) {
        for (eoe0 eoe0Var : this.f249732a) {
            if (eoe0Var.mo39567b(cls)) {
                return eoe0Var.mo39566a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p204p.eoe0
    /* JADX INFO: renamed from: b */
    public final boolean mo39567b(Class cls) {
        for (eoe0 eoe0Var : this.f249732a) {
            if (eoe0Var.mo39567b(cls)) {
                return true;
            }
        }
        return false;
    }
}

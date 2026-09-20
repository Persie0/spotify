package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class xbc0 implements foe0 {

    /* JADX INFO: renamed from: a */
    public foe0[] f259885a;

    @Override // p204p.foe0
    /* JADX INFO: renamed from: a */
    public final cbu0 mo42273a(Class cls) {
        for (foe0 foe0Var : this.f259885a) {
            if (foe0Var.mo42274b(cls)) {
                return foe0Var.mo42273a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p204p.foe0
    /* JADX INFO: renamed from: b */
    public final boolean mo42274b(Class cls) {
        for (foe0 foe0Var : this.f259885a) {
            if (foe0Var.mo42274b(cls)) {
                return true;
            }
        }
        return false;
    }
}

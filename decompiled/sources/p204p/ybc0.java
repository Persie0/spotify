package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class ybc0 implements goe0 {

    /* JADX INFO: renamed from: a */
    public goe0[] f271154a;

    @Override // p204p.goe0
    /* JADX INFO: renamed from: a */
    public final doe0 mo45339a(Class cls) {
        for (goe0 goe0Var : this.f271154a) {
            if (goe0Var.mo45340b(cls)) {
                return goe0Var.mo45339a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p204p.goe0
    /* JADX INFO: renamed from: b */
    public final boolean mo45340b(Class cls) {
        for (goe0 goe0Var : this.f271154a) {
            if (goe0Var.mo45340b(cls)) {
                return true;
            }
        }
        return false;
    }
}

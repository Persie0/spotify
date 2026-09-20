package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class zbc0 implements hoe0 {

    /* JADX INFO: renamed from: a */
    public hoe0[] f281296a;

    @Override // p204p.hoe0
    /* JADX INFO: renamed from: a */
    public final ebu0 mo48028a(Class cls) {
        for (hoe0 hoe0Var : this.f281296a) {
            if (hoe0Var.mo48029b(cls)) {
                return hoe0Var.mo48028a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // p204p.hoe0
    /* JADX INFO: renamed from: b */
    public final boolean mo48029b(Class cls) {
        for (hoe0 hoe0Var : this.f281296a) {
            if (hoe0Var.mo48029b(cls)) {
                return true;
            }
        }
        return false;
    }
}

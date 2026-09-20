package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class bb8 implements yob {

    /* JADX INFO: renamed from: a */
    public final ab8[] f25471a;

    public bb8(ab8[] ab8VarArr) {
        this.f25471a = ab8VarArr;
    }

    @Override // p204p.yob
    /* JADX INFO: renamed from: a */
    public final void mo28626a(Throwable th) {
        m28627b();
    }

    /* JADX INFO: renamed from: b */
    public final void m28627b() {
        for (ab8 ab8Var : this.f25471a) {
            hwr hwrVar = ab8Var.f14041f;
            if (hwrVar == null) {
                wj50.m88260d0("handle");
                throw null;
            }
            hwrVar.dispose();
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f25471a + ']';
    }
}

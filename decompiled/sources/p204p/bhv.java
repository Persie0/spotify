package p204p;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bhv extends yc11 {
    /* JADX INFO: renamed from: d */
    public abstract void mo29266d(fa00 fa00Var, Object obj);

    /* JADX INFO: renamed from: e */
    public final void m29267e(Object obj) {
        fa00 fa00VarM93329a = m93329a();
        try {
            mo29266d(fa00VarM93329a, obj);
            fa00VarM93329a.f67402b.executeInsert();
        } finally {
            m93330c(fa00VarM93329a);
        }
    }
}

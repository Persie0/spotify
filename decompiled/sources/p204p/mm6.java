package p204p;

/* JADX INFO: loaded from: classes.dex */
public final class mm6 {

    /* JADX INFO: renamed from: a */
    public static final mm6 f145055a = new mm6();

    /* JADX INFO: renamed from: a */
    public final boolean m62266a(Object obj, Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj instanceof vb40) || !(obj2 instanceof vb40)) {
            return wj50.m88271j(obj, obj2);
        }
        vb40 vb40Var = (vb40) obj;
        vb40 vb40Var2 = (vb40) obj2;
        return wj50.m88271j(vb40Var.f239399a, vb40Var2.f239399a) && vb40Var.f239400b.equals(vb40Var2.f239400b) && vb40Var.f239403e.equals(vb40Var2.f239403e) && wj50.m88271j(vb40Var.f239414p, vb40Var2.f239414p) && vb40Var.f239415q == vb40Var2.f239415q && vb40Var.f239416r == vb40Var2.f239416r;
    }

    /* JADX INFO: renamed from: b */
    public final int m62267b(Object obj) {
        if (!(obj instanceof vb40)) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }
        vb40 vb40Var = (vb40) obj;
        return edb.m38547C(vb40Var.f239416r) + ((vb40Var.f239415q.hashCode() + ((vb40Var.f239414p.hashCode() + edb.m38557f(dq60.m36604d(vb40Var.f239399a.hashCode() * 31, 961, vb40Var.f239400b), 961, vb40Var.f239403e)) * 31)) * 31);
    }

    public final String toString() {
        return "AsyncImageModelEqualityDelegate.Default";
    }
}

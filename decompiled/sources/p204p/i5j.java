package p204p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class i5j {

    /* JADX INFO: renamed from: a */
    public final Object f98976a;

    public i5j(Object obj) {
        this.f98976a = obj;
    }

    /* JADX INFO: renamed from: a */
    public abstract gd70 mo26195a(mxh0 mxh0Var);

    /* JADX INFO: renamed from: b */
    public Object mo41683b() {
        return this.f98976a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objMo41683b = mo41683b();
        i5j i5jVar = obj instanceof i5j ? (i5j) obj : null;
        return wj50.m88271j(objMo41683b, i5jVar != null ? i5jVar.mo41683b() : null);
    }

    public final int hashCode() {
        Object objMo41683b = mo41683b();
        if (objMo41683b != null) {
            return objMo41683b.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(mo41683b());
    }
}

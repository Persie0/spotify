package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class vt80 {

    /* JADX INFO: renamed from: a */
    public final String f244570a;

    /* JADX INFO: renamed from: b */
    public final st80 f244571b;

    public vt80(String str, st80 st80Var) {
        this.f244570a = str;
        this.f244571b = st80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt80)) {
            return false;
        }
        vt80 vt80Var = (vt80) obj;
        return wj50.m88271j(this.f244570a, vt80Var.f244570a) && wj50.m88271j(this.f244571b, vt80Var.f244571b);
    }

    public final int hashCode() {
        return this.f244571b.hashCode() + (this.f244570a.hashCode() * 31);
    }
}

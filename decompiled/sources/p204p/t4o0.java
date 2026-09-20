package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class t4o0 {

    /* JADX INFO: renamed from: a */
    public final nnc f217052a;

    /* JADX INFO: renamed from: b */
    public final xv41 f217053b;

    public t4o0(nnc nncVar, xv41 xv41Var) {
        this.f217052a = nncVar;
        this.f217053b = xv41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4o0)) {
            return false;
        }
        t4o0 t4o0Var = (t4o0) obj;
        return this.f217052a.equals(t4o0Var.f217052a) && wj50.m88271j(this.f217053b, t4o0Var.f217053b);
    }

    public final int hashCode() {
        return this.f217053b.hashCode() + (this.f217052a.hashCode() * 31);
    }
}

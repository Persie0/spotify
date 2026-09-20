package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class h5i0 {

    /* JADX INFO: renamed from: a */
    public final String f87854a;

    /* JADX INFO: renamed from: b */
    public final ig40 f87855b;

    /* JADX INFO: renamed from: c */
    public final qf40 f87856c;

    /* JADX INFO: renamed from: d */
    public final int f87857d;

    public h5i0(String str, ig40 ig40Var, qf40 qf40Var) {
        this.f87854a = str;
        this.f87855b = ig40Var;
        this.f87856c = qf40Var;
        this.f87857d = ig40Var.size() - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5i0)) {
            return false;
        }
        h5i0 h5i0Var = (h5i0) obj;
        return wj50.m88271j(this.f87854a, h5i0Var.f87854a) && wj50.m88271j(this.f87855b, h5i0Var.f87855b) && wj50.m88271j(this.f87856c, h5i0Var.f87856c);
    }

    public final int hashCode() {
        return this.f87856c.hashCode() + ((this.f87855b.hashCode() + (this.f87854a.hashCode() * 31)) * 31);
    }
}

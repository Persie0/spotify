package p204p;

/* JADX INFO: loaded from: classes9.dex */
public final class hg20 extends q2m0 {

    /* JADX INFO: renamed from: b */
    public final String f91002b;

    /* JADX INFO: renamed from: c */
    public final m1b f91003c;

    /* JADX INFO: renamed from: d */
    public final int f91004d;

    /* JADX INFO: renamed from: e */
    public final jsa0 f91005e;

    public hg20(String str, m1b m1bVar, int i, jsa0 jsa0Var) {
        super(3);
        this.f91002b = str;
        this.f91003c = m1bVar;
        this.f91004d = i;
        this.f91005e = jsa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg20)) {
            return false;
        }
        hg20 hg20Var = (hg20) obj;
        return wj50.m88271j(this.f91002b, hg20Var.f91002b) && this.f91003c.equals(hg20Var.f91003c) && this.f91004d == hg20Var.f91004d && this.f91005e.equals(hg20Var.f91005e);
    }

    public final int hashCode() {
        String str = this.f91002b;
        return this.f91005e.hashCode() + f710.m40938f(this.f91004d, (this.f91003c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31);
    }
}

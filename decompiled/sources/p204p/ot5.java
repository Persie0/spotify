package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class ot5 {

    /* JADX INFO: renamed from: a */
    public final String f168975a;

    /* JADX INFO: renamed from: b */
    public final qf40 f168976b;

    public ot5(String str, qf40 qf40Var) {
        this.f168975a = str;
        this.f168976b = qf40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot5)) {
            return false;
        }
        ot5 ot5Var = (ot5) obj;
        return wj50.m88271j(this.f168975a, ot5Var.f168975a) && wj50.m88271j(this.f168976b, ot5Var.f168976b);
    }

    public final int hashCode() {
        return this.f168976b.hashCode() + (this.f168975a.hashCode() * 31);
    }
}

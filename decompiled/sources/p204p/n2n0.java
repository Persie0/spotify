package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class n2n0 {

    /* JADX INFO: renamed from: a */
    public final bl2 f149801a;

    /* JADX INFO: renamed from: b */
    public final zk2 f149802b;

    /* JADX INFO: renamed from: c */
    public final String f149803c;

    public n2n0(bl2 bl2Var, zk2 zk2Var, String str) {
        this.f149801a = bl2Var;
        this.f149802b = zk2Var;
        this.f149803c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2n0)) {
            return false;
        }
        n2n0 n2n0Var = (n2n0) obj;
        return this.f149801a == n2n0Var.f149801a && wj50.m88271j(this.f149802b, n2n0Var.f149802b) && wj50.m88271j(this.f149803c, n2n0Var.f149803c);
    }

    public final int hashCode() {
        return this.f149803c.hashCode() + ((this.f149802b.hashCode() + (this.f149801a.hashCode() * 31)) * 31);
    }
}

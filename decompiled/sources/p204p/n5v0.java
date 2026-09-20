package p204p;

/* JADX INFO: loaded from: classes10.dex */
public final class n5v0 extends gwg1 {

    /* JADX INFO: renamed from: b */
    public final String f150626b;

    /* JADX INFO: renamed from: c */
    public final d850 f150627c;

    public n5v0(String str, d850 d850Var) {
        this.f150626b = str;
        this.f150627c = d850Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5v0)) {
            return false;
        }
        n5v0 n5v0Var = (n5v0) obj;
        return wj50.m88271j(this.f150626b, n5v0Var.f150626b) && wj50.m88271j(this.f150627c, n5v0Var.f150627c);
    }

    public final int hashCode() {
        return this.f150627c.hashCode() + (this.f150626b.hashCode() * 31);
    }
}

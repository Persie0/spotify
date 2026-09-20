package p204p;

/* JADX INFO: loaded from: classes6.dex */
public final class bbx0 implements cbx0 {

    /* JADX INFO: renamed from: a */
    public final eq31 f25674a;

    /* JADX INFO: renamed from: b */
    public final String f25675b;

    public bbx0(String str, eq31 eq31Var) {
        this.f25674a = eq31Var;
        this.f25675b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbx0)) {
            return false;
        }
        bbx0 bbx0Var = (bbx0) obj;
        return wj50.m88271j(this.f25674a, bbx0Var.f25674a) && wj50.m88271j(this.f25675b, bbx0Var.f25675b);
    }

    public final int hashCode() {
        return this.f25675b.hashCode() + (this.f25674a.hashCode() * 31);
    }
}

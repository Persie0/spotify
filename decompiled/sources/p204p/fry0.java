package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class fry0 implements hry0 {

    /* JADX INFO: renamed from: a */
    public final n0z0 f72682a;

    /* JADX INFO: renamed from: b */
    public final String f72683b;

    public fry0(n0z0 n0z0Var, String str) {
        this.f72682a = n0z0Var;
        this.f72683b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fry0)) {
            return false;
        }
        fry0 fry0Var = (fry0) obj;
        return wj50.m88271j(this.f72682a, fry0Var.f72682a) && wj50.m88271j(this.f72683b, fry0Var.f72683b);
    }

    public final int hashCode() {
        return this.f72683b.hashCode() + (this.f72682a.hashCode() * 31);
    }
}

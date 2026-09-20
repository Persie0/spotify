package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class qs50 implements rs50 {

    /* JADX INFO: renamed from: a */
    public final pv00 f191995a;

    /* JADX INFO: renamed from: b */
    public final ctj f191996b;

    public qs50(pv00 pv00Var, ctj ctjVar) {
        this.f191995a = pv00Var;
        this.f191996b = ctjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs50)) {
            return false;
        }
        qs50 qs50Var = (qs50) obj;
        return wj50.m88271j(this.f191995a, qs50Var.f191995a) && wj50.m88271j(this.f191996b, qs50Var.f191996b);
    }

    public final int hashCode() {
        return this.f191996b.hashCode() + (this.f191995a.hashCode() * 31);
    }
}

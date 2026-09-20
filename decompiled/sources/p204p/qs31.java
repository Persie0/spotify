package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class qs31 {

    /* JADX INFO: renamed from: a */
    public final wr31 f191979a;

    /* JADX INFO: renamed from: b */
    public final xi3 f191980b;

    /* JADX INFO: renamed from: c */
    public final boolean f191981c;

    public qs31(wr31 wr31Var, xi3 xi3Var, boolean z) {
        this.f191979a = wr31Var;
        this.f191980b = xi3Var;
        this.f191981c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qs31)) {
            return false;
        }
        qs31 qs31Var = (qs31) obj;
        return this.f191979a == qs31Var.f191979a && this.f191980b == qs31Var.f191980b && this.f191981c == qs31Var.f191981c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f191981c) + ((this.f191980b.hashCode() + (this.f191979a.hashCode() * 31)) * 31);
    }
}

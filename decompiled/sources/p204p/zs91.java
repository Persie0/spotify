package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class zs91 {

    /* JADX INFO: renamed from: a */
    public final t1h1 f285893a;

    /* JADX INFO: renamed from: b */
    public final bpn0 f285894b;

    public zs91(t1h1 t1h1Var, bpn0 bpn0Var) {
        this.f285893a = t1h1Var;
        this.f285894b = bpn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zs91)) {
            return false;
        }
        zs91 zs91Var = (zs91) obj;
        return wj50.m88271j(this.f285893a, zs91Var.f285893a) && wj50.m88271j(this.f285894b, zs91Var.f285894b);
    }

    public final int hashCode() {
        int iHashCode = this.f285893a.hashCode() * 31;
        bpn0 bpn0Var = this.f285894b;
        return iHashCode + (bpn0Var == null ? 0 : bpn0Var.hashCode());
    }
}

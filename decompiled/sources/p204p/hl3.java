package p204p;

/* JADX INFO: loaded from: classes3.dex */
public final class hl3 {

    /* JADX INFO: renamed from: a */
    public final int f92598a;

    /* JADX INFO: renamed from: b */
    public final n0z0 f92599b;

    public hl3(int i, n0z0 n0z0Var) {
        this.f92598a = i;
        this.f92599b = n0z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl3)) {
            return false;
        }
        hl3 hl3Var = (hl3) obj;
        return this.f92598a == hl3Var.f92598a && wj50.m88271j(this.f92599b, hl3Var.f92599b);
    }

    public final int hashCode() {
        return this.f92599b.hashCode() + (Integer.hashCode(this.f92598a) * 31);
    }
}

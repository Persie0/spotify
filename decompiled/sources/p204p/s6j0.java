package p204p;

/* JADX INFO: loaded from: classes2.dex */
public final class s6j0 {

    /* JADX INFO: renamed from: a */
    public final kbm0 f206132a;

    /* JADX INFO: renamed from: b */
    public final r6j0 f206133b;

    /* JADX INFO: renamed from: c */
    public final ifm0 f206134c;

    /* JADX INFO: renamed from: d */
    public final boolean f206135d;

    public s6j0(kbm0 kbm0Var, r6j0 r6j0Var, ifm0 ifm0Var, boolean z) {
        this.f206132a = kbm0Var;
        this.f206133b = r6j0Var;
        this.f206134c = ifm0Var;
        this.f206135d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6j0)) {
            return false;
        }
        s6j0 s6j0Var = (s6j0) obj;
        return wj50.m88271j(this.f206132a, s6j0Var.f206132a) && wj50.m88271j(this.f206133b, s6j0Var.f206133b) && wj50.m88271j(this.f206134c, s6j0Var.f206134c) && this.f206135d == s6j0Var.f206135d;
    }

    public final int hashCode() {
        kbm0 kbm0Var = this.f206132a;
        int iHashCode = (this.f206133b.hashCode() + ((kbm0Var == null ? 0 : kbm0Var.f121231a.hashCode()) * 31)) * 31;
        ifm0 ifm0Var = this.f206134c;
        return Boolean.hashCode(this.f206135d) + ((iHashCode + (ifm0Var != null ? ifm0Var.hashCode() : 0)) * 31);
    }

    public /* synthetic */ s6j0(kbm0 kbm0Var, r6j0 r6j0Var, boolean z, int i) {
        this(kbm0Var, r6j0Var, (ifm0) null, (i & 8) != 0 ? false : z);
    }
}

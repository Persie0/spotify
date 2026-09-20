package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class t3c0 {

    /* JADX INFO: renamed from: a */
    public final l3c0 f216742a;

    /* JADX INFO: renamed from: b */
    public final Boolean f216743b;

    /* JADX INFO: renamed from: c */
    public final Boolean f216744c;

    /* JADX INFO: renamed from: d */
    public final boolean f216745d;

    public t3c0(l3c0 l3c0Var, Boolean bool, Boolean bool2, boolean z) {
        this.f216742a = l3c0Var;
        this.f216743b = bool;
        this.f216744c = bool2;
        this.f216745d = z;
    }

    /* JADX INFO: renamed from: a */
    public static t3c0 m79984a(t3c0 t3c0Var, Boolean bool, Boolean bool2, int i) {
        l3c0 l3c0Var = t3c0Var.f216742a;
        if ((i & 2) != 0) {
            bool = t3c0Var.f216743b;
        }
        if ((i & 4) != 0) {
            bool2 = t3c0Var.f216744c;
        }
        boolean z = t3c0Var.f216745d;
        t3c0Var.getClass();
        return new t3c0(l3c0Var, bool, bool2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3c0)) {
            return false;
        }
        t3c0 t3c0Var = (t3c0) obj;
        return wj50.m88271j(this.f216742a, t3c0Var.f216742a) && wj50.m88271j(this.f216743b, t3c0Var.f216743b) && wj50.m88271j(this.f216744c, t3c0Var.f216744c) && this.f216745d == t3c0Var.f216745d;
    }

    public final int hashCode() {
        l3c0 l3c0Var = this.f216742a;
        int iHashCode = (l3c0Var == null ? 0 : Boolean.hashCode(l3c0Var.f129290a)) * 31;
        Boolean bool = this.f216743b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f216744c;
        return Boolean.hashCode(this.f216745d) + ((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31);
    }
}

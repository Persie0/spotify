package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class u3i0 {

    /* JADX INFO: renamed from: a */
    public final boolean f226392a;

    /* JADX INFO: renamed from: b */
    public final String f226393b;

    /* JADX INFO: renamed from: c */
    public final l3i0 f226394c;

    public u3i0(boolean z, String str, l3i0 l3i0Var) {
        this.f226392a = z;
        this.f226393b = str;
        this.f226394c = l3i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u3i0)) {
            return false;
        }
        u3i0 u3i0Var = (u3i0) obj;
        return this.f226392a == u3i0Var.f226392a && wj50.m88271j(this.f226393b, u3i0Var.f226393b) && wj50.m88271j(this.f226394c, u3i0Var.f226394c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f226392a) * 31;
        String str = this.f226393b;
        return this.f226394c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ u3i0(int i) {
        l3i0 l3i0Var;
        if ((i & 4) != 0) {
            l3i0Var = k3i0.f118918a;
        } else {
            l3i0Var = h3i0.f87242a;
        }
        this(false, null, l3i0Var);
    }
}

package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class zj60 {

    /* JADX INFO: renamed from: a */
    public final String f283374a;

    /* JADX INFO: renamed from: b */
    public final c3n0 f283375b;

    /* JADX INFO: renamed from: c */
    public final dx30 f283376c;

    public zj60(String str, c3n0 c3n0Var, dx30 dx30Var) {
        this.f283374a = str;
        this.f283375b = c3n0Var;
        this.f283376c = dx30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zj60)) {
            return false;
        }
        zj60 zj60Var = (zj60) obj;
        return wj50.m88271j(this.f283374a, zj60Var.f283374a) && wj50.m88271j(this.f283375b, zj60Var.f283375b) && wj50.m88271j(this.f283376c, zj60Var.f283376c);
    }

    public final int hashCode() {
        return this.f283376c.hashCode() + ((this.f283375b.hashCode() + (this.f283374a.hashCode() * 31)) * 31);
    }
}

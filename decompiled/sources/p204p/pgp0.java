package p204p;

/* JADX INFO: loaded from: classes7.dex */
public final class pgp0 {

    /* JADX INFO: renamed from: a */
    public final String f177379a;

    /* JADX INFO: renamed from: b */
    public final lnn0 f177380b;

    /* JADX INFO: renamed from: c */
    public final String f177381c;

    public pgp0(String str, lnn0 lnn0Var, String str2) {
        this.f177379a = str;
        this.f177380b = lnn0Var;
        this.f177381c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pgp0)) {
            return false;
        }
        pgp0 pgp0Var = (pgp0) obj;
        return wj50.m88271j(this.f177379a, pgp0Var.f177379a) && this.f177380b == pgp0Var.f177380b && wj50.m88271j(this.f177381c, pgp0Var.f177381c);
    }

    public final int hashCode() {
        int iHashCode = (this.f177380b.hashCode() + (this.f177379a.hashCode() * 31)) * 31;
        String str = this.f177381c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

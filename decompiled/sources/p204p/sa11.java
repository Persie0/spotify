package p204p;

/* JADX INFO: loaded from: classes5.dex */
public final class sa11 {

    /* JADX INFO: renamed from: a */
    public final pla1 f207106a;

    /* JADX INFO: renamed from: b */
    public final String f207107b;

    public sa11(String str, pla1 pla1Var) {
        this.f207106a = pla1Var;
        this.f207107b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa11)) {
            return false;
        }
        sa11 sa11Var = (sa11) obj;
        return wj50.m88271j(this.f207106a, sa11Var.f207106a) && wj50.m88271j(this.f207107b, sa11Var.f207107b);
    }

    public final int hashCode() {
        return this.f207107b.hashCode() + (this.f207106a.hashCode() * 31);
    }
}

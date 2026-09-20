package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class f970 {

    /* JADX INFO: renamed from: c */
    public static final f970 f67186c = new f970(0, null);

    /* JADX INFO: renamed from: a */
    public final int f67187a;

    /* JADX INFO: renamed from: b */
    public final a970 f67188b;

    public f970(int i, a970 a970Var) {
        this.f67187a = i;
        this.f67188b = a970Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f970)) {
            return false;
        }
        f970 f970Var = (f970) obj;
        return this.f67187a == f970Var.f67187a && wj50.m88271j(this.f67188b, f970Var.f67188b);
    }

    public final int hashCode() {
        int i = this.f67187a;
        int iM38547C = (i == 0 ? 0 : edb.m38547C(i)) * 31;
        a970 a970Var = this.f67188b;
        return iM38547C + (a970Var != null ? a970Var.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("KmTypeProjection(variance=");
        int i = this.f67187a;
        if (i == 1) {
            str = "INVARIANT";
        } else if (i != 2) {
            str = i != 3 ? "null" : "OUT";
        } else {
            str = "IN";
        }
        sb.append(str);
        sb.append(", type=");
        sb.append(this.f67188b);
        sb.append(')');
        return sb.toString();
    }
}

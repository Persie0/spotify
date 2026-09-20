package p204p;

/* JADX INFO: loaded from: classes11.dex */
public final class s870 {

    /* JADX INFO: renamed from: a */
    public a970 f206593a;

    /* JADX INFO: renamed from: b */
    public String f206594b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s870)) {
            return false;
        }
        s870 s870Var = (s870) obj;
        return wj50.m88271j(this.f206593a, s870Var.f206593a) && wj50.m88271j(this.f206594b, s870Var.f206594b);
    }

    public final int hashCode() {
        int iHashCode = this.f206593a.hashCode() * 31;
        String str = this.f206594b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f206593a);
        sb.append(", typeFlexibilityId=");
        return dq60.m36617q(sb, this.f206594b, ')');
    }
}
